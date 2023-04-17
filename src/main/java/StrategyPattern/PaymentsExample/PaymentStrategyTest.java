package src.main.java.StrategyPattern.PaymentsExample;

import src.main.java.StrategyPattern.PaymentsExample.entities.Item;
import src.main.java.StrategyPattern.PaymentsExample.entities.ShoppingCart;
import src.main.java.StrategyPattern.PaymentsExample.strategy.CreditCardPaymentStrategy;
import src.main.java.StrategyPattern.PaymentsExample.strategy.PaypalStrategy;

public class PaymentStrategyTest {
    public static void main(String args[]) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new Item("1234", 100);
        Item item2 = new Item("5678", 200);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        // credit card strategy
        shoppingCart.pay(new CreditCardPaymentStrategy("dummyName", "1245", "123", "20-04-2000"));

        // paypal strategy
        shoppingCart.pay(new PaypalStrategy("dummyEmail", "dummyPassword"));
    }
}
