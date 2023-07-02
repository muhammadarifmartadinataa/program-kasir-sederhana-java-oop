package util;

import java.util.Scanner;

public class InputUtil {
    private static Scanner scanner= new Scanner(System.in);
    public  static String input(String info){
        System.out.print(info +" : ");
        String data = scanner.nextLine();
        return data;
    }
    public static Integer inputInteger(String info) {
        try {
            System.out.print(info + " : ");
            String data = scanner.nextLine();
            return Integer.parseInt(data);
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Harap masukkan angka.");
            return null;
        }
    }
}
