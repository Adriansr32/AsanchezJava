package exercises.warehouse.test;

import exercises.warehouse.*;
import exercises.warehouse.drinks.*;

public class Main {
    public static void main(String[] args) {
        WareHouse wareHouse = new WareHouse(5, 7);

        wareHouse.addDrink(new SoftDrink(1.0f, 2.0f, "Coca-Cola", 4.2f, true), 1, 0);
        wareHouse.addDrink(new MineralWater(1.0f, 2.0f, "Coca-Cola", "me casa"), 3, 0);
        wareHouse.addDrink(new SoftDrink(1.0f, 2.0f, "Fanta", 4.2f, false), 1, 2);

        int option;
        do {
            System.out.println("\n1. Add drink");
            System.out.println("2. Calculate price");
            System.out.println("3. Display information");
            System.out.println("4. Exit");

            option = InputHelper.readInt("Write an option: ");

            switch (option) {
                case 1:
                    int drink = InputHelper.readInt("¿Qué tipo de bebida quieres? (1 = Agua, 2 = Refresco): ");

                    float capacity = InputHelper.readFloat("Capacidad de la bebida: ");
                    float price = InputHelper.readFloat("Precio de la bebida: ");
                    String brand = InputHelper.readString("Marca de la bebida: ");

                    if (drink == 1) { 
                        String source = InputHelper.readString("Origen del manantial del agua: ");
                        wareHouse.addDrink(new MineralWater(capacity, price, brand, source));
                    } else { 
                        float sugar = InputHelper.readFloat("Azúcar de la bebida: ");
                        boolean promotion = InputHelper.readBoolean("¿Tiene promoción? (true o false): ");
                        wareHouse.addDrink(new SoftDrink(capacity, price, brand, sugar, promotion));
                    }
                    break;

                case 2:
                    System.out.println("Precio total: " + wareHouse.totalCost());
                    break;

                case 3:
                    wareHouse.displayInformation();
                    break;

                case 4:
                    System.out.println("¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (option != 4);
    }
}
