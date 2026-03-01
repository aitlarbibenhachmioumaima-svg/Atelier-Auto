package entities;

public class Vehicule {

    private int id;
    private String immatriculation;
    private String marque;
    private String modele;
     
    private int clientId;

    public Vehicule() {
    }

    public Vehicule(int id, String immatriculation, String marque, String modele, String type, int clientId) {
        this.id = id;
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
     
        this.clientId = clientId;
    }



    public int getId() {
        return id;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {   
        return modele;
    }

  

    public int getClientId() {
        return clientId;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {   
        this.modele = modele;
    }

  

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
}