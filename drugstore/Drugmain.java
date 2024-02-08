package drugstore;

import drugstore.components.Azitronite;
import drugstore.components.Penicillin;
import drugstore.components.Water;

import java.util.ArrayList;
import java.util.List;

public class Drugmain {
    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("Penicillin", 1.6D, 6);

        Pharmacy p1 = new Pharmacy();
        p1.addComponents(water, azitronite);

        Pharmacy p2 = new Pharmacy();
        p2.addComponents(penicillin, water);

        Pharmacy p3 = new Pharmacy();
        p3.addComponents(azitronite, penicillin);

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(p1);
        pharmacies.add(p2);
        pharmacies.add(p3);

        System.out.println("Original Pharmacies:");
        for (Pharmacy pharmacy : pharmacies) {
            System.out.println(pharmacy);
        }

        System.out.println("\nSorted Pharmacies by Power:");
        Pharmacy.printSortedPharmacies(pharmacies);

        System.out.println("\nSorted Pharmacies by Weight:");
        Pharmacy.printSortedPharmaciesByWeight(pharmacies);
    }
}