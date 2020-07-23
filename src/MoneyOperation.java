import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class MoneyOperation {

    private static final Logger logger = LogManager.getLogger(MoneyOperation.class);

    public static void payment(Cookies selectedItem, int clientProdPrice) {
        if (selectedItem.getPrice() == clientProdPrice) {
            System.out.println("Спасибо за покупку!");
        } else if (selectedItem.getPrice() > clientProdPrice) {
            System.out.println("Недостаточно средств!");
        } else {
            System.out.println("Ваша сдача, " + (clientProdPrice - selectedItem.getPrice()) + " руб");
        }
        logger.info("payment method");
    }
}
