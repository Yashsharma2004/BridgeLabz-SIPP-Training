package methods;

public final class DistanceUnitConvertor {

    private DistanceUnitConvertor() {}  

    public static double convertKmToMiles(double km)        { return km * 0.621371; }
    public static double convertMilesToKm(double miles)     { return miles * 1.60934; }
    public static double convertMetersToFeet(double meters) { return meters * 3.28084; }
    public static double convertFeetToMeters(double feet)   { return feet * 0.3048; }

    public static void main(String[] args) {
        System.out.printf("10 km  -> %.3f mi%n",  convertKmToMiles(10));
        System.out.printf("6.2 mi -> %.3f km%n",  convertMilesToKm(6.2));
        System.out.printf("3 m    -> %.2f ft%n",  convertMetersToFeet(3));
        System.out.printf("10 ft  -> %.3f m%n",   convertFeetToMeters(10));
    }
}

