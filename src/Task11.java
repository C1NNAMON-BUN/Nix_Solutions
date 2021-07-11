public class Task11 {
    static void Bubble_Sort_Ascending(int[]array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
    static void Bubble_Sort_Descending(int[]array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    static void Method_task_11() {
        int size = (int) (Math.random() * (5 - 2)) + 2;
        int []array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (10 - 1)) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //Bubble_Sort_Ascending(array);
        //Bubble_Sort_Descending(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
