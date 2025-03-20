package ticket_AdriánSánchez;

/**
 * Represents an item in a shopping list.
 */
public class ShoppingListItem {
    private String name;
    private int quantity;
    private double unitPrice;

    /**
     * Creates a new shopping list item.
     *
     * @param name      The name of the item.
     * @param quantity  The quantity of the item.
     * @param unitPrice The unit price of the item.
     */
    public ShoppingListItem(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    /**
     * Calculates the total cost of the item based on quantity and unit price.
     *
     * @return The total cost in euros.
     */
    public double getTotalAmount() {
        return quantity * unitPrice;
    }

    /**
     * Updates the quantity of the item.
     *
     * @param newValue The new quantity.
     */
    public void setQuantity(int newValue) {
        this.quantity = newValue;
    }

    /**
     * Returns a string representation of the item, including quantity, name, 
     * unit price, and total cost.
     *
     * @return A formatted string with item details.
     */
    @Override
    public String toString() {
        return quantity + "x " + name + " - " + unitPrice + "€/u - Total: " + getTotalAmount() + "€";
    }
}
