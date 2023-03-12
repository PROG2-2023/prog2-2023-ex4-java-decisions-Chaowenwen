package prog2.exercise4.flight.booking.system;




import java.time.LocalDate;

public class FlightBooking {
    String passengerFullName;
    String flightID = "dtrde6ftfyu";
    private int  childPassengers;
    private int adultPassengers;
    private int totalPassengers;
    private double departingTicketPrice;
    private double returnTicketPrice=1102.3;
    private double totalTicketPrice=1107.7;
    private String ticketNumber ="dtrdyubf";
    private LocalDate departingDate;
    private LocalDate returnDate;
    
    final String sourceAirport = "NANJING LUKOU INTERNATIONAL AIRPORT";
    private final String tripDestination = "OULU";
    final String destinationAirport = " OULU AIRPORT";
    private final String FlightCompany = "Flights-of-Fancy";
    BookingClass  bookingclass;
TripType triptype;
TripSource tripSource;
TripDestination tripdestination;

   public void setBookingClass(String choice){
    if(choice=="1"){
    this.bookingclass = BookingClass.FIRST;
   }
   if(choice=="2"){
    this.bookingclass = BookingClass.BUSINESS;
   }
   if(choice=="3"){
    this.bookingclass = BookingClass.ECONOMY;
   }
}

   public BookingClass getBookingClass(){
    return bookingclass;
   }
    
public void setTripType(String choice1){
    if(choice1=="1"){
        this.triptype=TripType.ONE_WAY;

    }
    if(choice1=="2"){
        this.triptype=TripType.RETURN;
    }
}
public TripType getTripType(){
    return triptype;
}
public void setTripSource(String choice2){
    if(choice2=="1"){
        this.tripSource=TripSource.NANJING;
    }
    if (choice2=="2"){
        this.tripSource=TripSource.BEIJING;
    }
    if(choice2=="3"){
        this.tripSource=TripSource.OULU;
    }
    if(choice2=="4"){
        this.tripSource=TripSource.HELSINKI;
    }
}
public TripSource getTripSource(){
    return tripSource;
}



public void setTripDestination(String choice2,String choice3){
    if(choice3=="1"){
        this.tripdestination=TripDestination.NANJING;
    }
    if (choice3=="2"){
        this.tripdestination=TripDestination.BEIJING;
    }
    if(choice3=="3"){
        this.tripdestination=TripDestination.OULU;
    }
    if(choice3=="4"){
        this.tripdestination=TripDestination.HELSINKI;
    }
}
public TripDestination getTripDestination(){
    return tripdestination;
}




    public void setDepartureDate(LocalDate departingDate) {
        this.departingDate = departingDate;
    }
    public LocalDate getDepartureDate(){
        return departingDate;
    }
    
    public void setReturnDate(LocalDate returnDate) {
        int result = returnDate.compareTo(departingDate);
        if(result >= 2){
            this.returnDate = returnDate;
        }else if(result == 1){
            this.returnDate = returnDate.plusDays(1);
        }else if(result == 0){
            this.returnDate = returnDate.plusDays(2);
        }
        
    
    }
    public LocalDate getReturnDate(){
        return returnDate;
    }
    public void setPassengerFullName(String passengerFullName) {
        this.passengerFullName = passengerFullName;
    }
    public String getPassengerFullName(){
        return passengerFullName;
    }
    public String getFlightID(){
        return flightID;
    }
    public int getChildrenPassengers(){
        return childPassengers;
    }
    public int getAdultPassengers(){
        return adultPassengers;
    }
    public int getTotalPassengers(){
        return totalPassengers;
    }
    public void setTotalPassengers(int childPassengers,int adultPassengers){
        this.totalPassengers=childPassengers+adultPassengers;
    }







