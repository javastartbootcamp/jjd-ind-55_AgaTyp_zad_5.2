package pl.javastart.task;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(11.5, 23.4, 21, true);
        Room room2 = new Room(12.5, 18.4, 18, true);
        Room room3 = new Room(13.5, 23.4, 21, false);
        Room room4 = new Room(14.5, 20.4, 21, true);

        boolean cooler1 = room1.cooler();
        System.out.printf(Locale.US, "Pokój o wymiarze %.1f m2 został schłodzony: %s.\n", room1.roomVolume, cooler1);
        System.out.printf(Locale.US, "Jego aktualna temperatura: %.1f\n", room1.currentTemp);
        System.out.println("-----------------");

        boolean cooler2 = room2.cooler();
        System.out.printf(Locale.US, "Pokój o wymiarze %.1f m2 został schłodzony: %s.\n", room2.roomVolume, cooler2);
        System.out.printf(Locale.US, "Jego aktualna temperatura: %.1f\n", room2.currentTemp);
        System.out.println("-----------------");

        boolean cooler3 = room3.cooler();
        System.out.printf(Locale.US, "Pokój o wymiarze %.1f m2 został schłodzony: %s.\n", room3.roomVolume, cooler3);
        System.out.printf(Locale.US, "Jego aktualna temperatura: %.1f\n", room3.currentTemp);
        System.out.println("-----------------");

        boolean cooler4 = room4.cooler();
        System.out.printf(Locale.US, "Pokój o wymiarze %.1f m2 został schłodzony: %s.\n", room4.roomVolume, cooler4);
        System.out.printf(Locale.US, "Jego aktualna temperatura: %.1f\n", room4.currentTemp);
        System.out.println("-----------------");

    }
}
