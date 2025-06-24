package constructor;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    public CarRental() {
        customerName = "Default";
        carModel = "Hatchback";
        rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        double ratePerDay = 1000.0;
        return rentalDays * ratePerDay;
    }
}

