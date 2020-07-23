import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VendingMachine {

    private static final Logger logger = LogManager.getLogger(VendingMachine.class);

    public static void main(String[] args) {

        logger.info("entering application.");
        int productId, clientProdPrice;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Доступные для покупки позиции: ");
            Cookies.availableProducts();

            System.out.print("Введите номер товара или -1 для завершения работы ");
            try {
                productId = scanner.nextInt();

                if (productId < 0) {
                    logger.info("close program");
                    break;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Введите целое число!");
                logger.error("int is required ", ex);
                return;
            }

            if (productId < Cookies.values().length) {
                Cookies selectedItem = Cookies.values()[productId];
                System.out.println("Вы выбрали: " + selectedItem);

                System.out.println("Внесите деньги: ");
                try {
                    clientProdPrice = scanner.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Внесите необходимую сумму!");
                    logger.error("int is required ", ex);
                    return;
                }

                MoneyOperation.payment(selectedItem, clientProdPrice);

            } else {
                System.out.println("Товара нет. Проверьте идентификатор!");
                logger.info("product is not found");
            }
        }
        logger.info("exiting application.");
    }
}

