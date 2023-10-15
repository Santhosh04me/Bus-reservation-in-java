package busResv;

import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bus> buses=new ArrayList<Bus>();
		
		buses.add(new bus(1,true,45));
		buses.add(new bus(2,false,50));
		buses.add(new bus(3,true,48));
		
		
		int userOpt = 1;
		Scanner sc=new Scanner(System.in);
		while(userOpt==1) {
		System.out.println("Enter 1 to Book and 2 to exit");
		userOpt=sc.nextInt();
		if(userOpt==1) {
		System.out.println("Bookin...");
		}
		}
	}

}
