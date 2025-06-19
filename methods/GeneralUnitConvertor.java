package methods;

public final class GeneralUnitConvertor {

    private GeneralUnitConvertor() {}

    
    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    
    public static double convertPoundsToKilograms(double lb) {
        return lb * 0.453592;
    }

    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    
    public static double convertGallonsToLiters(double gal) {
        return gal * 3.78541;
    }

    public static double convertLitersToGallons(double l) {
        return l * 0.264172;
    }

    
    public static void main(String[] args) {
        System.out.println("72 °F -> " + convertFahrenheitToCelsius(72) + " °C");
        System.out.println("22 °C -> " + convertCelsiusToFahrenheit(22) + " °F");
        System.out.println("150 lb -> " + convertPoundsToKilograms(150) + " kg");
        System.out.println("68 kg  -> " + convertKilogramsToPounds(68) + " lb");
        System.out.println("5 gal  -> " + convertGallonsToLiters(5) + " L");
        System.out.println("10 L   -> " + convertLitersToGallons(10) + " gal");
    }
}

