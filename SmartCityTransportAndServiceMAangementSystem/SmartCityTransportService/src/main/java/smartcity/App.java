package smartcity;

import smartcity.service.ServiceManager;

public class App {
    public static void main(String[] args) {
        // Initialize the Service Manager
        ServiceManager serviceManager = new ServiceManager();
        
        // Set up services
        serviceManager.setupServices();
        
        // Display the dashboard
        serviceManager.displayDashboard();
    }
}