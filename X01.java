// 12S24006 - Margareth Bungaran Sitompul
// 12S24012 - Choqy Pananda Sirait
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double palingmurah, harga, total;

        total = 0;
        palingmurah = 999;
        harga = Double.parseDouble(input.nextLine());
        while (harga != 0) {
            if (harga == 0) {
            } else {
                if (harga < palingmurah) {
                    palingmurah = harga;
                } else {
                    harga = harga;
                }
                total = total + harga;
            }
            harga = Double.parseDouble(input.nextLine());
        }
        if (total >= 100) {
            total = total - palingmurah;
        } else {
            total = total;
        }
        System.out.println(toFixed(total,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

