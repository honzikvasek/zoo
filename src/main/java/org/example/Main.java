package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Scanner scanner = new Scanner(System.in);

        // Registrace návštěvníka
        System.out.println("Registrace nového návštěvníka");
        System.out.print("Zadejte křestní jméno: ");
        String firstName = scanner.nextLine();
        System.out.print("Zadejte příjmení: ");
        String lastName = scanner.nextLine();
        System.out.print("Zadejte počáteční kredity: ");
        int credits = scanner.nextInt();

        int visitorId = zoo.registerVisitor(firstName, lastName, credits);
        System.out.println("Návštěvník byl zaregistrován s ID: " + visitorId);

        // Dobití kreditů návštěvníka
        System.out.println("\nDobití kreditů návštěvníka");
        System.out.print("Zadejte ID návštěvníka: ");
        int visitorIdToRecharge = scanner.nextInt();
        System.out.print("Zadejte částku k dobití: ");
        int amountToRecharge = scanner.nextInt();

        try {
            zoo.rechargeCredits(visitorIdToRecharge, amountToRecharge);
            System.out.println("Kredity byly úspěšně dobity.");
        } catch (VisitorNotFoundException e) {
            System.out.println("Chyba: " + e.getMessage());
        }
    }


}
