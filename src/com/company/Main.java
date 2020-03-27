package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Aufgabe Auto & Tankstelle & Werkstatt Mathias Angerer

public class Main {

    public static void main(String[] args) throws IOException {

        // creating and emptying new file
        File myFile = new File("C:\\Users\\DCV\\Desktop\\AutoFile.txt");
        myFile.delete();

        // instances of cars
        Auto BMW = new Auto("BMW", 150, 50000, 5000, 50);
        Auto Opel = new Auto("Opel", 80, 180000, 10000, 20);
        Auto Audi = new Auto("Audi", 120, 22000, 3000, 86);

        // driving methods for cars
        BMW.fahren(1000);
        BMW.fahren(2560);
        Opel.fahren(200);
        BMW.fahren(1000);
        Audi.fahren(6000);

        // writing to file
        write(Opel.toString(), myFile);
        write(BMW.toString(), myFile);
        write(Audi.toString(), myFile);
    }

    // writing to file method
    public static void write (String text, File myFile) throws IOException {
        FileWriter myWriter = new FileWriter(myFile, true);
        myWriter.write(text);
        myWriter.write("\n");
        myWriter.flush();
        myWriter.close();
    }
}
