package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Auto {

    // Variables
    private String Marke;
    private int Leistung;
    private int KM_Stand;
    private int KM_Bis_Service;
    private int Tankanzeige;
    private double kosten = 0;
    private int gefahrene_KM = 0;

    // Constructor
    public Auto(String marke, int leistung, int KM_Stand, int KM_Bis_Service, int tankanzeigeInProzent) {
        Marke = marke;
        Leistung = leistung;
        this.KM_Stand = KM_Stand;
        this.KM_Bis_Service = KM_Bis_Service;
        Tankanzeige = tankanzeigeInProzent;
    }

    //Methods
    public void fahren(int KM_gefahren) {
        KM_Stand += KM_gefahren;
        KM_Bis_Service -= KM_gefahren;
        this.Tankanzeige -= KM_gefahren / 5;
        this.gefahrene_KM += KM_gefahren;

        if (KM_Bis_Service < 0) {
            Werkstatt carService = new Werkstatt();
            carService.service(Auto.this);
        }
        if (Tankanzeige < 0) {
            Tankstelle tankstelle = new Tankstelle();
            tankstelle.service(Auto.this);
        }
    }

    public void setKM_Bis_Service(int KM_Bis_Service) {
        this.KM_Bis_Service = KM_Bis_Service;
    }

    public void setKosten(double kosten) { this.kosten = kosten;
    }

    public double getkosten() {
        return kosten;
    }

    public int getTankanzeige() {
        return Tankanzeige;
    }

    public void setTankanzeige(int tankanzeige) {
        Tankanzeige = tankanzeige;
    }

    @Override
    public String toString() {
        return "Marke = '" + Marke + '\'' +
                ", Leistung = " + Leistung + "PS" +
                ", KM_Stand = " + KM_Stand + "KM" +
                ", KM_Bis_Service = " + KM_Bis_Service + "KM" +
                ", Tankanzeige = " + Tankanzeige + "%" +
                ", Kosten = " + kosten + "$" +
                " für " + gefahrene_KM + " gefahrene KM";
    }
}
