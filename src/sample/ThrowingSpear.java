package sample;

import java.util.Scanner;

public class ThrowingSpear extends SportsEquipment {
    private int weight;
    private int length;

    @Override
    protected void init(Scanner scanner) {
        super.init(scanner);
        do {
            System.out.print("Вес копья (кг): ");
            try {
               //this.weight = InventoryManagement.getInt(scanner);
            } catch (Exception e) {
                this.weight = 0;
            }
        } while (this.weight < 0);

        do {
            System.out.print("Длина копья (см): ");
            try {
                //this.length = InventoryManagement.getInt(scanner);
            } catch (Exception e) {
                this.length = 0;
            }
        } while (this.length < 0);

    }

    @Override
    public String toString() {
        String str = super.toString();
        return ("Копье метательное" + str + "\n\tВес копья: " + this.weight + "\n\tДлина копья: " + this.length);
    }
}
