package provaTest2;

import java.util.ArrayList;

public class WareHouse {
    private Drink[][] rackSelves;
    private int row;
    private int column;

    public WareHouse(int row, int column) {
        this.row = row;
        this.column = column;
        this.rackSelves = new Drink[row][column];
    }

    public double totalCost() {
        double total = 0.0;
        for (int i = 0; i < rackSelves.length; i++) {
            for (int j = 0; j < rackSelves[i].length; j++) {
                if (rackSelves[i][j] != null) {
                    total += rackSelves[i][j].getCost();
                }
            }
        }
        return total;
    }

    public void addDrink(Drink newDrink, int row, int column) {
        if (row >= 0 && row < this.row && column >= 0 && column < this.column) {
            if (rackSelves[row][column] == null) {
                rackSelves[row][column] = newDrink;
            } else {
                System.out.println("Aquesta posició està ocupada!");
            }
        } else {
            System.out.println("Posició fora de límits!");
        }
    }

    public void addDrink(Drink newDrink) {
        for (int i = 0; i < rackSelves.length; i++) {
            for (int j = 0; j < rackSelves[i].length; j++) {
                if (rackSelves[i][j] == null) {
                    rackSelves[i][j] = newDrink;
                    System.out.println("Beguda afegida correctament a la posició " + (i + 1) + (char) ('A' + j));
                    return;
                }
            }
        }
        System.out.println("Alert: El magatzem està ple!");
    }

    public void displayInformation() {
        ArrayList<SoftDrink> softDrinks = new ArrayList<>();
        ArrayList<MineralWater> mineralWaters = new ArrayList<>();
        ArrayList<String> checkedBrands = new ArrayList<>();
        ArrayList<String> checkedOrigins = new ArrayList<>();

        for (int i = 0; i < rackSelves.length; i++) {
            for (int j = 0; j < rackSelves[i].length; j++) {
                if (rackSelves[i][j] instanceof SoftDrink) {
                    softDrinks.add((SoftDrink) rackSelves[i][j]);
                } else if (rackSelves[i][j] instanceof MineralWater) {
                    mineralWaters.add((MineralWater) rackSelves[i][j]);
                }
            }
        }

        System.out.println("Aquest magatzem conté:");
        for (SoftDrink drink : softDrinks) {
            String brand = drink.getTradeMark();
            if (!checkedBrands.contains(brand)) {
                int count = 0;
                for (SoftDrink d : softDrinks) {
                    if (d.getTradeMark().equals(brand)) {
                        count++;
                    }
                }
                System.out.println("- " + count + " refrescos de la marca " + brand);
                checkedBrands.add(brand);
            }
        }

        for (MineralWater water : mineralWaters) {
            String origin = water.getSource();
            if (!checkedOrigins.contains(origin)) {
                int count = 0;
                for (MineralWater w : mineralWaters) {
                    if (w.getSource().equals(origin)) {
                        count++;
                    }
                }
                System.out.println("- " + count + " aigües minerals de l'origen " + origin);
                checkedOrigins.add(origin);
            }
        }
    }
}
