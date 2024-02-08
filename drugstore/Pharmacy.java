package drugstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy> {
    private List<Component> components = new ArrayList<>();
    private int index = 0;

    public void addComponents(Component... components) {
        for (Component c : components) {
            this.components.add(c);
        }
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }

    @Override
    public int compareTo(Pharmacy other) {
        int thisPower = components.stream().mapToInt(Component::getPower).sum();
        int otherPower = other.components.stream().mapToInt(Component::getPower).sum();
        int thisWeight = components.stream().mapToInt(Component::getWeight).sum();
        int otherWeight = other.components.stream().mapToInt(Component::getWeight).sum();

        // Сравнение сначала по power, затем по weight
        if (thisPower != otherPower) {
            return Integer.compare(thisPower, otherPower);
        } else {
            return Integer.compare(thisWeight, otherWeight);
        }
    }

    public static void printSortedPharmacies(List<Pharmacy> pharmacies) {
        Collections.sort(pharmacies, Comparator.naturalOrder());
        for (Pharmacy pharmacy : pharmacies) {
            System.out.println(pharmacy);
        }
    }
    
    public static void printSortedPharmaciesByWeight(List<Pharmacy> pharmacies) {
        pharmacies.sort(Comparator.comparingInt(pharmacy ->
                pharmacy.components.stream().mapToInt(Component::getWeight).sum()));
    
        for (Pharmacy pharmacy : pharmacies) {
            System.out.println(pharmacy);
        }
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                '}';
    }
}
