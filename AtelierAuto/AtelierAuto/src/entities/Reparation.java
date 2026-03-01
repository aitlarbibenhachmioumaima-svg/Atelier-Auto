package entities;

import java.time.LocalDate;

public class Reparation {

    private int id;
    private int vehiculeId;
    private LocalDate date;
    private String type;
    private double cout;

   

    public int getId() {
        return id;
    }

    public int getVehiculeId() {
        return vehiculeId;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public double getCout() {
        return cout;
    }

   

    public void setId(int id) {
        this.id = id;
    }

    public void setVehiculeId(int vehiculeId) {
        this.vehiculeId = vehiculeId;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }
}