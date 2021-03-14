package sample;

import java.util.Scanner;

public class TrainingEquipment extends SportsEquipment {
    private int weight;
    private String matherial;

    @Override
    protected void init(Scanner scanner) {
        super.init(scanner);
        do {
            System.out.print("Вес оборудования (кг): ");
            try {
                //this.weight = InventoryManagement.getInt(scanner);
            } catch (Exception e) {
                this.weight = 0;
            }
        } while (this.weight < 0);
        do {
            System.out.print("Материал из которого сделано оборудование: ");
            this.matherial = scanner.nextLine();

        } while (this.matherial.isEmpty());
    }

    @Override
    public String toString() {
        String str = super.toString();
        return (str + "\n\tВес: " + this.weight + " кг \n\tМатерил: " + this.matherial);
    }

    static class Weight extends TrainingEquipment {
        int price;

        @Override
        protected void init(Scanner scanner) {
            super.init(scanner);
            do {
                System.out.print("Введите цену оборудования (руб) : ");
                try {
                    //this.price = InventoryManagement.getInt(scanner);
                } catch (Exception e) {
                    this.price = 0;
                }
            } while (this.price < 0);
        }
        @Override
        public String toString() {
            String str = super.toString();
            return ("Штанга" + str + "\n\tЦена оборудования (руб) : " + this.price);
        }
    }
    //Гиря
    static class Barbel extends TrainingEquipment {
        int diametr;
        @Override
        protected void init(Scanner scanner) {
            super.init(scanner);
            do {
                System.out.print("Введите диаметр окружности гири: ");
                try {
                    //this.diametr = InventoryManagement.getInt(scanner);
                } catch (Exception e) {
                    this.diametr = 0;
                }
            } while (this.diametr < 0);
        }
        @Override
        public String toString() {
            String str = super.toString();
            return ("Гиря" + str + "\n\tДиаметрг окружности гири: " + this.diametr + "см");
        }
    }
}
