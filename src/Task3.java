import java.util.Scanner;

public class Task3 {
    void Method_task_3(String str) {
        Scanner input = new Scanner (System.in);
        System.out.print("Введите операцию, которую хотите сделать(+,*,-,/):  ");
        String user = input.nextLine();
        String[] words = str.split("\\s");
        int[] array = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            array[i] = Integer.parseInt(words[i]);
        }
        int value1 = array[0];
        int value2 = array[1];

        if(user.equals("+")){
            System.out.print(value1+value2);
        }
        else if(user.equals("*")){
            System.out.print(value1*value2);
        }
        else if(user.equals("-")){
            System.out.print(value1-value2);
        }
        else if(user.equals("/")){
            System.out.print(value1/value2);
        }
        else
            System.out.print("value1/value2");
    }
}
