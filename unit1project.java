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

    String initialphase = "liquid";
        if(initialtemp < 0)
            initialphase = "solid";
        if(initialtemp > 100)
            initialphase = "vapor";
    
    String finalphase = "Liquid";
        if(finaltemp < 0)
            finalphase = "solid";
        if(finaltemp > 100)
            finalphase = "vapor";
    
    System.out.println("mass: " + mass + "g");
    System.out.println("initial temeperature: " + initialtemp + " degrees celcius " + initialphase);
    System.out.println("final temperature: " + finaltemp + " degrees celcius " + finalphase);

    boolean endothermic = false;
    if(finaltemp > initialtemp)
        endothermic = true;

    }
public static double tempchangesolid(double mass, double starttemp, double endtemp, String endphase, boolean endothermic){
    if(!endphase.equals("solid"))
        endtemp = 0;
    double energychange = round(mass*0.002108*(endtemp - starttemp));
    if(endothermic)
        System.out.println("Heating (solid): " + energychange + " kj " );
    else
        System.out.println("Cooling (solid): " + energychange + " kj " );
    return energychange;

}

public static double tempchangevapor(double mass, double starttemp, double endtemp, String endphase, boolean endothermic){
    if(!endphase.equals("vapor"))
        endtemp = 100;
    double energychange = round(mass*0.001996*(endtemp - starttemp));
    if(endothermic)
        System.out.println("Heating (vapor): " + energychange + " kj " );
    else
        System.out.println("Cooling (vapor): " + energychange + " kj " );
    return energychange;

}
public static double tempchangeliquid(double mass, double starttemp, double endtemp, String endphase, boolean endothermic){
    if(endphase.equals("solid"))
        endtemp = 0;
    if(endphase.equals("vapor"))
        endtemp = 100;
    double energychange = round(mass*0.004184*(endtemp - starttemp));
    if(endothermic)
        System.out.println("Heating (solid): " + energychange + " kj " );
    else
        System.out.println("Cooling (solid): " + energychange + " kj " );
    return energychange;

}
public static double fusion(double mass, boolean endothermic){
    double energychange;
    if(endothermic){
        energychange = round(0.333*mass);
        System.out.println("Melting: " + energychange + " kj " );
    }
    else {
        energychange = round(-0.333*mass);
        System.out.println("Freezing: " + energychange + " kj " );
    }
    return energychange;
}
public static double vaporization(double mass, boolean endothermic){
    double energychange;
    if(endothermic){
        energychange = round(2.257*mass);
        System.out.println("Evaporization: " + energychange + " kj " );
    }
    else {
        energychange = round(-2.257*mass);
        System.out.println("Condensation: " + energychange + " kj " );
    }
    return energychange;

}
public static double round(double x){
    x *= 1000;
    if(x > 0)
        return (int)(x + 0.5)/1000.0;
    else
        return (int)(x - 0.5)/1000.0;
}

}


