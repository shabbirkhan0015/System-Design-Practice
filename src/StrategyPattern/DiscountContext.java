package StrategyPattern;

public class DiscountContext {

    private PaymentMethod paymentMethod;

    public DiscountContext(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Double calculateDisaccount(Double amount)
    {
        return paymentMethod.Discount(amount);
    }

}
