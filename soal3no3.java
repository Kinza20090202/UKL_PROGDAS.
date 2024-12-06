package UKL;

import java.util.Scanner;

public class soal3no3 {
    public static void main(String[] args) {
        Scanner kins = new Scanner(System.in);

        System.out.print("Masukkan jumlah Array: ");
        int n = kins.nextInt();
        int[] array = new int[n];
        boolean[] kinss = new boolean[n];
        System.out.println("Masukkan elemen Array:");
        for (int i = 0; i < n; i++) {
            array[i] = kins.nextInt();
        }

        System.out.println("Frekuensi elemen dalam array:");
        for (int i = 0; i < n; i++) {
            if (!kinss[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        kinss[j] = true;
                    }
                }
                System.out.println(array[i] + " muncul " + count + " kali");
            }
        }

        kins.close();
    }
}