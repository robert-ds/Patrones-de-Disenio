package prototype;

import prototype.impl.PriceListImpl;
import prototype.impl.ProductItem;
import prototype.impl.PrototypeFactory;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 5/7/22
 * Time: 2:21 p. m.
 */

public class PrototypeMain {

  public static void main(String[] args){

    // Creamos la lista de precios inicial, ésta tiene los productos con el precio de lista
    PriceListImpl standarPriceList = new PriceListImpl("Standar Price List");
    for(int i = 1; i <= 5; i++){
      ProductItem item = new ProductItem("Product " + i, i * 2);
      standarPriceList.addProductItem(item);
    }
    PrototypeFactory.addPrototype(standarPriceList.getListName(), standarPriceList);

    // Segunda lista para clientes de mayoreo a partir de la lista estándar con un 10% de descuento sobre la lista  precio estandar

    PriceListImpl wholesalePriceList = (PriceListImpl) PrototypeFactory.getPrototype("Standar Price List");

    wholesalePriceList.setListName("Wholesale Price List");

    for(ProductItem item: wholesalePriceList.getProducts()){
      item.setPrice(item.getPrice() * 0.90);
    }
    PrototypeFactory.addPrototype(wholesalePriceList.getListName(), wholesalePriceList);


    // Tercera lista de Precios para clientes VIP a partir de la lista de mayoreo con 10% de descuento sobre la lista de preciose mayoreo
    PriceListImpl vipPriceList = (PriceListImpl) PrototypeFactory.getPrototype("Wholesale Price List");
    vipPriceList.setListName("VIP Price List");
    for(ProductItem item: vipPriceList.getProducts()){
      item.setPrice(item.getPrice() * 0.90);
    }

    // Imprimimos las Listas de Precios
    System.out.println(standarPriceList);
    System.out.println(wholesalePriceList);
    System.out.println(vipPriceList);

  }
}
