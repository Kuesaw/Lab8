
import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("Name: " + name);

        int number = SafeInput.getInt(in, "Enter an integer");
        System.out.println("Integer: " + number);

        double decimal = SafeInput.getDouble(in, "Enter a double");
        System.out.println("Double: " + decimal);

        int rangedInt = SafeInput.getRangedInt(in, "Enter age", 1, 100);
        System.out.println("Age: " + rangedInt);

        double rangedDouble = SafeInput.getRangedDouble(in, "Enter price", 0.50, 10.00);
        System.out.println("Price: " + rangedDouble);

        boolean answer = SafeInput.getYNConfirm(in, "Continue");
        System.out.println("Answer: " + answer);

        String ssn = SafeInput.getRegExString(
                in, "Enter SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN: " + ssn);

        SafeInput.prettyHeader("Testing Complete");
    }
}
