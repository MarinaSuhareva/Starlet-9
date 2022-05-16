package ru.netology.sqr;
public class Main {
    public static void main(String[] args) {
        System.out.println(" Учиться учиться и внимательно!");
        SQRService service = new SQRService();
        int p = service.numericRoots( 200, 300);

        System.out.println(p);

    }
}
