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
public class ShopOrder extends Order {

    @Override
    public void performPayment() {
        super.performPayment(); 
    }

    @Override
    public void setPaymentBehaviour(PaymentBehaviour payB) {
        super.setPaymentBehaviour(payB); 
    }

    

    @Override
    public String toString() {
        return "ShopOrder{" + '}';
    }

   
    
    
    
}
