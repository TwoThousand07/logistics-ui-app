package assignment2;

import assignment2.app.DeliveryApplication;
import assignment2.factory.GUIFactory;
import assignment2.factory.MacOSFactory;
import assignment2.factory.WindowsFactory;
import assignment2.logistics.Logistics;
import assignment2.logistics.RoadLogistics;
import assignment2.logistics.SeaLogistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter delivery mode (ROAD or SEA):");

        if (!scanner.hasNextLine()) {
            System.out.println("Error");
            return;
        }
        String mode = scanner.nextLine().trim().toUpperCase();

        System.out.println("Enter UI platform (WINDOWS or MACOS):");
        if (!scanner.hasNextLine()) {
            System.out.println("Error");
            return;
        }
        String platform = scanner.nextLine().trim().toUpperCase();

        Logistics logistics;

        if (mode.equals("ROAD")) {
            logistics = new RoadLogistics();
        } else if (mode.equals("SEA")) {
            logistics = new SeaLogistics();
        } else {
            System.out.println("Error");
            return;
        }

        GUIFactory factory;
        if (platform.equals("WINDOWS")) {
            factory = new WindowsFactory();
        } else if (platform.equals("MACOS")) {
            factory = new MacOSFactory();
        } else {
            System.out.println("Error");
            return;
        }

        System.out.println("Delivery mode: " + mode);
        System.out.println("UI Platform: " + platform);

        DeliveryApplication app = new DeliveryApplication(factory, logistics);
        app.renderUI();
        app.executeDelivery("laboratory equipment", "Astana");
    }
}
