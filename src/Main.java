import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

//
//        TravelApp app = new TravelApp();
//
//        app.bookFlight(1010000,"shafiq","dhaka","incheon","2024-04-08",2,52000.00);
//        app.bookHotel(101010,"shafiq","dhaka","incheon","2024-04-08",2,52000.00);
//        app.cancelReservation(101010);
//
//
//        for (Hotel hotel:app.hotels){
//
//            System.out.println(hotel.getHotelId()+hotel.getName());
//        }
//        for (Flight flight:app.flights){
//
//            System.out.println(flight.getFlightNumber());
//        }



        String pattern="[A-Z]";

        Pattern p =Pattern.compile(pattern);

        Matcher matcher=p.matcher("Hello world");
        List<String>letters=new ArrayList<>();
        while (matcher.find()){
            letters.add(matcher.group());
        }
        System.out.println(letters);




    }
}
