package com.company;

public class Tankstelle extends ServiceForCarOwner {

    //Methods
    @Override
    public void service(Auto car) {
        int counter = 0;
        for (int i = car.getTankanzeige(); i < 0; i += 100) {
            car.setTankanzeige(car.getTankanzeige() + 100);
            car.setKosten(car.getkosten() + 80);
            counter++;
        }
        System.out.println("Auto wurde " + counter + " mal getankt und " + counter*80 + " $ abgebucht");
    }
}
