package ticket_AdriánSánchez;

import java.util.*;

/**
 * Represents a shopping list with multiple items and a purchase date.
 */
public class ShoppingList {
    private ArrayList<ShoppingListItem> shoppingListItems;
    private Date purchaseDate;

    /**
     * Creates a new shopping list with the current date.
     */
    ShoppingList() {
        this.shoppingListItems = new ArrayList<>();
        this.purchaseDate = new Date();
    }

    /**
     * Adds an item to the shopping list.
     *
     * @param item The item to be added.
     */
    public void add(ShoppingListItem item) {
        shoppingListItems.add(item);
    }

    /**
     * Calculates the total amount of all items in the shopping list.
     *
     * @return The total amount in euros.
     */
    public double getTotalAmount() {
        double total = 0;
        for (ShoppingListItem item : shoppingListItems) {
            total += item.getTotalAmount();
        }
        return total;
    }

    /**
     * Returns a string representation of the shopping list,
     * including the items and the total amount.
     *
     * @return A string with the shopping list details.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shopping Receipt:\n");

        for (ShoppingListItem item : shoppingListItems) {
            sb.append(item.toString()).append("\n");
        }

        sb.append("Total: ").append(getTotalAmount()).append("€");

        return sb.toString();
    }
}
