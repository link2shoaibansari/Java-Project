import java.util.Scanner;
public class checking_int_or_float {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        sc.close();
    }
}