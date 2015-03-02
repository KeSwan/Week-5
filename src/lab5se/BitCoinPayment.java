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
public class BitCoinPayment implements PaymentBehaviour{

    @Override
    public boolean makePayment(double amount) {
        //debit coin amount
        return true;
    }
    
}
