package service;

import dao.ReparationDao;
import entities.Reparation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.Connexion;

public class ReparationService {

    private ReparationDao dao = new ReparationDao();

    public void create(Reparation r) throws Exception {

        if(r.getCout() <= 0)
            throw new Exception("Le coût doit être supérieur à 0");

        if(r.getType().isEmpty())
            throw new Exception("Type obligatoire");

        dao.create(r);
    }

    public void modifier(Reparation r) throws Exception {
        dao.update(r);
    }

    public void supprimer(int id) throws Exception {
        dao.delete(id);
    }

    public List<Reparation> findAll() throws Exception {
        return dao.findAll();
    }
    public List<Reparation> findByType(String type) throws Exception {
    return dao.findByType(type);
}
  public List<Object[]> gettotalcoutsmensuels() {
    ReparationDao dao = new ReparationDao();
    return dao.gettotalcoutsmensuels();

}}

