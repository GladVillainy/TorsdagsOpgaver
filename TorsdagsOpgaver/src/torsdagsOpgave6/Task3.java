package torsdagsOpgave6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Inter the name of the file");
        Scanner scanner = new Scanner(System.in);

        // Variabler
        File file;
        boolean files = false;


        //Sørger for, at den ikke bare stopper.
        while (!files) {
            //Søger efter filen
            String input = scanner.nextLine();
            file = new File(input);
            try (Scanner scan = new Scanner(new File(input))) {
                // Skriver hele filen ud
                while (scan.hasNextLine()) {
                    String content = scan.nextLine();
                    System.out.println(content);
                }
                files = true; // afslutter
            } catch (FileNotFoundException | RuntimeException e) {
                System.out.println("File not found, please try again");
            }
        }
    }
}
