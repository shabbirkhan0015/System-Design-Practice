package StrategyPattern;

public class Client {
    public static void main(String args[])
    {
        DiscountContext discountContext= new DiscountContext(new NetBankingPayemntMethod());
        System.out.println("Discount for NetBanking Rs-"+ discountContext.calculateDisaccount(100.0));

        discountContext.setPaymentMethod(new CreditCardPaymentMethod());
        System.out.println("Discount for Credit Rs-"+ discountContext.calculateDisaccount(100.0));

        discountContext.setPaymentMethod(new UPIPaymentMethod());
        System.out.println("Discount for UPI Rs-"+ discountContext.calculateDisaccount(100.0));
    }

}
