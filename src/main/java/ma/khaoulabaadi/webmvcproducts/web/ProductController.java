package ma.khaoulabaadi.webmvcproducts.web;

import ma.khaoulabaadi.webmvcproducts.entities.Product;
import ma.khaoulabaadi.webmvcproducts.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // ✅ CORRECTION IMPORTANTE
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    private final ProductRepository productRepository;

    // Injection par constructeur (recommandé par Spring)
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping(value = "/index")
    public String index(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("listProducts", products);
        return "products";
    }
}