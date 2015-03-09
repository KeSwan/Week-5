/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5se;

/**
 *
 * @author 1301147
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Order pointOfSale = new ShopOrder();
        System.out.println("\n" + pointOfSale.toString() );
        pointOfSale.performPayment();
        
        Order eCommerce = new OnlineOrder();
        System.out.println("\n" + eCommerce.toString() );
        eCommerce.performPayment();
        
        System.out.println("\n" + eCommerce.toString());
        eCommerce.setPaymentBehaviour(new CreditCardPayment());
        
    }
    
}
