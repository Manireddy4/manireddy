package AIDSIIB;

import java.util.Scanner;

public class Cr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of CR");
        String Cr1 = sc.next();
        Cr c11 = new Cr();
        c11.display(Cr1);
    }

    public void display(String Crs) {
        if (Crs.equalsIgnoreCase("mani")) {
            System.out.println("roll n o  of" + Crs + "is 68");
        } else {
            System.out.println("cr IS" + Crs);
        }
    }
}