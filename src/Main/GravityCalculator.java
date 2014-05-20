package Main;

public class GravityCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gravity = -9.81;// earth's gravity in m/s^2
		double initialVelocity = 0;
		double fallingTime = 10.0;
		double initialPosition = 0;
		double finalPosition = 0;

		finalPosition = .5 * gravity * fallingTime * fallingTime
				+ initialVelocity * fallingTime + initialPosition;

		System.out.println("The objects position after " + fallingTime
				+ " seconds is " + finalPosition + "m");

	}

}
