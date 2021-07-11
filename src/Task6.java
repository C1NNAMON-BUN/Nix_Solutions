import java.util.Scanner;

public class Task6 {
    void Method_task_6(String str) {
        int your_num = Integer.parseInt(str);
        int sum = 0;
        while (your_num > 0) {
            sum = sum + your_num % 10;
            your_num = your_num / 10;
        }
        System.out.print(sum);
    }
}
