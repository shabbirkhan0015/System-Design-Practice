package StrategyPattern;

public class NetBankingPayemntMethod implements PaymentMethod{
    @Override
    public Double Discount(Double Amount) {
        return Amount*0.05;
    }
}
