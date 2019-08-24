

package main;
import java.util.Scanner;
public class Gravity {
	public static void main(String[] args) {
		double time, distance,g = 9.8;
		double speed;
		Scanner s = new Scanner(System.in);
		time = s.nextDouble();
		speed = (g*time);
		distance = 0.5*g*time*time;
		System.out.println("The speed of obeject at" + time + "seconds after its release is" + speed + "and the distance the object has travelled in the" + time + "seconds after the relase is" + distance
		);
	}


	}
