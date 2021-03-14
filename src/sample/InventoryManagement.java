package sample;

import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.Flow;


public class InventoryManagement {
    protected SportsEquipment[] sportsEquipments = new SportsEquipment[100];
    protected ArrayList<SportsEquipment> sportsEquipmentArrayList = new ArrayList<SportsEquipment>();
    public Label label1;
    public Label label2;
    public Label label3;
    public Label label4;
    public TextField textField1;
    public TextField textField2;
    public TextField textField3;
    public TextField textField4;
    public Button button;


    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int getInt(String string) {
        string = string.replaceAll("\\D", " ");
        String[] strArray = string.split(" ");
        int firstNumber = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (isNumeric(strArray[i])) {
                firstNumber = Integer.parseInt(strArray[i]);
                break;
            }
        }
        if (firstNumber > 0) {
            return firstNumber;
        } else {
            return 0;
        }
    }

    public void addItemList(SportsEquipment sportsEquipment) {
        this.sportsEquipmentArrayList.add(sportsEquipment);
    }

    public void addItem(TextField field1, TextField field2, TextField field3, TextField field4, String str) {
        switch (str) {
            case "Волейбольный мяч" -> {
                Ball.Volleyball volleyball = new Ball.Volleyball(
                        field1.getText(),
                        getInt(field2.getText()),
                        getInt(field3.getText()),
                        getInt(field4.getText()));
                addItemList(volleyball);
            }
            case "Теннисный мяч" -> {
                Ball.TennisBall tennisBall = new Ball.TennisBall(
                        field1.getText(),
                        getInt(field2.getText()),
                        getInt(field3.getText()),
                        field4.getText());
                addItemList(tennisBall);
            }
            case "Ракетка" -> {

            }
            case "Штанга" -> {

            }
            case "Гиря" -> {

            }
            case "Метательное копье" -> {

            }
        }
    }

    public HBox setTypeEquipment(String str) {
        switch (str) {
            case "Волейбольный мяч" -> {
                this.label1 = new Label("Выберите вид спорта:");
                this.label2 = new Label("Вес мяча (г)");
                this.label3 = new Label("Диаметр мяча");
                this.label4 = new Label("Внутренне давление мяча");
                this.textField1 = new TextField();
                this.textField2 = new TextField();
                this.textField3 = new TextField();
                this.textField4 = new TextField();
                this.button = new Button("Добавить");
                button.setOnAction(actionEvent -> {
                    Ball.Volleyball volleyball = new Ball.Volleyball();
                    addItem(this.textField1, this.textField2, this.textField3, this.textField4, str);
                });
                return new HBox(new FlowPane(Orientation.VERTICAL, 20, 20,
                        label1,
                        textField1,
                        label2,
                        textField2,
                        label3,
                        textField3,
                        label4,
                        textField4,
                        button
                ));
            }
            case "Теннисный мяч" -> {
                this.label1 = new Label("Выберите вид спорта:");
                this.label2 = new Label("Вес мяча (г)");
                this.label3 = new Label("Диаметр мяча");
                this.label4 = new Label("Цвет мяча");
                this.textField1 = new TextField();
                this.textField2 = new TextField();
                this.textField3 = new TextField();
                this.textField4 = new TextField();
                this.button = new Button("Добавить");
                button.setOnAction(actionEvent -> {
                    addItem(this.textField1, this.textField2, this.textField3, this.textField4, str);
                });
                return new HBox(new FlowPane(Orientation.VERTICAL, 20, 20,
                        label1,
                        textField1,
                        label2,
                        textField2,
                        label3,
                        textField3,
                        label4,
                        textField4,
                        button
                ));
            }
            case "Ракетка" -> {
                return new HBox();


            }
            case "Штанга" -> {
                return new HBox();


            }
            case "Гиря" -> {
                return new HBox();


            }
            case "Метательное копье" -> {
                return new HBox();


            }
        }
        return new HBox();

    }

    public String outEquipmentAll() {
        StringBuilder stringBuilder = new StringBuilder();
        for (SportsEquipment equipment : sportsEquipmentArrayList) {
            stringBuilder.append(equipment.toString());
        }
        return stringBuilder.toString();
    }

    public void outEquipmentTennis(SportsEquipment[] sportsEquipments) {
        System.out.println("Вывод теннисного оборудования.");
        for (SportsEquipment equipment : sportsEquipments) {
            if (equipment.getSportType().toLowerCase(Locale.ROOT).equals("теннис")) {
                System.out.println(equipment.toString());
            }
        }
    }
}
