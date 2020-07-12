import org.apache.logging.log4j.Logger;

public enum Cookies {
    OREO(30), KITKAT(40), TUC(25), CHOCOPIE(35), MARS(50), TWIX(40);

    private int price;

    Cookies(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public static void availableProducts(Logger logger) {
        Cookies[] values = Cookies.values();
        for (int i = 0; i < values.length; i++) {
            Cookies cookie = values[i];
            System.out.println(i + " " + cookie + ": " + cookie.getPrice() + " руб");
        }
        logger.info("availableProducts method");
    }
}
