//недоделано
public class Task16 {
    static void Method_task_16() {
        int[] array={1,2,3,4,2,33,3};
        int[] array2 = {1,5,4};
        int[] array3 = {};

        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * (-10 - 10)) + 10;
            System.out.print(array[i] + " ");
        }
        int integer = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    int tmp = array[i];
                    array3[integer] = tmp;
                    integer++;
                }
            }
        }
            System.out.println();
        for (int i = 0; i < integer; i++) {
            System.out.print(array3[i]+" ");
        }
    }
}
