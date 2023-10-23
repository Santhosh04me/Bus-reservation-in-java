package busResv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	Bus(int no,boolean ac,int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getBusNo(){
		return busNo;
	}
	public boolean getac(){
		return ac;
	}
	public int  getcapacity(){
		return capacity;
	}
	
	public void setac(int cap){ //mutator;
		capacity=cap;
	}
	public void displayBusInfo()
	{
	
		System.out.println("Bus no :"+ busNo+" Ac:" +ac+" Total capacity: "+capacity);
	}
	
	
	public void setcapcity(int cap){ //mutator;
		capacity=cap;
	}





}



