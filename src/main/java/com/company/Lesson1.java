package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1inci ededi daxil edin");
        double number1 = scanner.nextDouble();
        System.out.println("ikinci ededi daxil edin");
        double number2 = scanner.nextDouble();
        System.out.println("ucuncu ededi daxil edin");
        double number3 = scanner.nextDouble();

        double max, min;
        max = (number1 > number2) ? ((number1 > number3) ? number1 : number3) : ((number2 > number3) ? number2 : number3);
        System.out.println(max);

    }

    public static void example() {
        JOptionPane.showMessageDialog(null, "İmtahan nəticələrinin hesablanması, Qeyd: imtahan və seminar balı 0 və 50 arasında dəyişir");
        String seminar = JOptionPane.showInputDialog("Seminar balınızı daxil edin:");
        double seminarResult = Double.parseDouble(seminar);
        String example = JOptionPane.showInputDialog("İmtahan balınızı daxil edin:");
        double exampleResult = Double.parseDouble(example);
        double result;
        if (seminarResult >= 0 && seminarResult <= 50 && exampleResult >= 0 && exampleResult <= 50) {
            result = seminarResult + exampleResult;
            String endPoint = "Yekun nəticəniz: " + result;
            if (result > 50) {
                JOptionPane.showMessageDialog(null, endPoint, "Təbriklər! imtahandan keçdiniz: ", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, endPoint, "Təəssüf! imtahandan keçmədiniz: ", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Diqqət: imtahan ve ya seminar nəticəsini dügün daxil etməmisiniz.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
