package Lab1_1;

import java.lang.Math;
import java.util.Scanner;

public class Dispatcher {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        double x = 0; // вхідний параметр
        double y = 0; // результат обчислення виразу
        double A = 0; // проміжний результат - функціонально стала частина виразу
        double B = 0; // проміжний результат - функціонально змінна частина виразу
        System.out.print("x = ");
		x = scan.nextDouble();
        A = (2 + x) / (x * x) + 1;
        // спосіб 1: розгалуження в скороченій формі
        if (x < 0){
            B = Math.pow(x, 3) - 2 * Math.pow(x, 4);
        }
        if (x <= 0 && x >= 2) {
            B = Math.pow(Math.abs(x) + Math.exp(x), 3);
        }
        if (x > 2) {
            B = 4 * Math.cos((x * x) - 2);
        }
        y = A + B;
        System.out.println("");
        System.out.println("1) y = " + String.format("%.2f", y));
        // спосіб 2: розгалуження в повній формі
        if (x < 0) {
            B = Math.pow(x, 3) - 2 * Math.pow(x, 4);
        }
        else if (x > 2) {
            B = 4 * Math.cos((x * x) - 2);
        }
        else {
            B = Math.pow(Math.abs(x) + Math.exp(x), 3);
        }
        y = A - B;
        System.out.println("2) y = " + String.format("%.2f", y));
	}

}