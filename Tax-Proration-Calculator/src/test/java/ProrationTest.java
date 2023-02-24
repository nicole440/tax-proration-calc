import org.junit.Test;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;

public class ProrationTest {

    @Test
    public void taxes_paid_on_base_happy_path() {
        // Arrange
        LocalDate dateOfClosing = LocalDate.of(2023, 02, 23);
        LocalDate taxPeriodBegin = LocalDate.of(2023, 01, 01);
        LocalDate taxPeriodEnd = LocalDate.of(2023, 12, 31);
        BigDecimal taxAmount = new BigDecimal(1000);

        // Act
        // Count from taxPeriodBegin to taxPeriodEnd to determine days in tax period: 365
        Duration daysInYearDuration = Duration.between(taxPeriodBegin, taxPeriodEnd);
        Integer daysInYear = Integer.parseInt(String.valueOf((daysInYearDuration)));
        taxAmount.divide(BigDecimal.valueOf(Long.parseLong((String.valueOf(daysInYear)))));

        // Determine perDiem tax amount by dividing number of days in tax period: 2.74 perDiem
        
        // sellerPaid = (n days from taxPeriodBegin to dateOfClosing) * perDiem
        // buyerPays = (n days from dateOfClosing to taxPeriodEnd), * perDiem

        // Assert

    }

}
