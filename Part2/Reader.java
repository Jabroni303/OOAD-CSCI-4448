import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Reader {
    public static ArrayList<Double> numbers = new ArrayList<Double>(); //instantiate new arrayList

    public ArrayList<Double> input()
    {
       
       

        System.out.println("Please enter your desired numbers and press enter to perform calculations: ");
        Scanner input = new Scanner(System.in); //scanner takes input
    
        String userinput = "xxxxxxxxxx";
        Double nextnum = 0.0;
        while (userinput.length() > 0) {
            try { //for loop runs until user enters no numbers and then prints numbers to screen
                userinput = input.nextLine();
                nextnum = Double.parseDouble(userinput);
                numbers.add(nextnum); 
                System.out.println("Number accepted"); 
            } catch (NumberFormatException e) {
                System.out.println("Performing calculations");
            }
        }
        System.out.println(numbers);
        System.out.printf("%n");

        
            input.close();
            return numbers;
        }

 public static ArrayList<Double> getList(){
    return numbers; //getter for arrayList
 }  

}





