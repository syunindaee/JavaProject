import java.util.Scanner;
public class day02 {

    public static void main(String[] args) {

        Scanner korean = new Scanner(System.in);
        Scanner english = new Scanner(System.in);
        Scanner math = new Scanner(System.in);

        int a = korean.nextInt();
        int b = english.nextInt();
        int c = math.nextInt();

        int total = a+b+c;
        int avg = total/3;

        System.out.println("sum " + total);
        System.out.println("avg " + avg);

    }


}
