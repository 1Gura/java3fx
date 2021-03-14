package sample;

import java.util.Scanner;

abstract public class   SportsEquipment {
    protected String typeSport;

    protected void init(Scanner scanner) {
        do {
            System.out.print("Введите вид спорта: ");
            this.typeSport = scanner.nextLine();
        } while (this.typeSport.isEmpty());
    }

    protected String getSportType() {
        return this.typeSport;
    }

    @Override
    public String toString() {
        return ("\n\tВид спорта: " + typeSport);
    }
}
