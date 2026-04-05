class MainService{

public static void main(String[] args){

CinemaService.showGreeting();
CinemaService.ticketBooking("Deepu","KGF");
int screen = CinemaService.screenNumber();
System.out.println(screen);
int ticketCost = CinemaService.calculateTicketCost(200,300);
System.out.println(ticketCost);


BankService.bankGreeting();
BankService.openAccount("Ravi","Savings");
int token = BankService.generateToken();
System.out.println(token);
int balance = BankService.addBalance(5000,3000);
System.out.println(balance);


LibraryService.libraryEntry();
LibraryService.issueBook("Anu","Java Book");
int rack = LibraryService.rackLocation();
System.out.println(rack);
int books = LibraryService.countBooks(5,7);
System.out.println(books);


CollegeService.collegeIntro();
CollegeService.registerStudent("Kiran","BCA");
int room = CollegeService.classroomNumber();
System.out.println(room);
int marks = CollegeService.calculateMarks(85,90);
System.out.println(marks);


SuperMarketService.storeWelcome();
SuperMarketService.buyProduct("Megha","Rice");
int counter = SuperMarketService.billingCounter();
System.out.println(counter);
int bill = SuperMarketService.calculateBill(200,150);
System.out.println(bill);


GymService.gymEntry();
GymService.joinMembership("Arjun","Gold");
int trainer = GymService.trainerId();
System.out.println(trainer);
int days = GymService.totalWorkoutDays(3,4);
System.out.println(days);


RestaurantService.restaurantGreeting();
RestaurantService.placeOrder("Rahul","Biryani");
int table = RestaurantService.tableAllocation();
System.out.println(table);
int foodBill = RestaurantService.calculateFoodBill(250,150);
System.out.println(foodBill);


HospitalService.hospitalWelcome();
HospitalService.patientRegistration("Sita","Dr.Raj");
int hospitalRoom = HospitalService.roomAllocation();
System.out.println(hospitalRoom);
int medicalBill = HospitalService.calculateMedicalBill(500,700);
System.out.println(medicalBill);


HotelService.hotelGreeting();
HotelService.roomBooking("Ramesh","Deluxe");
int hotelRoom = HotelService.roomNumber();
System.out.println(hotelRoom);
int stayCost = HotelService.calculateStayCost(2000,2500);
System.out.println(stayCost);


BusService.busGreeting();
BusService.passengerCheckIn("vishal","AI203");
int gate = BusService.gateNo();
System.out.println(gate);
int bagWeight = BusService.calculateBagWeight(10,12);
System.out.println(bagWeight);

}

}