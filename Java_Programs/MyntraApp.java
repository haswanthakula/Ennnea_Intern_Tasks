import java.util.*;
import java.util.List;

public class MyntraApp {
    private List<String> shoppingCart;
    private Set<String> wishList;
    private Map<String, Double> inventory;

    public MyntraApp() {
        shoppingCart = new ArrayList<>();
        wishList = new HashSet<>();
        inventory = new LinkedHashMap<>();

        inventory.put("T-Shirt", 500.0);
        inventory.put("Jeans", 1500.0);
        inventory.put("Shoes", 3000.0);
    }

    // Inventory methods
    public void addToInventory(String item, double price) {
        inventory.put(item, price);
        System.out.println(item + " added to the inventory with price ₹" + price);
    }

    public void removeFromInventory(String item) {
        if (inventory.remove(item) != null) {
            System.out.println(item + " removed from the inventory.");
        } else {
            System.out.println(item + " is not in the inventory.");
        }
    }

    public void modifyInventory(String item, double newPrice) {
        if (inventory.containsKey(item)) {
            inventory.put(item, newPrice);
            System.out.println(item + " price updated to ₹" + newPrice);
        } else {
            System.out.println(item + " is not in the inventory.");
        }
    }

    public void displayInventory() {
        System.out.println("\nInventory:");
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty. Please add items first.");
        } else {
            inventory.forEach((item, price) -> System.out.println(item + " - ₹" + price));
        }
    }

    // Cart methods
    public void addToCart(String item) {
        if (inventory.containsKey(item)) {
            shoppingCart.add(item);
            System.out.println(item + " added to the shopping cart.");
        } else {
            System.out.println(item + " is not available in the inventory.");
        }
    }

    public void removeFromCart(String item) {
        if (shoppingCart.remove(item)) {
            System.out.println(item + " removed from the shopping cart.");
        } else {
            System.out.println(item + " is not in the shopping cart.");
        }
    }

    public void viewCart() {
        System.out.println("\nShopping Cart: " + shoppingCart);
    }

    // Wishlist methods
    public void addToWishlist(String item) {
        if (inventory.containsKey(item)) {
            if (wishList.add(item)) {
                System.out.println(item + " added to the wishlist.");
            } else {
                System.out.println(item + " is already in the wishlist.");
            }
        } else {
            System.out.println(item + " is not available in the inventory.");
        }
    }

    public void removeFromWishlist(String item) {
        if (wishList.remove(item)) {
            System.out.println(item + " removed from the wishlist.");
        } else {
            System.out.println(item + " is not in the wishlist.");
        }
    }

    public void modifyWishlist(String oldItem, String newItem) {
        if (wishList.contains(oldItem)) {
            wishList.remove(oldItem);
            wishList.add(newItem);
            System.out.println(oldItem + " replaced with " + newItem + " in the wishlist.");
        } else {
            System.out.println(oldItem + " is not in the wishlist.");
        }
    }

    public void viewWishlist() {
        System.out.println("\nWishlist: " + wishList);
    }

    public void searchItem(String item) {
        if (inventory.containsKey(item)) {
            System.out.println(item + " is available at ₹" + inventory.get(item));
        } else {
            System.out.println(item + " is not available in the inventory.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyntraApp app = new MyntraApp();

        System.out.println("Welcome to Myntra!");

        while (true) {
            System.out.println("\n1. View Inventory");
            System.out.println("2. Add Item to Inventory");
            System.out.println("3. Remove Item from Inventory");
            System.out.println("4. Modify Inventory Item");
            System.out.println("5. Add to Cart");
            System.out.println("6. Remove from Cart");
            System.out.println("7. View Cart");
            System.out.println("8. Add to Wishlist");
            System.out.println("9. Remove from Wishlist");
            System.out.println("10. Modify Wishlist Item");
            System.out.println("11. View Wishlist");
            System.out.println("12. Search for an Item");
            System.out.println("13. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    app.displayInventory();
                    break;

                case 2:
                    System.out.print("Enter the name of the item to add to inventory: ");
                    String addItemName = scanner.nextLine();
                    System.out.print("Enter the price of " + addItemName + ": ₹");
                    double addItemPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    app.addToInventory(addItemName, addItemPrice);
                    break;

                case 3:
                    System.out.print("Enter the name of the item to remove from inventory: ");
                    String removeItemName = scanner.nextLine();
                    app.removeFromInventory(removeItemName);
                    break;

                case 4:
                    System.out.print("Enter the name of the item to modify: ");
                    String modifyItemName = scanner.nextLine();
                    System.out.print("Enter the new price of " + modifyItemName + ": ₹");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    app.modifyInventory(modifyItemName, newPrice);
                    break;

                case 5:
                    app.displayInventory();
                    System.out.print("Enter the item to add to the cart: ");
                    String addToCartItem = scanner.nextLine();
                    app.addToCart(addToCartItem);
                    break;

                case 6:
                    System.out.print("Enter the item to remove from the cart: ");
                    String removeFromCartItem = scanner.nextLine();
                    app.removeFromCart(removeFromCartItem);
                    break;

                case 7:
                    app.viewCart();
                    break;

                case 8:
                    app.displayInventory();
                    System.out.print("Enter the item to add to the wishlist: ");
                    String addToWishlistItem = scanner.nextLine();
                    app.addToWishlist(addToWishlistItem);
                    break;

                case 9:
                    System.out.print("Enter the item to remove from the wishlist: ");
                    String removeFromWishlistItem = scanner.nextLine();
                    app.removeFromWishlist(removeFromWishlistItem);
                    break;

                case 10:
                    System.out.print("Enter the name of the wishlist item to replace: ");
                    String oldWishlistItem = scanner.nextLine();
                    System.out.print("Enter the new wishlist item: ");
                    String newWishlistItem = scanner.nextLine();
                    app.modifyWishlist(oldWishlistItem, newWishlistItem);
                    break;

                case 11:
                    app.viewWishlist();
                    break;

                case 12:
                    System.out.print("Enter the item to search: ");
                    String searchItem = scanner.nextLine();
                    app.searchItem(searchItem);
                    break;

                case 13:
                    System.out.println("Thank you for shopping with Myntra. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
