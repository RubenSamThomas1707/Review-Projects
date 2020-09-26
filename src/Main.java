/*
Name: Ruben Sam Thomas
Net ID: rst180005
 */

import java.util.*;
import java.lang.*;

public class Main
{
        //  Function to convert a binary number to decimal
    public static int bin2Dec(String binNumber) throws BinaryFormatException
    {
        int decimalValue = 0;

            //Checking to see if the character in the string entered is either 1 or 0
        for(int i = (binNumber.length() - 1), counter = 0; i >= 0; i--, counter++)
        {
            if (binNumber.charAt(i) == '1' | binNumber.charAt(i) == '0')
            {
                //  Checking to see if the number is specifically 1
                if (binNumber.charAt(i) == '1')
                {
                    //  if the number is 1, then raising the number to the corresponding power
                    decimalValue = decimalValue + ((int) Math.pow(2, counter));
                }
            }

            else
            {
                throw new BinaryFormatException("The number entered is not in binary.");
            }
        }
        return decimalValue;
    }


    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> arrList1 = new ArrayList<>();
        GenericList <Integer> sampleGen= new GenericList<Integer>();

        sampleGen.setList(10);
        sampleGen.setList(15);
        sampleGen.setList(9);
        sampleGen.setList(5);
        sampleGen.setList(2);

        System.out.println(sampleGen.getList());
        sampleGen.InsertionSort();
        System.out.println(sampleGen.getList());

        boolean found = sampleGen.BinarySearch(10);
        System.out.println("Is number 10 in the array? " + found);

        found = sampleGen.BinarySearch(11);
        System.out.println("Is number 11 in the array? " + found);

        try
        {
            System.out.println("Enter a binary number");
            String binNumber = userInput.next();

            int decimalValue = bin2Dec(binNumber);

            System.out.println("The equivalent decimal value for the binary number entered is " + decimalValue);
        }

        catch(BinaryFormatException exception)
        {
            System.out.println(exception);
        }


    }
}
