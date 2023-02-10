import java.time.LocalDate;
public class TaxProrationCalculator {

        LocalDate dateOfClosing;
        LocalDate beginTaxPeriod;
        LocalDate endTaxPeriod;
        int daysInYear;

        // Constructor Method
        public TaxProrationCalculator() {

        }

        //Main Method
        public static void main(String[] args) {

        }

        // Getters


        public int getDaysInYear() {
            return daysInYear;
        }

        //Setters
        public LocalDate setBeginTaxPeriod(LocalDate taxPeriodBegin) {

            return beginTaxPeriod;
        }

        public LocalDate setEndTaxPeriod(LocalDate taxPeriodEnd) {

            return endTaxPeriod;
        }

        public LocalDate setDateOfClosing(LocalDate closingDate) {

            return dateOfClosing;
        }
    }
