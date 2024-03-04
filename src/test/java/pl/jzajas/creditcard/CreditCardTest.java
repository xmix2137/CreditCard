package pl.jzajas.creditcard;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

public class CreditCardTest {
    @Test
    void itAssignCredit(){

        // Arrange

        var card = new CreditCard();

        //Act

        card.assignCredit(BigDecimal.valueOf(1000));

        // Assert

        assert BigDecimal.valueOf(1000).equals(card.getBalance());
    }

    @Test
    void itAssignCreditV2(){

        // Arrange

        var card = new CreditCard();

        //Act

        card.assignCredit(BigDecimal.valueOf(1500));

        // Assert

        assert BigDecimal.valueOf(1500).equals(card.getBalance());
    }

    @Test
    void itDenyCreditBelowThreshold(){

        var card = new CreditCard();

        try{
            card.assignCredit(BigDecimal.valueOf(50));
            assert false;

        }catch (CreditBelowThresholdException e){
            assert true;

        }

    }
}
