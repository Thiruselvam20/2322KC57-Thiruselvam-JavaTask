package studentIteratorProject;
class TicketCounter {
    private int availableSeats = 5;

    public synchronized void bookTicket(String userName, int requestedSeats) {
        System.out.println(userName + " is trying to book " + requestedSeats + " seat(s)...");

        if (requestedSeats <= availableSeats) {
            try {
                Thread.sleep(1000); // Simulate booking delay
            } catch (InterruptedException e) {
                System.out.println("Booking interrupted for " + userName);
            }

            availableSeats -= requestedSeats;
            System.out.println("Booking successful for " + userName + ". Seats remaining: " + availableSeats);
        } else {
            System.out.println("Booking failed for " + userName + ". Not enough seats. Seats remaining: " + availableSeats);
        }
    }
}

class BookingThread extends Thread {
    private TicketCounter counter;
    private String user;
    private int seats;

    public BookingThread(TicketCounter counter, String user, int seats) {
        this.counter = counter;
        this.user = user;
        this.seats = seats;
    }

    public void run() {
        counter.bookTicket(user, seats);
    }
}

public class MainTask_TicketBooking {

	
	    public static void main(String[] args) {
	        TicketCounter counter = new TicketCounter();

	        BookingThread user1 = new BookingThread(counter, "Thiru", 2);
	        BookingThread user2 = new BookingThread(counter, "Hari", 2);
	        BookingThread user3 = new BookingThread(counter, "Shivi", 2);

	        user1.start();
	        user2.start();
	        user3.start();
	    }
	}

