package com.apiux.labs.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;
import com.apiux.labs.demo.model.Product;
  @RestController
  public class ProductsController {
 
 
      public ProductsController() {
      }
 
      @RequestMapping(value = "/products")
      public List hello() throws Exception {
        List<Product> products=new ArrayList<Product>();
        products.add(new Product(1,"Producto 1", 2000.0));
        products.add(new Product(2,"Producto 4", 3000.0));
        products.add(new Product(3,"Producto 5", 3455.0));
        return products;
      }
 
 
  }