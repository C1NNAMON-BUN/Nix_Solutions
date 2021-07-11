import java.util.Scanner;

public class Task5 {
    static void Method_task_5() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите температуру по Форенгейту:");
        int Fahrenheit = in.nextInt();
        double Celsius = (Fahrenheit - 32) / 1.8;
        System.out.printf("Результат:" + Celsius);
    }
}
