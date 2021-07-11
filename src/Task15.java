public class Task15 {
    static void Method_task_15() {
//        int size = (int) (Math.random() * (5 - 2)) + 2;
//        int[] array = new int[size];
//        int[] array2 = new int[size];
        int[] array={1,2,3,4,2,33,3};
        int[] array2 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * (-10 - 10)) + 10;
            System.out.print(array[i] + " ");
        }
        int integer = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    array2[integer]=array[i];
                    integer++;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < integer; i++) {
            System.out.print(array2[i]+" ");
        }
    }
}


