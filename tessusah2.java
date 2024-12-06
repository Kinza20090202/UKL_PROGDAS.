package UKL;

import java.util.Scanner;

public class tessusah2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Array: ");
        int n = s.nextInt();
        int[] array = new int[n];

        System.out.println("Masukkan elemen Array: ");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        boolean adaDuplikat = false;
        System.out.print("Array memiliki elemen duplikat: ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    adaDuplikat = true;
                    break;
                }
            }
        }

        if (!adaDuplikat) {
            System.out.println("Tidak ada elemen duplikat.");
        } else {
            System.out.println();
        }

        s.close();
    }
}