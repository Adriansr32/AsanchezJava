package ticket_AdriánSánchez;

public class RunShopping {

    public static void main(String[] args) {
        ShoppingListItem bread = new ShoppingListItem("Bread", 2, 1.5);
        ShoppingListItem milk = new ShoppingListItem("Milk", 1, 0.99);
        ShoppingListItem apples = new ShoppingListItem("Apples", 3, 0.75);
        
        ShoppingList shoppingList = new ShoppingList();

        shoppingList.add(bread);
        shoppingList.add(milk);
        shoppingList.add(apples);

        System.out.println(shoppingList);
    }
}
