package pl.jzajas.ecommerce.sales;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class SalesTest {

    @Test
    void isShowsOffer() {
        SalesFacade sales = thereIsSalesFacade();
        String customerId = thereIsExampleCustomer("Kuba");

        Offer offer = sales.getCurrentOffer(customerId);

        assertEquals(0, offer.getItemsCount());
        assertEquals(BigDecimal.ZERO, offer.getTotal());
    }

    private SalesFacade thereIsSalesFacade() {
        return new SalesFacade();
    }

    private String thereIsExampleCustomer(String id) {
        return id;
    }

    @Test
    void itAllowsTOAddProductToCart() {
        String productId = thereIsProduct("example", BigDecimal.valueOf(10));
        String customerId = thereIsExampleCustomer("Kuba");
        SalesFacade sales = thereIsSalesFacade();

        sales.addToCart(customerId, productId);
        Offer offer = sales.getCurrentOffer(customerId);

        assertEquals(1, offer.getItemsCount());
        assertEquals(BigDecimal.valueOf(10), offer.getTotal());

    }

    @Test
    void itDistinguishCartsByCustomer(){
        String productA = thereIsProduct("example a", BigDecimal.valueOf(10));
        String productB = thereIsProduct("example b", BigDecimal.valueOf(10));

        String customerA = thereIsExampleCustomer("Kuba");
        String customerB = thereIsExampleCustomer("John");

        SalesFacade sales = thereIsSalesFacade();

        sales.addToCart(customerA, productA);
        sales.addToCart(customerB, productB);
        Offer offerA = sales.getCurrentOffer(customerA);
        Offer offerB = sales.getCurrentOffer(customerB);

        assertEquals(1, offerA.getItemsCount());
        assertEquals(BigDecimal.valueOf(10), offerA.getTotal());

        assertEquals(1, offerB.getItemsCount());
        assertEquals(BigDecimal.valueOf(10), offerB.getTotal());
    }

    private String thereIsProduct(String productId, BigDecimal price) {
        return null;
    }

    @Test
    void itAllowsToRemoveProductFromCart() {

    }

    @Test
    void itAllowsToAcceptOffer () {
        String productId = thereIsProduct("example", BigDecimal.valueOf(10));
        String customerId = thereIsExampleCustomer("Kuba");
        SalesFacade sales = thereIsSalesFacade();

        sales.addToCart(customerId, productId);
        ReservationDetails reservationDetails =
    }
}
