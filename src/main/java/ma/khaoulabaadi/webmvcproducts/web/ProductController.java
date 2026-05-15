package ma.khaoulabaadi.webmvcproducts.web;

import ma.khaoulabaadi.webmvcproducts.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @GetMapping(value="/index")
    public String index() {
        return "products";
    }
}
