package Assignment2;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int units=380;
		double billtopay=0;
		if(units<100)
		{
			billtopay=units*1.20;
		}
		else if(units<=300)
		{
			billtopay=100*1.20+(units-100)*2;
		}
		else if(units>300)
		{
			billtopay=100*1.20+200*2+(units-300)*3;
		}
			System.out.println("The Electricity bill for "+units+"is :"+billtopay);

	}
}
