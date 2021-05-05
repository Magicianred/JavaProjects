package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Product;

public class SaleManager implements SaleService{

	@Override
	public void sale(Customer gamer, Product product) {
	  
		System.out.println(gamer.getFirstName() + " isimli kullan�c� " + product.getUnitPrice() + " TL fiyat ile " + product.getDescription() + " oyununu sat�n ald�.");
	}

	@Override
	public void discountSale(Customer gamer, Product product, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " isimli kullan�c� " + unitPriceAfterDiscount(product.getUnitPrice(), campaign.getDiscountRate())  + " TL indirimli fiyat ile (%" + campaign.getDiscountRate() + " indirimli) "  + product.getDescription() + " oyununu sat�n ald�.");

		
	}

	public double unitPriceAfterDiscount(double unitPrice, int discountRate) {
		return unitPrice - (unitPrice * discountRate / 100);
	}
}
