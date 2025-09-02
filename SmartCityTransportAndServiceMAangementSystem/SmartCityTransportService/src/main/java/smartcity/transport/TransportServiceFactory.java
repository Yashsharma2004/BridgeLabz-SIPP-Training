package smartcity.transport;

import java.util.HashMap;
import java.util.Map;

public class TransportServiceFactory {
    private static final Map<String, ITransportServices> services = new HashMap<>();

    public static ITransportServices getTransportService(String serviceType) {
        return services.computeIfAbsent(serviceType, key -> {
            switch (key.toLowerCase()) {
                case "bus":
                    return new BusService();
                case "metro":
                    return new MetroService();
                case "taxi":
                    return new TaxiService();
                default:
                    throw new IllegalArgumentException("Unknown service type: " + key);
            }
        });
    }
}