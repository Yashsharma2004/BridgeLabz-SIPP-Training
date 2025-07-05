class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    Ticket head = null;
    Ticket tail = null;

    void addTicket(Ticket newTicket) {
        if (head == null) {
            head = tail = newTicket;
            newTicket.next = head;
        } else {
            tail.next = newTicket;
            newTicket.next = head;
            tail = newTicket;
        }
    }

    void removeTicketById(int ticketId) {
        if (head == null) return;
        if (head == tail && head.ticketId == ticketId) {
            head = tail = null;
            return;
        }
        Ticket current = head;
        Ticket prev = tail;
        do {
            if (current.ticketId == ticketId) {
                prev.next = current.next;
                if (current == head) head = current.next;
                if (current == tail) tail = prev;
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    void displayTickets() {
        if (head == null) return;
        Ticket temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Booking Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByCustomerName(String name) {
        if (head == null) return;
        Ticket temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                System.out.println("Found Ticket: ID=" + temp.ticketId + ", Movie=" + temp.movieName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No ticket found for customer: " + name);
    }

    void searchByMovieName(String movie) {
        if (head == null) return;
        Ticket temp = head;
        boolean found = false;
        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                System.out.println("Found Ticket: ID=" + temp.ticketId + ", Customer=" + temp.customerName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No tickets found for movie: " + movie);
    }

    int totalTickets() {
        if (head == null) return 0;
        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}

public class OnlineTicketReservation {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(new Ticket(1, "Alice", "Avengers", "A1", "2025-07-05 10:00"));
        system.addTicket(new Ticket(2, "Bob", "Batman", "B2", "2025-07-05 11:00"));
        system.addTicket(new Ticket(3, "Charlie", "Avengers", "A2", "2025-07-05 10:00"));

        System.out.println("All Tickets:");
        system.displayTickets();

        System.out.println("\nSearch by Customer Name 'Alice':");
        system.searchByCustomerName("Alice");

        System.out.println("\nSearch by Movie Name 'Avengers':");
        system.searchByMovieName("Avengers");

        System.out.println("\nTotal Tickets Booked: " + system.totalTickets());

        System.out.println("\nRemoving Ticket ID 2");
        system.removeTicketById(2);
        system.displayTickets();
    }
}
