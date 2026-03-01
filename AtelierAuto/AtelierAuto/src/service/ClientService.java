package service;

import dao.ClientDao;
import entities.Client;
import java.util.List;

public class ClientService {

    private ClientDao dao = new ClientDao();

    public void create(Client c) throws Exception {
        if (c.getNom().isEmpty())
            throw new Exception("Nom obligatoire");

        dao.create(c);
    }

    public void modifier(Client c) throws Exception {
        if (c.getNom().isEmpty())
            throw new Exception("Nom obligatoire");

        dao.update(c);
    }

    public void supprimer(int id) throws Exception {
        dao.delete(id);
    }

    public List<Client> findAll() throws Exception {
        return dao.findAll();
    }
}