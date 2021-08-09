package storeApp;


class Item{
    private int quantity;
    private int price;
    private String productName;

    public Item(String productName, int price, int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

}
