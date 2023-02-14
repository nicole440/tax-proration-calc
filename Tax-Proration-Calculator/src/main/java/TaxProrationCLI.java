import java.time.LocalDate;
import java.util.Scanner;

public class TaxProrationCLI {
    public static LocalDate closingDate;
    private final Scanner userInput = new Scanner(System.in);

    //Main Method
    public static void main(String[] args) {
        TaxProrationCLI taxProrationCLI = new TaxProrationCLI();
        taxProrationCLI.run();
    }
    public void run() {
        // Perhaps these prompts can be broken out into individual classes, maybe with an abstract superclass?
        System.out.println("Welcome to the Tax Proration Calculator!");
        System.out.println("Please note that this program assumes county and municipal tax periods correspond with the calendar year \n(January 1 through December 31), and the school tax period running from July 1 through June 30.");
        System.out.println();
        // Prompt user for date of closing
        System.out.print("Please enter the date of closing in MM/DD/YYYY format: ");
        LocalDate closingDate = LocalDate.parse(userInput.nextLine());
        // Prompt user for school tax amount
        System.out.println("Please enter the current year school taxes:");
        System.out.print("$");
        String currentSchool = userInput.nextLine();
        // Have school taxes been paid?
        System.out.println("Have school taxes been paid? Y/N");
        String schoolTaxStatus = userInput.nextLine();
        // TODO prompt user for whether amount paid was discount, base, or penalty, and what that amount was
        
        // Prompt user for county tax amount
        System.out.println("Please enter the current year (base amount) county taxes:");
        System.out.print("$");
        String currentCounty = userInput.nextLine();
        // Have county taxes been paid?
        System.out.println("Have county taxes been paid? Y/N");
        String countyTaxStatus = userInput.nextLine();
        // TODO prompt user for whether amount paid was discount, base, or penalty, and what that amount was
        
        // Prompt user for municipal tax amount
        System.out.println("Please enter the current year (base amount) municipal taxes:");
        System.out.print("$");
        String currentMunicipal = userInput.nextLine();
        // Have municipal taxes been paid?
        System.out.println("Have municipal taxes been paid? Y/N");
        String municipalTaxStatus = userInput.nextLine();
        // TODO prompt user for whether amount paid was discount, base, or penalty, and what that amount was
    }
}
