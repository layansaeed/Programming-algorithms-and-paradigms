package com.company;

public class Part1
{

    public static void main (String[]args)
    {
        // Test binaryToDecimal
        int binary = 1111001111;
        int decimal = binaryToDecimal(binary);
        System.out.println("The decimal number of " + binary + " is " + decimal);

        // Test decimalToDigital
        String digital = decimalToDigital(decimal);
        System.out.println("The digital number of " + decimal + " is " + digital);

    }

    public static int binaryToDecimal (int binary)
    {
      /*
        1       0       0       1       1
      * 2^4     2^3     2^2     2^1     2^0
        16  +   0   +   0   +   2   +   1   = 19
      */
        int decimal = 0;
        int n = 0; // Power
        while (binary != 0)
        {
            /*
            * 101111
            * 10111
            * 1011
            * 101
            * 10
            * 1
            * 0
            */


            int temp = binary % 10;	// Get the least significant digit (Right most)

            /*
             * 12576 % 10 = 6
             * 12576 % 100 = 76
             */

            if(temp != 0)
                decimal += temp * Math.pow (2, n); // Calculate

            binary = binary / 10;	// Remove the least significant digit (Right most)

            /*
            * 12365 / 10 = 1236.5 => 1236
            * 1 / 10 = 0.1 => 0 binary = 0 => break
            */

            n++; // Increase the power
        }
        return decimal;
    }

    public static String decimalToDigital (int decimal)
    {

        // Integer.toString => Convert int to String
        // Move from left to right
        // 1234 => "1234"
        String digital = "\n";

        /* 0 1 2 3 4
           5 6 7 8 9 */

        String numbersRow1[] = {
                " _  ", "    ", " _  ", " _  ", "    ",
                " _  ", " _  ", " _  ", " _  ", " _  "
        };
        String numbersRow2[] = {
                "| | ", "  | ", " _| ", " _| ", "|_| ",
                "|_  ", "|_  ", "  | ", "|_| ", "|_| "
        };
        String numbersRow3[] = {
                "|_| ", "  | ", "|_  ", " _| ", "  | ",
                " _| ", "|_| ", "  | ", "|_| ", "  | "
        };

        /*
        * [positive int]
        * [String] x
        * name = "mohammad"
        * name[6] = a
        * name.charAt(6) = 'a'
        * String + char = String
        * */

        String decimalString = Integer.toString(decimal);


        for(int i=0;i<decimalString.length();i++) // Floor number 1
        {
            /*
            * i    : 01234
            * digit: 57103
            * */
            int digit = Integer.parseInt("" + decimalString.charAt(i));

            // Integer.parseInt => Convert "String" to int
            // String.charAt(location) => Get the char at location
            // "" + char => String (String + char = String)
            // 5 numberRow1[5] => _

            digital += numbersRow1[digit];
        }
        digital += "\n";

        for(int i=0;i<decimalString.length();i++) // Floor number 2
        {
            int digit = Integer.parseInt("" + decimalString.charAt(i));
            // 5 numberRow2[5] => |_
            digital += numbersRow2[digit];
        }
        digital += "\n";

        for(int i=0;i<decimalString.length();i++) // Floor number 3
        {
            int digit = Integer.parseInt("" + decimalString.charAt(i));
            // 5 numberRow3[5] =>  _|
            digital += numbersRow3[digit];
        }
        digital += "\n";

        /* 29
        * \n
        * row1 =>  _   _  \n
        * row2 =>  _| |_| \n
        * row3 => |_    | \n
        *
        * digital = "\n  _   _  \n  _| |_| \n |_    | \n"
        * */

        return digital;
    }

    public static long binaryToDecimal (long binary)
    {
        int decimal = 0;
        int n = 0;
        while (binary != 0)
        {
            long temp = binary % 10;
            if(temp != 0)
                decimal += temp * Math.pow (2, n);
            binary = binary / 10;
            n++;
        }
        return decimal;
    }

    public static int binaryToDecimal (String binary)
    {
      /*
        0       1       2       3       4
        1       0       0       1       1
      * 2^4     2^3     2^2     2^1     2^0
        16  +   0   +   0   +   2   +   1   = 19
      */
        int decimal = 0;
        int length = binary.length();
        for(int i=0;i<length;i++){
            //                   i  => 0  1  2  3  4
            // length = 5 => powers => 4, 3, 2, 1, 0
            decimal += Integer.parseInt("" + binary.charAt(i)) * Math.pow(2,length - 1 - i );
        }
        return decimal;
    }


}



