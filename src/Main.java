public class Main {
    public static void main(String[] args) {


        TravelApp app = new TravelApp();

        app.bookFlight(1010000,"shafiq","dhaka","incheon","2024-04-08",2,52000.00);
        app.bookHotel(101010,"shafiq","dhaka","incheon","2024-04-08",2,52000.00);
        app.cancelReservation(101010);


        for (Hotel hotel:app.hotels){

            System.out.println(hotel.getHotelId()+hotel.getName());
        }
        for (Flight flight:app.flights){

            System.out.println(flight.getFlightNumber());
        }
    }
}
