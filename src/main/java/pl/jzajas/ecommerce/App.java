package pl.jzajas.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.jzajas.ecommerce.catalog.ProductCatalog;


@SpringBootApplication
public class App {

    public static void main(String[] args){
        System.out.println("Hello there");
        SpringApplication.run(App.class, args);

    }

    @Bean
    ProductCatalog createMyProductCatalog() {
        var catalog = new ProductCatalog();
        catalog.addProduct("Lego Set Gwiazda Śmierci","Big");
        catalog.addProduct("Combi","Nice one");

        return catalog;
    }

}
