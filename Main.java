import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main (String[] args){

        //testing increment operators
        int x = 10;
        System.out.println(x + " :  " +  (++x) + " : " + x);
        System.out.println(x + " :  " +  (x++) + " : " + x);
        System.out.println(x + " :  " +  (x *= x) + " : " + x);

        //testing operators
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

        System.out.println(true || false && false);
        System.out.println(true && false || false);

        System.out.println(2 * 2 + 3 > 2 && 4 - 2 > 5);
        System.out.println(2 * 2 - 3 > 2 || 4  + 2 > 5);


        int i = (int)'A'; 	// The Unicode of character A is assigned to i
        System.out.println(i); 

        for (int j = 0; j < 20; j++)
            System.out.print((int)(Math.random() * 10) + " ");		//Returns a random integer between 0 and 9.

        System.out.println();

        for (int j = 0; j < 20; j++)
            System.out.print(50 + (int)(Math.random() * 50) + " "); 		//Returns a random integer between 50 and 99.
        System.out.println();

        //Date & Date Formatting
        LocalDate currentDate = LocalDate.now();
        System.out.println("Today's date: " + currentDate);	
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Formated date: " + formattedDate);


        String inString;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        inString = sc.nextLine();
        while (isDigits(inString)){
            System.out.print("The value is valid. Enter another value: ");
            inString = sc.nextLine();
        } 


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
