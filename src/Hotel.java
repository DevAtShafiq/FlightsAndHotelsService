public class Hotel {
 private int hotelId;
 private String name;
 private String location;
 private String checkIn;
 private String checkOut;
 private int numGuests;
 private double price;
 private int confirmationNumber;

 public int getHotelId() {
  return hotelId;
 }

 public void setHotelId(int hotelId) {
  this.hotelId = hotelId;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getLocation() {
  return location;
 }

 public void setLocation(String location) {
  this.location = location;
 }

 public String getCheckIn() {
  return checkIn;
 }

 public void setCheckIn(String checkIn) {
  this.checkIn = checkIn;
 }

 public String getCheckOut() {
  return checkOut;
 }

 public void setCheckOut(String checkOut) {
  this.checkOut = checkOut;
 }

 public int getNumGuests() {
  return numGuests;
 }

 public void setNumGuests(int numGuests) {
  this.numGuests = numGuests;
 }

 public double getPrice() {
  return price;
 }

 public void setPrice(double price) {
  this.price = price;
 }

 public int getConfirmationNumber() {
  return confirmationNumber;
 }

 public void setConfirmationNumber(int confirmationNumber) {
  this.confirmationNumber = confirmationNumber;
 }

 public Hotel(int hotelId, String name, String location, String checkIn, String checkOut, int numGuests, double price) {
  this.hotelId = hotelId;
  this.name = name;
  this.location = location;
  this.checkIn = checkIn;
  this.checkOut = checkOut;
  this.numGuests = numGuests;
  this.price = price;






 }
}
