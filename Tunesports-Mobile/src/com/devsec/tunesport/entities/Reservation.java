package com.devsec.tunesport.entities;

import java.util.Date;

public class Reservation {
    private int idRes ;
    private int idCli ;
    private int idCoach;
    private Date dateRes;
    private String dispoRes;
    private double prixRes ;

//***********************************************************Constructors*********************************

    public Reservation() {
    }

    public Reservation(Date dateRes, String dispoRes, double prixRes) {
        this.dateRes = dateRes;
        this.dispoRes = dispoRes;
        this.prixRes = prixRes;
    }

    public Reservation(int idRes, Date dateRes, String dispoRes, double prixRes) {
        this.idRes = idRes;
        this.dateRes = dateRes;
        this.dispoRes = dispoRes;
        this.prixRes = prixRes;
    }

    public Reservation(int idRes) {
        this.idRes = idRes;
    }

    //***********************************************Getters&Setters**********************************************

    public int getIdRes() {
        return idRes;
    }

    public void setIdRes(int idRes) {
        this.idRes = idRes;
    }

    public Date getDateRes() {
        return dateRes;
    }

    public void setDateRes(Date dateRes) {
        this.dateRes = dateRes;
    }

    public double getPrixRes() {
        return prixRes;
    }

    public void setPrixRes(double prixRes) {
        this.prixRes = prixRes;
    }

    public String getDispoRes() {
        return dispoRes;
    }

    public void setDispoRes(String dispoRes) {
        this.dispoRes= dispoRes;
    }

//***********************************************ToString = afficher **********************************************

    @Override
    public String toString() {
        return "Reservation{" +
                "idRes=" + idRes +
                ", dateRes='" + dateRes +
                ", dispoRes=" + dispoRes +
                ", prixRes=" + prixRes +
                '}';
    }
}