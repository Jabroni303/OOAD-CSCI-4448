import java.util.Scanner;
import java.util.*;

public class Processor{
    //static Scanner input = new Scanner(System.in);
   
    public String input(){
        String word;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter a string:");
            word = input.nextLine();
            System.out.println("Your entered word is: " + word);
            return word; // ask user for input and return
        }

    }

    public String clean(String s){
        String uppercase = s.toUpperCase();
            System.out.println("Your cleaned word is now: " + uppercase);
            return uppercase;// uses toUpperCase() to take user entered string and convert it to upper case
    }

    public String sorted(String s){
            char charArray[] = s.toCharArray();
            Arrays.sort(charArray); // converts uppercase string and turns it into char array, where it is alphabetically sorted by Arrays.sort
            String sortedString = new String(charArray);
            System.out.println("Alphabetically sorted, your string is now: " + sortedString);
            return sortedString;

    }

    public String palindrome(String s){
        String palin="";
        char [] str= s.toCharArray();
        for(int i = str.length-1;i>=0; i--)
            palin += str[i];  // uses a for loop to reverse the string and then prints the original and reversed together, making a plindrome.
            System.out.println("Your sorted string is now a palindrome: ");
            System.out.println(new String(s+palin));
            return palin;
    }

    public static void execute(){ // execute functions carries out all methods when called in main
        String s = new String();

        Processor p = new Processor();
        s = p.input();
        s = p.clean(s);
        s = p.sorted(s);
        s = p.palindrome(s);

    }

}
