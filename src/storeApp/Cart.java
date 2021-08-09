package storeApp;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> cart = new ArrayList<>();

    public void add(Item item) {

        cart.add(item);
    }
}
