public class Constants {
    public static final double BUS_FARE_RATE = 1.5;
    public static final double METRO_FARE_RATE = 2.0;
    public static final double TAXI_FARE_RATE = 3.0;

    public static final String SERVICE_TYPE_BUS = "Bus";
    public static final String SERVICE_TYPE_METRO = "Metro";
    public static final String SERVICE_TYPE_TAXI = "Taxi";

    public static final String DATABASE_URL = "jdbc:mysql://localhost:3306/smartcity";
    public static final String DATABASE_USER = "root";
    public static final String DATABASE_PASSWORD = "password";

    private Constants() {
        // Prevent instantiation
    }
}