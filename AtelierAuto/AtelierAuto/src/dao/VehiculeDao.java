package dao;

import entities.Vehicule;
import util.Connexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VehiculeDao implements IDao<Vehicule> {

    @Override
    public void create(Vehicule v) throws Exception {

        String sql = "INSERT INTO Vehicule(immatriculation, marque, modele, client_id) VALUES (?, ?, ?, ?)";

        PreparedStatement ps =Connexion.getConnection().prepareStatement(sql);
        ps.setString(1, v.getImmatriculation());
        ps.setString(2, v.getMarque());
        ps.setString(3, v.getModele());
        ps.setInt(4, v.getClientId());

        ps.executeUpdate();
    }

    @Override
    public void update(Vehicule v) throws Exception {

        String sql = "UPDATE Vehicule SET immatriculation=?, marque=?, modele=?, client_id=? WHERE id=?";

        PreparedStatement ps = Connexion.getConnection().prepareStatement(sql);
        ps.setString(1, v.getImmatriculation());
        ps.setString(2, v.getMarque());
        ps.setString(3, v.getModele());
        ps.setInt(4, v.getClientId());
        ps.setInt(5, v.getId());

        ps.executeUpdate();
    }

    @Override
    public void delete(int id) throws Exception {

        String sql = "DELETE FROM Vehicule WHERE id=?";

        PreparedStatement ps = Connexion.getConnection().prepareStatement(sql);
        ps.setInt(1, id);

        ps.executeUpdate();
    }

    @Override
    public Vehicule findById(int id) throws Exception {

        String sql = "SELECT * FROM Vehicule WHERE id=?";
        PreparedStatement ps = Connexion.getConnection().prepareStatement(sql);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            Vehicule v = new Vehicule();
            v.setId(rs.getInt("id"));
            v.setImmatriculation(rs.getString("immatriculation"));
            v.setMarque(rs.getString("marque"));
            v.setModele(rs.getString("modele"));
            v.setClientId(rs.getInt("client_id"));
            return v;
        }

        return null;
    }

    @Override
    public List<Vehicule> findAll() throws Exception {

        List<Vehicule> list = new ArrayList<>();

        String sql = "SELECT * FROM Vehicule";
        Statement st = Connexion.getConnection().createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            Vehicule v = new Vehicule();
            v.setId(rs.getInt("id"));
            v.setImmatriculation(rs.getString("immatriculation"));
            v.setMarque(rs.getString("marque"));
            v.setModele(rs.getString("modele"));
            v.setClientId(rs.getInt("client_id"));

            list.add(v);
        }

        return list;
    }
   public List<Vehicule> findByMarque(String marque) throws Exception {

    List<Vehicule> liste = new ArrayList<>();

    String sql = "SELECT * FROM vehicule WHERE marque = ?";

    PreparedStatement ps = Connexion.getConnection().prepareStatement(sql);
    ps.setString(1, marque);

    ResultSet rs = ps.executeQuery();

    while (rs.next()) {
        Vehicule v = new Vehicule();
        v.setId(rs.getInt("id"));
        v.setModele(rs.getString("modele"));
        v.setImmatriculation(rs.getString("immatriculation"));
      
       
        v.setClientId(rs.getInt("client_id"));
        liste.add(v);
    }

    return liste;
}

    
}