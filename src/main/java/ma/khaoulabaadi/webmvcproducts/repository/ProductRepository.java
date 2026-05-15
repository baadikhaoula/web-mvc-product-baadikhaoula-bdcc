package ma.khaoulabaadi.webmvcproducts.repository;

import ma.khaoulabaadi.webmvcproducts.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
