import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.Random;

public class TravelApp {



    ArrayList<Flight>flights;

    ArrayList<Hotel>hotels;

    public TravelApp() {
        this.flights = new ArrayList<Flight>();
        this.hotels = new ArrayList<Hotel>();
    }

     void bookFlight(int flightNumber,String passengerName,String origin,String destination, String date, int numPassengers, double price){

        Flight flight = new Flight(flightNumber,passengerName,origin,destination,date,numPassengers,price);

         int confirmationNumber = generateConfirmationNumber();
         flight.setConfirmationNumber(confirmationNumber);
      this.flights.add(flight);
         System.out.println("Flight booked! Confirmation Number is:"+confirmationNumber);

     }

     public void bookHotel(int hotelId, String name, String location, String checkIn, String checkOut, int numGuests, double price){

         Hotel hotel = new Hotel(hotelId,name,location,checkIn,checkOut,numGuests,price);

         int confirmationNumber = generateConfirmationNumber();
         hotel.setConfirmationNumber(confirmationNumber);
         this.hotels.add(hotel);
         System.out.println("Hotel booked! Confirmation Number is:"+confirmationNumber);
     }

     public void  cancelReservation(int confirmationNumber){

        for(Flight flight:this.flights){
            if (flight.getConfirmationNumber()==confirmationNumber){
                this.flights.remove(flight);
                System.out.println("Hotel Reservation canceled! of confirmation number"+confirmationNumber);
            return;
            }
        }
        for (Hotel hotel:this.hotels){
            if (hotel.getConfirmationNumber()==confirmationNumber){}
            this.hotels.remove(hotel);
            System.out.println("Hotel Reservation canceled! of confirmation number"+confirmationNumber);
        return;
        }
     }

    private static int generateConfirmationNumber(){
        Random random =new Random();
        return random.nextInt(900000)+100000;

    }



}
