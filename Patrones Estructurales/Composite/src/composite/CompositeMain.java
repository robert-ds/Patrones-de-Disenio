package composite;

import composite.orders.SaleOrder;
import composite.products.CompositeProduct;
import composite.products.SimpleProduct;

import java.util.Random;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 15/7/22
 * Time: 2:12 p. m.
 */

public class CompositeMain {

  private final Random random = new Random();

  private SimpleProduct ram4gb;
  private SimpleProduct ram8gb;
  private SimpleProduct disk500gb;
  private SimpleProduct disk1tb;
  private SimpleProduct cpuAMD;
  private SimpleProduct cpuIntel;
  private SimpleProduct smallCabinete;
  private SimpleProduct bigCabinete;
  private SimpleProduct monitor20inch;
  private SimpleProduct monitor30inch;
  private SimpleProduct simpleMouse;
  private SimpleProduct gammerMouse;

  private CompositeProduct gammerPC;
  private CompositeProduct homePC;
  private CompositeProduct pc2x1;

  private void buildProducts(){

    // Productos Simples
    ram4gb = new SimpleProduct("Memoria RAM GB",750,"KingStone");
    ram8gb = new SimpleProduct("Memoria RAm 8GB", 1000,"KingStone");
    disk500gb = new SimpleProduct("Disco Duro 500GB",1500,"ACME");
    disk1tb = new SimpleProduct("Disco Duro 1TB",2000,"ACME");
    cpuAMD = new SimpleProduct("AMD phenon",4000,"AMD");
    cpuIntel = new SimpleProduct("Intel I7",4500,"Intel");
    smallCabinete = new SimpleProduct("Gabinete Pequenio",2000,"ExCom");
    bigCabinete = new SimpleProduct("Gabinete Gande",2200,"ExCom");
    monitor20inch = new SimpleProduct("Monitor 20'",1500,"HP");
    monitor30inch = new SimpleProduct("Monitor 30'",2000,"HP");
    simpleMouse = new SimpleProduct("Raton Simple",150,"Genius");
    gammerMouse = new SimpleProduct("Raton Gammer",750,"Alien");

    // Productos compuestos

    //Computadora Gammer
    gammerPC = new CompositeProduct("Gammer PC");
    gammerPC.addProduct(ram8gb);
    gammerPC.addProduct(disk1tb);
    gammerPC.addProduct(cpuIntel);
    gammerPC.addProduct(bigCabinete);
    gammerPC.addProduct(monitor30inch);
    gammerPC.addProduct(gammerMouse);

    // Computadora Casa
    homePC = new CompositeProduct("Casa PC");
    homePC.addProduct(ram4gb);
    homePC.addProduct(disk500gb);
    homePC.addProduct(cpuAMD);
    homePC.addProduct(smallCabinete);
    homePC.addProduct(monitor20inch);
    homePC.addProduct(simpleMouse);

    // Computadora Gammer + Computadora Casa
    pc2x1 = new CompositeProduct("Paquete PC Gammer + Casa");
    pc2x1.addProduct(gammerPC);
    pc2x1.addProduct(homePC);

  }

  private void orderSimpleProducts(){
    SaleOrder simpleProductOrder = new SaleOrder(random.nextInt(), "Robert Andres");
    simpleProductOrder.addProduct(ram4gb);
    simpleProductOrder.addProduct(disk1tb);
    simpleProductOrder.addProduct(simpleMouse);
    simpleProductOrder.printOrder();
  }

  private void orderGammerPC(){
    SaleOrder gammerOrder = new SaleOrder(1,"Benito López");
    gammerOrder.addProduct(gammerPC);
    gammerOrder.printOrder();
  }

  private void orderHomePC(){
    SaleOrder homeOrder = new SaleOrder(2, "Juan Pérez");
    homeOrder.addProduct(homePC);
    homeOrder.printOrder();
  }

  private void orderCombo(){
    SaleOrder comboOrder = new SaleOrder(3,"Paquete 2x1 en PC");
    comboOrder.addProduct(pc2x1);
    comboOrder.printOrder();
  }

  private void orderBig(){
    SaleOrder customerOrder = new SaleOrder(4, "Castida Gutierrez");
    customerOrder.addProduct(homePC);
    customerOrder.addProduct(ram8gb);
    customerOrder.addProduct(ram4gb);
    customerOrder.addProduct(monitor30inch);
    customerOrder.addProduct(gammerMouse);
    customerOrder.printOrder();
  }

  public static void main(String[] args){

    CompositeMain main = new CompositeMain();
    main.buildProducts();

    main.orderSimpleProducts();
    main.orderHomePC();
    main.orderGammerPC();
    main.orderCombo();
    main.orderBig();

  }

}
