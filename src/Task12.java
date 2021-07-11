public class Task12 {
    void Method_task_12() {
        int size = (int) (Math.random() * (5 - 2)) + 2;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (10 - 1)) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        double sum = 0;
        for (int value:array) {
            if (value>0) {
                 sum += value;
            }
        }
        System.out.println(sum/array.length);
    }
}
