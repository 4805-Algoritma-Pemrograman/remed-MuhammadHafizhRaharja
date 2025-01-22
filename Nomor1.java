import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan total kilometer: ");
        int totalKm = scanner.nextInt();
        
        double honorTaksi;
        
        if (totalKm < 3) {
            honorTaksi = 20000;
        } else {
            honorTaksi = 20000 + (totalKm - 3) * 10000;
        }
        
        System.out.println("Total km: " + totalKm);
        System.out.println("Honor taksi:" + honorTaksi);
        
        scanner.close();
    }
}
