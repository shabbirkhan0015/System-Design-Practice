package StrategyPattern;


public class CreditCardPaymentMethod  implements  PaymentMethod{
    @Override
    public Double Discount(Double Amount) {
        return  Amount*0.1;
    }


}
