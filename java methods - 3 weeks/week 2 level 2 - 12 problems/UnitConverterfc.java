public class UnitConverterfc {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;  
        return fahrenheit2celsius;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32; 
        return celsius2fahrenheit;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;  
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;  
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;  
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;  
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        double fahrenheit = 98.6;  
        double celsius = 37;  
        double pounds = 150;  
        double kilograms = 68;  
        double gallons = 5;  
        double liters = 18.9271;  
        double celsiusConverted = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsiusConverted + " Celsius.");

        double fahrenheitConverted = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is equal to " + fahrenheitConverted + " Fahrenheit.");

        double kilogramsConverted = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilogramsConverted + " kilograms.");

        double poundsConverted = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms is equal to " + poundsConverted + " pounds.");

        double litersConverted = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + litersConverted + " liters.");

        double gallonsConverted = convertLitersToGallons(liters);
        System.out.println(liters + " liters is equal to " + gallonsConverted + " gallons.");
    }
}
