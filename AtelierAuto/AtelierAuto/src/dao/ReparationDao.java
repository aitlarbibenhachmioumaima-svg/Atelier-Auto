package dao;

import entities.Reparation;
import entities.Vehicule;
import util.Connexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReparationDao implements IDao<Reparation> {
private Connection connexion;
public ReparationDao() {
    try {
        connexion = Connexion.getConnection();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    @Override
    public void create(Reparation r) throws Exception {

        String sql = "INSERT INTO Reparation(vehicule_id, date, type, cout) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = Connexion.getConnection().prepareStatement(sql);
        ps.setInt(1, r.getVehiculeId());
        ps.setDate(2, Date.valueOf(r.getDate()));
        ps.setString(3, r.getType());
        ps.setDouble(4, r.getCout());

        ps.executeUpdate();
    }

    @Override
    public void update(Reparation r) throws Exception {

        String sql = "UPDATE Reparation SET vehicule_id=?, date=?, type=?, cout=? WHERE id=?";

        PreparedStatement ps =Connexion.getConnection().prepareStatement(sql);
        ps.setInt(1, r.getVehiculeId());
        ps.setDate(2, Date.valueOf(r.getDate()));
        ps.setString(3, r.getType());
        ps.setDouble(4, r.getCout());
        ps.setInt(5, r.getId());

        ps.executeUpdate();
    }

    @Override
    public void delete(int id) throws Exception {

        String sql = "DELETE FROM Reparation WHERE id=?";

        PreparedStatement ps = Connexion.getConnection().prepareStatement(sql);
        ps.setInt(1, id);

        ps.executeUpdate();
    }

    @Override
    public Reparation findById(int id) throws Exception {

        String sql = "SELECT * FROM Reparation WHERE id=?";
        PreparedStatement ps = Connexion.getConnection().prepareStatement(sql);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            Reparation r = new Reparation();
            r.setId(rs.getInt("id"));
            r.setVehiculeId(rs.getInt("vehicule_id"));
            r.setDate(rs.getDate("date").toLocalDate());
            r.setType(rs.getString("type"));
            r.setCout(rs.getDouble("cout"));

            return r;
        }

        return null;
    }

    @Override
    public List<Reparation> findAll() throws Exception {

        List<Reparation> list = new ArrayList<>();

        String sql = "SELECT * FROM Reparation";
        Statement st = Connexion.getConnection().createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            Reparation r = new Reparation();
            r.setId(rs.getInt("id"));
            r.setVehiculeId(rs.getInt("vehicule_id"));
            r.setDate(rs.getDate("date").toLocalDate());
            r.setType(rs.getString("type"));
            r.setCout(rs.getDouble("cout"));

            list.add(r);
        }

        return list;
    }
     public List<Reparation> findByType(String type) throws Exception {

    List<Reparation> liste = new ArrayList<>();

    String sql = "SELECT * FROM reparation WHERE type = ?";
    PreparedStatement ps = Connexion.getConnection().prepareStatement(sql);
    ps.setString(1, type);

    ResultSet rs = ps.executeQuery();

    while (rs.next()) {

        Reparation r = new Reparation();
        r.setId(rs.getInt("id"));
        r.setType(rs.getString("type"));
        r.setCout(rs.getDouble("cout"));
        r.setDate(rs.getDate("date").toLocalDate());
        r.setVehiculeId(rs.getInt("vehicule_id"));

        liste.add(r);
    }

    return liste;
}

public List<Object[]> gettotalcoutsmensuels() {
    List<Object[]> list = new ArrayList<>();

    String sql = "SELECT MONTH(date) AS mois, SUM(cout) AS total "
               + "FROM reparation "
               + "GROUP BY MONTH(date) "
               + "ORDER BY mois";

    try {
        Statement st = connexion.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            list.add(new Object[]{
                rs.getInt("mois"),
                rs.getDouble("total")
            });
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return list;
}
}