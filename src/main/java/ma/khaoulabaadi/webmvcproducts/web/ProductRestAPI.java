package ma.khaoulabaadi.webmvcproducts.web;

import ma.khaoulabaadi.webmvcproducts.entities.Product;
import ma.khaoulabaadi.webmvcproducts.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestAPI {
    private ProductRepository productRepository;

    public ProductRestAPI(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @GetMapping(value="/products")
    @ResponseBody
    public List<Product> listProducts(){
        return productRepository.findAll();
    }
    @GetMapping(value="/products/{id}")
    public Product findById(@PathVariable(name = "id") Long id){
        return productRepository.findById(id).get();
    }
}
