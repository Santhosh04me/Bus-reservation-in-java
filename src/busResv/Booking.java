package busResv;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the passenger Name:");
		passengerName=sc.next();
		System.out.println("Enter the Bus No:");
		busNo=sc.nextInt();
		System.out.println("Enter the Date dd-mm-yyyy");
		String dateInput=sc.next();
		SimpleDateFormat dataFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dataFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}	
		
	}

	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity=0;
		for(Bus bus:buses) {
			if(bus.getBusNo()==busNo)
				capacity=bus.getcapacity();
		}
		int booked=0;
		for(Booking b:bookings) {
			if(b.busNo==busNo && b.date.equals(date))
			{
				booked++;
			}
		}
		
		
		
		return booked<capacity?true:false;
	}
	

}
