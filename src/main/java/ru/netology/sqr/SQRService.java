package ru.netology.sqr;
public class SQRService {
    public int numericRoots( int boundary1, int boundary2) {
        int cont = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x > boundary1 && x < boundary2) {
                cont++;
            }
        }
        return cont;
    }
}
