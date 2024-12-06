package UKL;

import java.util.Scanner;

public class soal2no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            long faktorial = hitungFaktorial(number);
            System.out.println("Faktorial dari " + number + " adalah: " + faktorial);
        }
        
        scanner.close();
    }
    public static long hitungFaktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }
}