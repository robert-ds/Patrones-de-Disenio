/**
 * Created with IntelliJ IDEA
 * Created By Kinsey
 * Date: 22/6/22
 * Time: 11:04 a. m.
 */
package robertds.factorymethod;

import java.sql.SQLException;
import java.util.List;
import robertds.factorymethod.dao.ProductDAO;
import robertds.factorymethod.entity.Product;

public class FactoryMain {

  public static void main(String[] args){

    // Nuevos Productos a registrar
    Product productA = new Product(1L,"Producto A", 100);
    Product productB = new Product(2L,"Producto B", 200);

    // Instancia del DAO
    ProductDAO productDAO = new ProductDAO();

    // Guardamos los Productos en la base de Datos
    productDAO.saveProduct(productA);
    productDAO.saveProduct(productB);

    // Consultamos los Productos
    List<Product> products = productDAO.findAllProducts();
    System.out.println("Product size ==>" + products.size());
    for(Product product: products){
      System.out.println(product);
    }

  }

}
