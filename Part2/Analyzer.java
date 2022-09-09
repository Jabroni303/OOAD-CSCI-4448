import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Analyzer {
    ArrayList<Double> numbers = Reader.getList();

    public double sum(){
        int sum = 0;
        for(int i = 0; i<numbers.size(); i++){ //for loop runs through arraylist and keeps tally of sum
          sum+=numbers.get(i);
        }
        return sum; //returns sum of array list
      }

    public double average(){

        int total = 0;
            double ave;
            for(int i = 0; i < numbers.size(); i++)
                total +=(Double) numbers.get(i);// uses for loop to get total sum of array list
            ave = total / numbers.size();// divides total by number of elements
            System.out.println("The mean is:");
            System.out.println(ave);
            System.out.printf("%n");
            return ave;
        }

    public double median(){
        Collections.sort(numbers);

        if(numbers.size() % 2 ==0){
            double lower = numbers.get((numbers.size())/2 -1); // if divisible by 2, takes upper and lower bound and divides by increments to get median
            double upper = numbers.get(numbers.size() / 2);
            System.out.println("The median is:");
            System.out.println((lower+upper / 2));
            System.out.printf("%n");
            return (lower+upper/2);
        }
        else{
            System.out.println("The median is:"); //if not divisble by two, retrieves number adds 1 to num of elements and 
            System.out.println(numbers.get((numbers.size() + 1) / 2 -1));//divides by two to get median after taking one off to find median element
            System.out.printf("%n");
            return numbers.get((numbers.size() + 1) / 2 -1);
            
        }
        }
    
        public double mode()
        {
        
        Double mode = numbers.get(0);
        int maxOccurence = 1;
        int count = 1;
        for(int i = 1; i < numbers.size()-1; i++)
            {
                if(numbers.get(i) == numbers.get(0))//for loops checks to see if indexed item equals first elemenmts, if not it steps further through arraylist and keeps count
                    {
                        count++;
                    }
                else
                    {
                        count = 1;
                        mode = numbers.get(i);
                    }
        if(count > maxOccurence)
            {
             mode = numbers.get(0) ; //for loop keeps tracks of occurences
            maxOccurence = count;
                }
            }
            System.out.println("The mode is:");
            System.out.println(mode);
            System.out.printf("%n");
            return mode;
        }

        public double variance(){
        double variance = 0;
        for (int i = 0; i < numbers.size(); i++) {
            variance = variance + (double)Math.pow(((double)numbers.get(i) - (double)average()),2);
        }
            variance = (double)variance/(numbers.size());
        System.out.println("The variance is:");
        System.out.println(variance); // code is formula for variance but translated to code, had some trouble with this one
        System.out.printf("%n");
        return (variance );
        
    }

    public double sdev(){
        double mean = average();
        double tempvar = 0;
        for (int i = 0; i < numbers.size(); i++)
        {
            double val = numbers.get(i);
            double toMean = Math.pow(val - mean, 2);
            tempvar += toMean;
        }
        double meandiff = (double)tempvar / (double)(numbers.size()); // code is formula for standard deviation, also had trouble with this one.
        System.out.println("Standard Deviation:");
        System.out.println(Math.sqrt(meandiff));
        System.out.printf("%n");
        return Math.sqrt(meandiff);
    }

    public double min(){
        int size = numbers.size();
        double min = numbers.get(0);
        for (int i = 1; i < size; i++) {
            if (numbers.get(i) < min) { //for loop compares values tofirst item in index and stores in min, if next value is smaller, then replaces value in min 
                min = numbers.get(i);
            }
        }
        System.out.println("The minimum value is:");
        System.out.println(min);
        System.out.printf("%n");
        return min;
    }

    public double max(){
        int size = numbers.size();
        double max = numbers.get(0); //same idea as min, but compares if value in max is larger or smaller than next item in index.
        for (int i = 1; i < size; i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.println("The max value is:");
        System.out.println(max);
        System.out.printf("%n");
        return max;
    }


    public double maxcount(){
    double mode = numbers.get(0);
    int maxOccurence = 1;
    double value = mode;
    int count = 1;
    for(int i = 1; i < numbers.size()-1; i++)
        {
            if(numbers.get(i) == value){
                    count++;
            }
            else{
                    count = 1;
                    value = numbers.get(i);
                }
    if(count > maxOccurence)
        {
         mode = value;
        maxOccurence = count;
            }
        }
        System.out.println("The max occurring element is:"); //heavily resused code from mode, but also printed maxOccurence
        System.out.println(mode);
        System.out.println("and the number of occurences is: ");
        System.out.println(maxOccurence);
        return mode;
    }
public void analyze(){
    sum();
    average();
    median();
    mode();
    variance();
    sdev();
    min();
    max();
    maxcount(); //analyze function runs all analyzer functions when called in main()
}


    }


    

 

