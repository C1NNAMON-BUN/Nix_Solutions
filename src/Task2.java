public class Task2 {
    void Method_task_2(String str) {
        String[] words = str.split("\\s");
        for (String subStr : words) {
            System.out.println(subStr);
        }
    }
}
