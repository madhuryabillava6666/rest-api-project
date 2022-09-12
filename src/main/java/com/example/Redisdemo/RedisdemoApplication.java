package com.example.Redisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;

import com.example.Redisdemo.entity.Product;
import com.example.Redisdemo.repository.ProductDao;


import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@EnableSwagger2
@RestController
//@RequestMapping("/product")
@SpringBootApplication
public class RedisdemoApplication {
	
	@Autowired
    private ProductDao dao;

    @PostMapping("/product")
    public Product save(@RequestBody Product product) {
        return dao.save(product);
    }

   @GetMapping("/product")
    public List<Product> getAllProducts() {
        return dao.findAll();
    }

    /*@GetMapping("/{id}")
    public Product findProduct(@PathVariable int id) {
        return dao.findProductById(id);
    }*/
    @DeleteMapping("/{id}")
    public String remove(@PathVariable int id)   {
    	return dao.deleteProduct(id);
	}
    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return dao.updateProduct(product);
    }
    
    
    /*@Autowired
	private ApplicationConfig applicationconfig;
    @GetMapping(value="/properties")
	public ResponseEntity<String> getProperties() {
		return new ResponseEntity<>(dao.getProperties(), HttpStatus.OK);
	}*/
	
	/*@GetMapping(value="properties")
	public String getProperties() {
		return applicationconfig.getServerPort();
	}*/
    
    
	public static void main(String[] args) {
		SpringApplication.run(RedisdemoApplication.class, args);
	}

}
