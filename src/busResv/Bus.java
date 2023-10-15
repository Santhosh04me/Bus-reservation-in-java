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
	public boolean getcapacity(){
		return capacity;
	}
	
	public int setac(int cap){ //mutator;
		capacity=cap;
	}
	public int setcapcity(int cap){ //mutator;
		capacity=cap;
	}
	
	
	}







}