    public void setReturnTicketPrice() {
        this.returnTicketPrice = departingTicketPrice;
    }
    public double getDepartingTicketPrice(){
        
        return departingTicketPrice;
    }
    public void setDepartingTicketPrice(int child, int adults) {
        double n1;
        if((((tripSource==TripSource.NANJING)&&(tripdestination==TripDestination.BEIJING))||((tripSource==TripSource.BEIJING)&&(tripdestination==TripDestination.NANJING))||((tripSource==TripSource.OULU)&&(tripdestination==TripDestination.HELSINKI))||(tripSource==TripSource.HELSINKI)&&(tripdestination==TripDestination.OULU)))
    
       {
        n1=300+0.1*300+0.05*300;

       } 
       else{
        n1=300+0.15*300+0.1*300;
       }
       this.departingTicketPrice = n1*(child+adults);
    }
    public double getReturnTicketPrice(){
        return returnTicketPrice;
    }
    public void setTotalTicketPrice() {
        int n2=0;
        if(triptype==TripType.ONE_WAY){
            if(bookingclass == BookingClass.FIRST){
                n2=250;
            }
        if(bookingclass == BookingClass.BUSINESS){
            n2=150;
        }
        if(bookingclass == BookingClass.ECONOMY){
            n2=50;
        }
            this.totalTicketPrice = departingTicketPrice+n2;
        }
        if(triptype==TripType.RETURN){
            if(bookingclass == BookingClass.FIRST){
                n2=250;
            }
        if(bookingclass == BookingClass.BUSINESS){
            n2=150;
        }
        if(bookingclass == BookingClass.ECONOMY){
            n2=50;
        }
            this.totalTicketPrice = (departingTicketPrice+returnTicketPrice)+n2*2;
        }
    }
    public double getTotalTicketPrice(){
        return totalTicketPrice;
    }









    private String a;
   private  String b;
    private String c;
    public String getTicketNumber(){
        if(triptype==TripType.ONE_WAY){
            a="11";
        }
        if(triptype==TripType.RETURN){
            a="22";
        }
        if(bookingclass == BookingClass.FIRST){
            b="F";
        }
        if(bookingclass == BookingClass.BUSINESS){
            b="B";
        }
        if(bookingclass == BookingClass.ECONOMY){
            b="E";
        }
        if(((tripSource==TripSource.NANJING)&&(tripdestination==TripDestination.BEIJING))||((tripSource==TripSource.BEIJING)&&(tripdestination==TripDestination.NANJING))||((tripSource==TripSource.OULU)&&(tripdestination==TripDestination.HELSINKI))||(tripSource==TripSource.HELSINKI)&&(tripdestination==TripDestination.OULU)){
            c="DOM";
        }
        else{
            c="INT";
        }
        this.ticketNumber=a+b+"ASDF"+c;
        return ticketNumber;
    }

   public String getFlightCompany() {
       return FlightCompany;
   }
  
   
    public FlightBooking(String passengerFullname,LocalDate departingDate,LocalDate returnDate,int childrenPassengers,int adultPassengers){
        this.passengerFullName=passengerFullname;
        this.departingDate=departingDate;
        this.returnDate=returnDate;
        this.childPassengers=childrenPassengers;
        this.adultPassengers=adultPassengers;
    }
    
   
    public String toString(){
        return  "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
        FlightCompany + ". Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + tripSource + " to " + tripDestination + "\n" +
        "Date of departure: " + departingDate + "\n" +
        "Date of return: " + returnDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice;

    }


    enum BookingClass {
    
  
        FIRST,BUSINESS,ECONOMY
           
        }
        
        enum TripType{
            ONE_WAY,RETURN
          
        
        }
        
        
        enum Trip_source{
            Nanjing, Beijing, Shanghai, Oulu, Helsinki, Paris
        }
        enum Trip_destination{
        
            Nanjing, Beijing, Shanghai, Oulu, Helsinki,  Paris
        }
        enum Source_airport{
            Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport, Helsinki_Airport,  Paris_Charles_de_Gaulle_Airport
            
        }
        enum Destination_airport{
            Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport, Helsinki_Airport,  Paris_Charles_de_Gaulle_Airport
        }
        enum TripSource{
            NANJING,BEIJING,OULU,HELSINKI
        }
        enum TripDestination{
            NANJING,BEIJING,OULU,HELSINKI
        }
       
        double domesticbase = 300 ;
        double domestictaxes= 0.1*domesticbase;
        double domesticfees = 0.05*domesticbase;
        double internationalbase = 300;
        double internationaltaxes =0.15*internationalbase;
        double internationalfees = 0.1*internationalbase;
        double First = 250;
        double Business = 150;
        double Economy = 50;
    
    }
    







 

