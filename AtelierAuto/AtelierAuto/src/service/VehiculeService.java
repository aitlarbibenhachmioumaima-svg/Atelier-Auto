package service;

import dao.VehiculeDao;
import entities.Vehicule;
import java.util.List;

public class VehiculeService {

    private VehiculeDao dao = new VehiculeDao();

    public void create(Vehicule v) throws Exception {

        if(v.getImmatriculation().isEmpty())
            throw new Exception("Immatriculation obligatoire");

        if(v.getMarque().isEmpty())
            throw new Exception("Marque obligatoire");

        dao.create(v);
    }

    public void modifier(Vehicule v) throws Exception {
        dao.update(v);
    }

    public void supprimer(int id) throws Exception {
        dao.delete(id);
    }

    public List<Vehicule> findAll() throws Exception {
        return dao.findAll();
    }
    public List<Vehicule> findByMarque(String marque) throws Exception {
    return dao.findByMarque(marque);
}


}