package UKL;

import java.util.Random;
import java.util.Scanner;

public class soal2no3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continueQuiz = true;

        System.out.println("Selamat datang di Kuis Matematika!");
        
        while (continueQuiz) {
            int bilanganPertama = random.nextInt(10); // Bilangan pertama antara 0-99
            int bilanganKedua = random.nextInt(10) + 1; // Bilangan kedua antara 1-99 untuk menghindari pembagian dengan nol
            String operator;
            int hasil = 0;

            int operatorIndex = random.nextInt(3);
            switch (operatorIndex) {
                case 0:
                    operator = "x";
                    hasil = bilanganPertama * bilanganKedua;
                    break;
                case 1:
                    operator = "/";
                    hasil = bilanganPertama / bilanganKedua;
                    break;
                case 2:
                    operator = "%";
                    hasil = bilanganPertama % bilanganKedua;
                    break;
                default:
                    continue;
            }

            System.out.printf("%d %s %d = ?\n", bilanganPertama, operator, bilanganKedua);
            System.out.print("Jawab (atau ketik 'exit' untuk berhenti): ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                continueQuiz = false;
                System.out.println("Terima kasih telah bermain!");
                break;
            }

            try {
                int jawabanUser  = Integer.parseInt(userInput);
                if (jawabanUser  == hasil) {
                    System.out.println("Jawaban Anda Tepat sekali!");
                } else {
                    System.out.println("Jawaban Anda salah. Hasil yang benar adalah: " + hasil);
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka atau ketik 'exit' untuk berhenti.");
            }
        }

        scanner.close();
    }
}  