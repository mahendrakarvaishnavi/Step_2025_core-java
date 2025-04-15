public class UnitConverter {

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;  
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;  
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048; 
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        double km = 10;  // 10 kilometers
        double miles = 6.2;  // 6.2 miles
        double meters = 100;  // 100 meters
        double feet = 328.084;  // 328.084 feet
        
        double milesConverted = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + milesConverted + " miles.");
        
        double kmConverted = convertMilesToKm(miles);
        System.out.println(miles + " miles is equal to " + kmConverted + " kilometers.");
        
        double feetConverted = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feetConverted + " feet.");
        
        double metersConverted = convertFeetToMeters(feet);
        System.out.println(feet + " feet is equal to " + metersConverted + " meters.");
    }
}
