package src.main.java.StrategyPattern.PaymentsExample.strategy;

import src.main.java.StrategyPattern.PaymentsExample.interfaces.PaymentStrategy;

public class CreditCardPaymentStrategy implements PaymentStrategy
{
    private String name;
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardPaymentStrategy(String name, String cardNumber, String cvv, String expiryDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with credit/debit card");
    }
}
