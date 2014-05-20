/**
 * 
 */
package Main;

/**
 * @author CK
 *
 */
public class FooCorporation {

	/**
	 * @param args
	 */
	public static void Pay(double hours, double pay){
		double totalPay = 0;
		if(pay < 8.00){
			System.out.println("Error: You must be payed at least $8.00 per hour");
		}
		else if (hours <= 60){
			totalPay = hours * pay;
			if(hours > 40){
				totalPay += (hours - 40) * pay * .5;
			}
			System.out.println("Amount to be paid: $" + totalPay);
		}
		else{
			System.out.println("Error, Worked over 60 hours this week");
		}
		

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pay(35, 7.50);
		Pay(47, 8.20);
		Pay(73, 10.00);
	}

}
