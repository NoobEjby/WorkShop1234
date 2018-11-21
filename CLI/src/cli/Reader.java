/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cli;

import java.util.Scanner;

/**
 *
 * @author jesperisgaard
 */
public class Reader {

    Scanner keyboardReader = new Scanner(System.in);

    public Reader() {
        help();
    }

    private void play() {
        boolean running = true;

        while (running)
        {

        }

    }

    System.out.print (
    ">");
            String token = keyboardReader.next();

    if (token.equals ( 
        "addbuilding")) {
                System.out.println("Which content to write?");
        System.out.print(">");

        String content = keyboardReader.next();

        Tempo.addBuildings(content);
    }

    else if (token.equals ( 
        "writeend")) {
                System.out.println("Which content to write?");
        System.out.print(">");

        String content = keyboardReader.next();

        cfm.writeAtEnd(content);
    }

    else if (token.equals ( 
        "write")) {
                System.out.println("Which content to write?");
        System.out.print(">");
        String content = keyboardReader.next();

        System.out.println("Where to write it?");
        System.out.print(">");

        int position = keyboardReader.nextInt();

        cfm.write(content, position);
    }

    else if (token.equals ( 
        "exit")) {
                System.out.println("Goodbye!");
        break;
    }

    
        else {
                System.out.println("Command not understood!");
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
