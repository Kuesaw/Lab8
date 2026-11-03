
import java.util.Scanner;

public class SafeInput
{
    /**
     * Gets a non-empty String.
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";

        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        }
        while (retString.length() == 0);

        return retString;
    }

    /**
     * Gets any integer.
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retValue = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextInt())
            {
                retValue = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                System.out.println("Invalid input. Enter an integer.");
                pipe.nextLine();
            }

        } while (!done);

        return retValue;
    }

    /**
     * Gets any double.
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retValue = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextDouble())
            {
                retValue = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                System.out.println("Invalid input. Enter a number.");
                pipe.nextLine();
            }

        } while (!done);

        return retValue;
    }

    /**
     * Gets an integer within an inclusive range.
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retValue = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextInt())
            {
                retValue = pipe.nextInt();
                pipe.nextLine();

                if (retValue >= low && retValue <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Number must be between " + low + " and " + high);
                }
            }
            else
            {
                System.out.println("Invalid input. Enter an integer.");
                pipe.nextLine();
            }

        } while (!done);

        return retValue;
    }

    /**
     * Gets a double within an inclusive range.
     */
    public static double getRangedDouble(Scanner pipe, String prompt,
                                         double low, double high)
    {
        double retValue = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextDouble())
            {
                retValue = pipe.nextDouble();
                pipe.nextLine();

                if (retValue >= low && retValue <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Number must be between " + low + " and " + high);
                }
            }
            else
            {
                System.out.println("Invalid input. Enter a number.");
                pipe.nextLine();
            }

        } while (!done);

        return retValue;
    }

    /**
     * Gets a Yes or No response.
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String response = "";

        do
        {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine();

            if (response.equalsIgnoreCase("Y"))
            {
                return true;
            }
            else if (response.equalsIgnoreCase("N"))
            {
                return false;
            }
            else
            {
                System.out.println("Please enter Y or N.");
            }

        } while (true);
    }

    /**
     * Gets a String matching a regular expression.
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String response = "";

        do
        {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();

            if (!response.matches(regEx))
            {
                System.out.println("Invalid input. Please try again.");
            }

        } while (!response.matches(regEx));

        return response;
    }

    /**
     * Prints a centered 60-character header.
     */
    public static void prettyHeader(String msg)
    {
        int totalWidth = 60;
        int stars = 3;
        int availableSpace = totalWidth - (stars * 2);
        int leftSpaces = (availableSpace - msg.length()) / 2;
        int rightSpaces = availableSpace - msg.length() - leftSpaces;

        for (int i = 0; i < totalWidth; i++)
        {
            System.out.print("*");
        }

        System.out.println();

        System.out.print("***");

        for (int i = 0; i < leftSpaces; i++)
        {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int i = 0; i < rightSpaces; i++)
        {
            System.out.print(" ");
        }

        System.out.println("***");

        for (int i = 0; i < totalWidth; i++)
        {
            System.out.print("*");
        }

        System.out.println();
    }
}
