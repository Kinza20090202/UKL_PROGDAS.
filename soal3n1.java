package UKL;

import java.util.Scanner;

public class soal3n1 {
    public static void main(String[] args) {
        Scanner kins = new Scanner(System.in);
        System.out.println("masukkan jumlah siswa: ");
        int jumlahsiswa = kins.nextInt();

        double[] nilaisiswa = new double[jumlahsiswa];
        for (int i = 0; i < jumlahsiswa; i++) {
            System.out.println("masukkan nilai siswa ke-"+(i+1)+":");
            nilaisiswa[i] = kins.nextDouble();
        }
        double totalnilai = 0;
        for (double nilai:nilaisiswa){
            totalnilai += nilai;
        }
        double ratarata = totalnilai/jumlahsiswa;
        System.out.println("rata rata nilai ujian: ");
    }
}
