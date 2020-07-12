class MoneyOperation {

    public static void payment(Cookies selectedItem, int clientProdPrice) {
        if (selectedItem.getPrice() == clientProdPrice) {
            System.out.println("Спасибо за покупку!");
        } else if (selectedItem.getPrice() > clientProdPrice) {
            System.out.println("Недостаточно средств!");
        } else {
            System.out.println("Ваша сдача, " + (clientProdPrice - selectedItem.getPrice()) + " руб");
        }
    }
}
