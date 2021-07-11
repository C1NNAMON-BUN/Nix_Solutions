public class Task14 {
    static void Method_task_14() {
        int size = (int) (Math.random() * (5 - 2)) + 2;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (-10 - 10)) + 10;
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array [array.length - 1 - i] = temp;
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }

    }



