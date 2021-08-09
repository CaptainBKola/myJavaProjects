/*
package storeApp;


import java.util.Scanner;

public class Homepage {
     static Scanner scan = new Scanner(System.in);

   static void home() {
       Cart cart = new Cart();
       Scanner scanner = new Scanner(System.in);

        System.out.println("-> Welcome to Micon  Store");


            System.out.print("-> What item do you want to buy?");
            String product = scanner.nextLine();

            System.out.println("-> Home many item do you add to cart?");
            int quantity = scanner.nextInt();

            System.out.println("how much does the item cost?");
            int price = scanner.nextInt();

            System.out.println("-> Do you want to buy anything else?");
            String promptMoreForShopping = scan.nextLine();

            if (promptMoreForShopping.equals("yes")) {
                Item item = new Item(product, price, quantity);
                cart.add(item);


            }

            else if (promptMoreForShopping.equalsIgnoreCase("no")) {
                Invoice.generateInvoice(quantity, price,product);
                break;
            }




        }










    public static void main(String[] args) {

        home();

    }

}


 */