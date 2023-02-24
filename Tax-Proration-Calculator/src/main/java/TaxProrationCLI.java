import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaxProrationCLI {
    TaxProrationCalculator taxProrationCalculator = new TaxProrationCalculator();
    private final Scanner userInput = new Scanner(System.in);
    private String taxingAuthority;

    //Main Method
    public static void main(String[] args) {
        TaxProrationCLI taxProrationCLI = new TaxProrationCLI();
        taxProrationCLI.run();
    }
    public void run() {

        // Perhaps these prompts can be broken out into individual methods
        System.out.println("Welcome to the Tax Proration Calculator!");
        System.out.println("Please note that this program assumes county and municipal tax periods correspond with the 365-day calendar year" +
                " \n(January 1 through December 31), and the school tax period from July 1 through June 30.");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        // Prompt user for date of closing
        System.out.print("Please enter the date of settlement in MM/DD/YYYY format: ");
        taxProrationCalculator.setDateOfClosing(LocalDate.parse(userInput.nextLine()));
    }
        // TODO make each of the school tax conversations into separate methods which pull discount/penalty calculations
        // TODO for school/county/municipal from abstract classes


    public void promptForTaxes() {

        System.out.println("Please enter the current year (base amount) " + taxingAuthority + " taxes:");
        System.out.print("$");


        String currentSchool = userInput.nextLine();
        // set base school taxes
        // Have taxes been paid?
        System.out.println("Have " + taxingAuthority + " taxes been paid? Y/N");
        String schoolTaxStatus = userInput.nextLine();
        // TODO prompt user for whether amount paid was discount, base, or penalty, and what that amount was
        if (schoolTaxStatus.equalsIgnoreCase("Y")) {
            System.out.println("Was this the (D)iscount, (B)ase, or (P)enalty payment amount?");
            String paymentMade = userInput.nextLine();
            if (paymentMade.equalsIgnoreCase("D")) {
                // calculate discount
                taxProrationCalculator.setDiscount(true);
            } else if (paymentMade.equalsIgnoreCase("P")) {
                // calculate 10% penalty
                taxProrationCalculator.setPenalty(true);
                // TODO remember not to factor penalty amount into buyer's side of proration
            }
        } else {
            System.out.println();
        }

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
