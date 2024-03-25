package pl.jzajas.ecommerce.catalog;

import java.math.BigDecimal;
import java.util.UUID;

public class Product {
    private final String id;
    private final String name;
    private final String description;

    public Product(UUID id, String name, String description) {
        this.id = id.toString();
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getPrice() {
        return null;
    }

    public void changePrice(BigDecimal price){}

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
