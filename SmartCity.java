package SmartCityTransportAndServiceMAangementSystem;

import java.time.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

/** Entry point */


@FunctionalInterface
interface FareCalculator {
    double calculateFare(Trip trip);
}

interface TransportService {
    String getId();
    String getName();
    String getType();
    List<ScheduleEntry> getSchedule();
    FareCalculator getFareCalculator();

    default void printServiceDetails() {
        Logger.log(String.format("[%s] %s (%s)", getId(), getName(), getType()));
    }

    default void displayLiveSchedules() {
        printServiceDetails();
        getSchedule().forEach(se -> Logger.log(String.format("  %s | dep %s | peak=%s",
                se.routeId, se.departure, se.peak)));
    }

    default double estimateFare(Trip t) {
        return getFareCalculator().calculateFare(t);
    }
}

interface EmergencyService {} // Marker



abstract class BaseService implements TransportService {
    private final String id;
    private final String name;
    private final String type;
    private final List<ScheduleEntry> schedule;
    private final FareCalculator fareCalculator;

    protected BaseService(String id, String name, String type, List<ScheduleEntry> schedule, FareCalculator fareCalculator) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.schedule = Collections.unmodifiableList(new ArrayList<>(schedule));
        this.fareCalculator = fareCalculator;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }
    public List<ScheduleEntry> getSchedule() { return schedule; }
    public FareCalculator getFareCalculator() { return fareCalculator; }
}

final class BusService extends BaseService {
    BusService(String id, String name, List<ScheduleEntry> schedule, FareCalculator fareCalculator) {
        super(id, name, "Bus", schedule, fareCalculator);
    }
}

final class MetroService extends BaseService {
    MetroService(String id, String name, List<ScheduleEntry> schedule, FareCalculator fareCalculator) {
        super(id, name, "Metro", schedule, fareCalculator);
    }
}

final class TaxiService extends BaseService {
    TaxiService(String id, String name, List<ScheduleEntry> schedule, FareCalculator fareCalculator) {
        super(id, name, "Taxi", schedule, fareCalculator);
    }
}

final class FerryService extends BaseService {
    FerryService(String id, String name, List<ScheduleEntry> schedule, FareCalculator fareCalculator) {
        super(id, name, "Ferry", schedule, fareCalculator);
    }
}

final class AmbulanceService extends BaseService implements EmergencyService {
    AmbulanceService(String id, String name, List<ScheduleEntry> schedule, FareCalculator fareCalculator) {
        super(id, name, "Ambulance", schedule, fareCalculator);
    }
}



final class ServiceOption {
    final TransportService service;
    final ScheduleEntry entry;
    final double estimatedFare;
    final double distanceKm;

    ServiceOption(TransportService service, ScheduleEntry entry, double estimatedFare, double distanceKm) {
        this.service = service;
        this.entry = entry;
        this.estimatedFare = estimatedFare;
        this.distanceKm = distanceKm;
    }
}

final class ScheduleEntry {
    final String routeId;
    final LocalTime departure;
    final boolean peak;

    ScheduleEntry(String routeId, LocalTime departure, boolean peak) {
        this.routeId = routeId;
        this.departure = departure;
        this.peak = peak;
    }
}
