import java.io.File;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        //Examples 1 & 2: Casting
        System.out.println("Examples 1 & 2: Testing Casting");
        boolean e = true, g;
        int f;
        //f = (int)e;
        f = 0;
        //boolean g = (boolean)f;
        g = false;
        System.out.println (e + " : " + f + " : " + g );

        double a = 6.5;
        a += a + 1;
        System.out.println(a);
        a = 6;
        a /= 2;
        System.out.println(a);

        int c = 6;
        float d = c++;
        System.out.println(c + " : " + d );

        c = (int)++a;
        System.out.println (c + " : " + d );

        //Example 3: Testing Scanner input
        System.out.println("\n\nExamples 3: Testing Scanner Input");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words separated by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);
        //getting the first character of s3
        char c3 = s3.charAt(0);
        System.out.println("First character of s3 = " + c3);

        //Example 4: Examples of Print Formatting
        System.out.println("\n\nExamples 4: Examples of Print Formatting");
        //formatting values for output
        double value = 16.404674;
        System.out.printf("Value of 16.404674 formatted to 2 decimals is $%4.2f", value);
        System.out.printf("Extends widths automatically:  %3d#%2s#%4.2f\n", 1234, "Java", 51.6653);
        System.out.printf("Right justify by default:      %8d%8s%8.1f\n", 1234, "Java", 5.63);
        System.out.printf("Use - to Left justify:         %-8d%-8s%-8.1f \n", 1234, "Java", 5.63);

        //Example 5: Examples using increment operators
        System.out.println("\n\nExamples 5: Testing increment operators");
        int x = 10;
        System.out.println(x + " :  " +  (++x) + " : " + x);
        System.out.println(x + " :  " +  (x++) + " : " + x);
        System.out.println(x + " :  " +  (x *= x) + " : " + x);

        //Example 6: Demonstrating Math Methods
        System.out.println("\n\nExamples 6: Math Methods");
        System.out.println("The area of a circle with radius 3 = " + (Math.PI*Math.pow(3,2)));
        System.out.println("Random values between 1 and 50: ");
        for (int i = 0; i < 10; i++){
            int randValue = (int)(Math.random()*50) + 1;
            System.out.printf("%10d ", randValue);
            if (randValue % 2 == 0)
                System.out.println(" is even.");
            else
                System.out.println(" is odd.");
        }

        //More Random examples
        System.out.println("\nRandom values between 0 and 9: ");
        for (int j = 0; j < 20; j++)
            System.out.print((int)(Math.random() * 10) + " ");		    //Returns a random integer between 0 and 9.

        System.out.println("\n\nRandom values between 50 and 99: ");
        for (int j = 0; j < 20; j++)
            System.out.print(50 + (int)(Math.random() * 50) + " ");   //Returns a random integer between 50 and 99.
        System.out.println();

        System.out.println("\n\nThe maximum of 30 and 54 is: " + Math.max(30,54));
        System.out.println("The maximum of 3.0 and 5.4 is: " + Math.max(3.0,5.4));
        System.out.println("The maximum of 30 and 5.4 is: " + Math.max(30,5.4));
        System.out.println("The maximum of 30, 92 and 54 is: " + Math.max(Math.max(30,92),54));

        //Example 7: Date & Date Formatting
        System.out.println("\n\nExamples 7: Date Methods");
        LocalDate currentDate = LocalDate.now();
        System.out.println("\nToday's date: " + currentDate);	
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Formated date: " + formattedDate);


        //Example 8: creating user defined methods
        System.out.println("\n\nExamples 8: User Defined Methods (isDigits)");
        String inString;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        inString = sc.nextLine();
        while (isDigits(inString)){
            System.out.print("The value is valid. Enter another value: ");
            inString = sc.nextLine();
        } 
       
        //Example 9: File IO Introduction
        System.out.println("\n\nExamples 9: File IO Introduction");        
        try{
            PrintWriter outFile = new PrintWriter("output.txt");
            File inFileName = new File("input.txt");
            Scanner inFile = new Scanner(inFileName);

            ArrayList<String>words = new ArrayList<>();
            String tempStr;
            for (int i = 1; i <= 5; i++) {
                tempStr = inFile.nextLine();
                if (!tempStr.isEmpty())
                    words.add(tempStr.trim().toLowerCase());
                System.out.println("    " + tempStr);
            }
            outFile.println("Hello! Here are your 5 strings: ");
            for (String s:words)
                outFile.println(s);

            inFile.close();
            outFile.close();
        }
        catch(Exception ex){
            System.out.println("Unable to complete task " + ex.getMessage());
        }    
         
        //Other Examples: Demonstrating Displaying Alternate Values 
        System.out.println("\n\nOther Examples"); 
        int i = (int)'A'; 	// The Unicode of character A is assigned to i
        System.out.println("    Printing ascii character value of 'A' = " + i); 
        //this is demonstrating different values
        String bigTheta = "\u0398";

        System.out.println("    " + bigTheta + "    \u03B1" + "   " + 0b1111);

        System.out.println();
        sc.close();
    }


    //PRE:   accepts a string
    //POST: ensures that the string only contains digits, returns true or false

    public static boolean isDigits(String str){
        for (int i = 0; i < str.length(); i++){
            if (!(Character.isDigit(str.charAt(i))))
                return false;
        }
        return true;
    }   

    
}
