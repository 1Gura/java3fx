package sample;

import java.util.Scanner;

public class Racket extends SportsEquipment {
    private int weight;
    private int length;
    @Override
    protected void init(Scanner scanner) {
        super.init(scanner);
        do {
            System.out.print("Вес ракетки (г): ");
            try {
                //this.weight = InventoryManagement.getInt(scanner);
            } catch (Exception e) {
                this.weight = 0;
            }
        } while (this.weight < 0);

        do {
            System.out.print("Длина ракетки (см): ");
            try {
               // this.length = InventoryManagement.getInt(scanner);
            } catch (Exception e) {
                this.length = 0;
            }
        } while (this.length < 0);

    }
    @Override
    public String toString() {
        String str = super.toString();
        return ("Ракетка" + str + "\n\tВес ракетки: " + this.weight + "\n\tДлина ракетки: " + this.length);
    }
}
