package ma.khaoulabaadi.webmvcproducts;

import ma.khaoulabaadi.webmvcproducts.entities.Product;
import ma.khaoulabaadi.webmvcproducts.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebMvcProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebMvcProductsApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            Product product = Product.builder()
                    .name("Computer")
                    .price(5400)
                    .quantity(11)
                    .build();

            // Correction : suppression de la parenthèse en trop
            productRepository.save(product);

            productRepository.save(Product.builder()
                    .name("Printer")
                    .price(1299)
                    .quantity(11)
                    .build());

            productRepository.save(Product.builder()
                    .name("smart Phone")
                    .price(12000)
                    .quantity(33)
                    .build());

            productRepository.findAll().forEach(p -> {
                System.out.println(p.toString());
            });
        };
    }
}