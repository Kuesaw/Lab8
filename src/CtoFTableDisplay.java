public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        System.out.printf("%-15s %s%n", "Celsius", "Fahrenheit");

        System.out.println("----------------------------");

        for (int celsius = -100; celsius <= 100; celsius++)
        {
            double fahrenheit = CtoF(celsius);

            System.out.printf("%-15d %.2f%n", celsius, fahrenheit);
        }
    }

    public static double CtoF(double Celsius)
    {
        return (Celsius * 9.0 / 5.0) + 32;
    }
}