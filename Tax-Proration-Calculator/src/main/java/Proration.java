import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Proration {
    // Determine date of settlement
    LocalDate settlementDate;
    LocalDate taxProrationBegin = LocalDate.of(2023, 01, 01);
    public Proration() {
        settlementDate = TaxProrationCLI.closingDate.;
    }
    // Assign to a variable the number of days in the year using LocalDate? Is this necessary, or will LocalDate account for leap years?
    int currentTaxYearLength = settlementDate.lengthOfYear();
    // Count the number of days between the start of the tax period/year and the settlement date
    int daysBeforeClosing = settlementDate.minusDays();
    int daysAfter
    // Count the number of days between the settlement date and the end of the tax period/year
}



// Do I want a different method/calculation depending on whether the taxes were paid or not? Or just an if/else statement?
// Separate method for school taxes, or assign school tax period to variable using LocalDate?