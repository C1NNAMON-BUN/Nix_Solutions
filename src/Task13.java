import java.util.Arrays;

public class Task13 {
    static void Method_task_13() {
        int size = (int) (Math.random() * (5 - 2)) + 2;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (-10 - 10)) + 10;
            System.out.print(array[i] + " ");
        }
        int max = 0;
        int min = 0;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
                max = array[0];
                min = array[size-1];
            }
        }
        System.out.print("\nМаксимальное значение = "+max+"\nМинимальное значение = "+min);

    }
}
