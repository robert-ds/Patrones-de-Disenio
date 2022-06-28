package abstractfactory;

import abstractfactory.impl.IServiceStackAbstractFactory;
import abstractfactory.impl.ServiceStackAbstractFactory;
import abstractfactory.service.IEmployeeService;
import abstractfactory.service.IProductsService;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 28/6/22
 * Time: 2:21 p. m.
 */

public class AbstractFactoryMain {

  public static void main(String[] args){
    IServiceStackAbstractFactory factory = ServiceStackAbstractFactory.createServiceFactory();
    IEmployeeService employeeService = factory.getEmployeeService();
    IProductsService productService = factory.getProductsService();

    System.out.println("EmployeeService class => " + employeeService.getClass().getCanonicalName());
    System.out.println("ProductService class => " + productService.getClass().getCanonicalName());

    System.out.println("getEmployee => " + Arrays.toString(employeeService.getEmployee()));
    System.out.println("getProduct => " + Arrays.toString(productService.getProducts()));
  }

}
