package smartcity.transport;

public interface ITransportServices {
    default void printServiceDetails() {
        System.out.println("Transport Service Details:");
    }
    
    // Additional method signatures for transport services can be added here
}