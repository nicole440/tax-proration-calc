import java.math.BigDecimal;
import java.time.LocalDate;
public class TaxProrationCalculator {
    private LocalDate dateOfClosing;
    private LocalDate beginTaxPeriod;
    private LocalDate endTaxPeriod;
    private int daysInYear;
    private BigDecimal baseTaxes;
    private boolean isDiscount;
    private boolean isPenalty;

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

    public BigDecimal getBaseTaxes() {
        return baseTaxes;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public boolean isPenalty() {
        return isPenalty;
    }

    //Setters
    public void setBeginTaxPeriod(LocalDate taxPeriodBegin) {
        this.beginTaxPeriod = taxPeriodBegin;
    }

    public void setEndTaxPeriod(LocalDate taxPeriodEnd) {
        this.endTaxPeriod = taxPeriodEnd;
    }

    public void setDateOfClosing(LocalDate closingDate) {
        this.dateOfClosing = closingDate;
    }

    public void setDaysInYear(int daysInYear) {
        this.daysInYear = daysInYear;
    }

    public void setBaseTaxes(BigDecimal baseTaxes) {
        this.baseTaxes = baseTaxes;
    }

    public void setDiscount(boolean discount) {
        this.isDiscount = discount;
    }

    public void setPenalty(boolean penalty) {
        this.isPenalty = penalty;
    }
}
