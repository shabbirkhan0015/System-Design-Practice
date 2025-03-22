package StrategyPattern;

public class UPIPaymentMethod implements PaymentMethod{
    @Override
    public Double Discount (Double Amount) {
        return Amount*0.15;
    }
}
