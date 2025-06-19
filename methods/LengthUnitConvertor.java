package methods;

public final class LengthUnitConvertor {

    
    private LengthUnitConvertor() {}

    public static double convertYardsToFeet(double yards) {
        return yards * 3;                
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;          
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;         
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;          
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;            
    }

    
    public static void main(String[] args) {
        System.out.println("5 yd  -> " + convertYardsToFeet(5) + " ft");
        System.out.println("15 ft -> " + convertFeetToYards(15) + " yd");
        System.out.println("2 m   -> " + convertMetersToInches(2) + " in");
        System.out.println("50 in -> " + convertInchesToMeters(50) + " m");
        System.out.println("12 in -> " + convertInchesToCentimeters(12)+ " cm");
    }
}
