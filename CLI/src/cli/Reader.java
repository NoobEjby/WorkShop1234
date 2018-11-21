/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cli;

import java.util.Scanner;
import java.util.UUID;
import workshopfucking1234.BuildingManagementSystemImpl;
import workshopfucking1234.IBuildingManagementSystem;

/**
 *
 * @author jesperisgaard
 */
public class Reader {

    Scanner keyboardReader = new Scanner(System.in);
    BuildingManagementSystemImpl File = new BuildingManagementSystemImpl();
    public Reader() {
        help();
        play();
    }

    private void play() {
        boolean running = true;

        while (running) {
            System.out.print(
                    ">");
            String token = keyboardReader.next();

            /*if (token.equals(
                    "addbuilding")) {
                System.out.println("Which building to add?");
                System.out.print(">");

                UUID content = UUID.fromString(keyboardReader.next());

                File.addBuilding(content);
            } else*/ if (token.equals(
                    "getbuildings")) {
                System.out.print(File.getBuildings());
            } else if (token.equals(
                    "removebuilding")) {
                System.out.println("Which building to remove?");
                System.out.print(">");
                UUID content = UUID.fromString(keyboardReader.next());

                File.removeBuilding(content);
            } else if (token.equals(
                    "getbuildinginformation")) {
                File.getBuildingInformation();
            } else if (token.equals(
                    "getsensorinformation")) {
                System.out.println("Which building to get sensor information from?");
                System.out.print(">");
                UUID content = UUID.fromString(keyboardReader.next());

                File.getSensorInformation(content);
            } else if (token.equals(
                    "getactuatorinformation")) {
                System.out.println("Which building to get actuator information from?");
                System.out.print(">");
                UUID content = UUID.fromString(keyboardReader.next());

                File.removeBuilding(content);
            } else if (token.equals(
                    "addtemperaturesensor")) {
                System.out.println("Which building to add temperature sensor to?");
                System.out.print(">");
                UUID content1 = UUID.fromString(keyboardReader.next());
                System.out.println("What to call temperature sensor?");
                System.out.print(">");
                String content2 = keyboardReader.next();
                
                File.addTemperatureSensor(content1, content2);
            }else if (token.equals(
                    "addco2sensor")) {
                System.out.println("Which building to add CO2 sensor to?");
                System.out.print(">");
                UUID content1 = UUID.fromString(keyboardReader.next());
                System.out.println("What to call CO2 sensor?");
                System.out.print(">");
                String content2 = keyboardReader.next();
                
                File.addCo2Sensor(content1, content2);
            } else if (token.equals(
                    "removesensor")) {
                System.out.println("Which building to remove from?");
                System.out.print(">");
                UUID content1 = UUID.fromString(keyboardReader.next());
                System.out.println("Which sensor to remove?");
                System.out.print(">");
                UUID content2 = UUID.fromString(keyboardReader.next());
                

                File.removeSensor(content1, content2);
            } else if (token.equals(
                    "addventilationactuator")) {
                System.out.println("Which building to add ventilation actuator to?");
                System.out.print(">");
                UUID content1 = UUID.fromString(keyboardReader.next());
                System.out.println("What to call ventilation actuator?");
                System.out.print(">");
                String content2 = keyboardReader.next();
                
                File.addCo2Sensor(content1, content2);
            } else if (token.equals(
                    "removeactuator")) {
                System.out.println("Which building to remove from?");
                System.out.print(">");
                UUID content1 = UUID.fromString(keyboardReader.next());
                System.out.println("Which actuator to remove?");
                System.out.print(">");
                UUID content2 = UUID.fromString(keyboardReader.next());

                File.removeActuator(content1, content2);
            } else if (token.equals(
                    "getbuilding")) {
                System.out.println("Which building to remove?");
                System.out.print(">");
                UUID content = UUID.fromString(keyboardReader.next());

                File.getBuilding(content);
            } else if (token.equals(
                    "exit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Command not understood!");
            }

        }

    }

    private void help() {
        System.out.println("The following commands are supported:");
        System.out.println("\tgetbuildings - ");
        System.out.println("\taddbuilding - ");
        System.out.println("\tremovebuilding - ");
        System.out.println("\tgetbuildinginformation - ");
        System.out.println("\tgetsensorinformation - ");
        System.out.println("\tgetactuatorinformation - ");
        System.out.println("\taddtemperaturesensor - ");
        System.out.println("\taddco2sensor - ");
        System.out.println("\tremovesensor - ");
        System.out.println("\taddventilationactuator - ");
        System.out.println("\tremoveactuator - ");
        System.out.println("\tgetbuilding - ");

    }
}
