import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(
                in,
                "Enter your SSN (XXX-XX-XXXX)",
                "^\\d{3}-\\d{2}-\\d{4}$");

        System.out.println("SSN: " + ssn);

        String mNumber = SafeInput.getRegExString(
                in,
                "Enter UC M number",
                "^(M|m)\\d{5}$");

        System.out.println("M Number: " + mNumber);

        String choice = SafeInput.getRegExString(
                in,
                "Enter menu choice (O/S/V/Q)",
                "^[OoSsVvQq]$");

        System.out.println("Menu choice: " + choice);
    }
}