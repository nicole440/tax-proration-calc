import java.time.LocalDate;
public class TaxProrationCalculator {

        LocalDate dateOfClosing;
        LocalDate beginTaxPeriod;
        LocalDate endTaxPeriod;
        int daysInYear;

        // Getters


    public LocalDate getDateOfClosing() {
        return dateOfClosing;
    }

    public LocalDate getBeginTaxPeriod() {
        return beginTaxPeriod;
    }

    public LocalDate getEndTaxPeriod() {
        return endTaxPeriod;
    }

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
