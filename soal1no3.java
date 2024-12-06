package UKL;

public class soal1no3 {
    public static void main(String[] args) {
        String[] messages = {
            "saya anak moklet",
            "saya anak wikusama",
            "saya angkatan 33"
        };

        for (int i = 50; i > 0; i--) {
            if (i % 3 == 0) {
                System.out.println(i + ". " + messages[2]); 
            } else if (i % 2 == 0) {
                System.out.println(i + ". " + messages[0]); 
            } else {
                System.out.println(i + ". " + messages[1]); 
            }
        }
        System.out.println("1. saya senang");
}
}