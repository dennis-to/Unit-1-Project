import java.util.Scanner;

public class unit1project{
    public static void main(String[] args){
        
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter in the mass of water, in grams");
    double mass = reader.nextDouble();
    System.out.println("Enter in the temperature of the water, in celcius");
    double initialtemp = reader.nextDouble();
    if(initialtemp < -273.14)
        initialtemp = -273.14;
    System.out.println("Enter in the final temperature of the water, in celcius");
    double finaltemp = reader.nextDouble();
    if(finaltemp < -273.14)
        finaltemp = -273.14;
    
    System.out.println("mass: " + mass + "g");
    System.out.println("initial temeperature: " + initialtemp + "degrees celcius");
    System.out.println("final temperature: " + finaltemp + "degrees celcius");

    }
}


