package com.company;

public class Werkstatt extends ServiceForCarOwner{

    // Methods
    @Override
    public void service(Auto car) {
        car.setKosten(car.getkosten() + 500);
        car.setKM_Bis_Service(5000);
        System.out.println("Auto wurde geserviced und 500$ abgebucht");
    }
}
