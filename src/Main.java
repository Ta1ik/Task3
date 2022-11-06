import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * Задача к билету №3
         * Напишите программу, которая разделяет любую строку на две части ровно пополам по количеству символов.
         */
        String s = "12345678";
        String[] devider = new String[2];
        if (s.length() % 2 == 0) {
            devider[0] = s.substring(0, s.length() / 2);
            devider[1] = s.substring(s.length() / 2);
        } else {
            devider[0] = s.substring(0, s.length() / 2);
            devider[1] = s.substring(s.length() / 2);
        }
        System.out.println(Arrays.toString(devider));
    }
}