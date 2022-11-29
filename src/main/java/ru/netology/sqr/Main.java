package ru.netology.sqr;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();

        System.out.println(service.calcSQR(350, 500) + " - количество квадратов в заданном диапазоне");

    }
}