import java.util.*;
public class NoiseMain {

	public static void main(String[] args) throws InterruptedException {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		double l = 0.00;
		int r = 0, delay = 5, ltp = 0, i = 0;
		String s = "=";

		System.out.print("How many lines would you like to print: ");
		ltp = scan.nextInt();

		System.out.print("How many milliseconds of delay between each line: ");
		delay = scan.nextInt();


		while(i < ltp) {
		  //Generating Random Number
		  r = (rand.nextInt(20));

		  //Switching Between Adding Random And Subtracting Random From Length
		  if(r >= 10) {
		    l += (rand.nextInt(4));
		  } else {
		    l -= (rand.nextInt(4))*1.15;
		  }

		  //Limiting Length
		  if(l < 1) {
		    l = 1;
		  } else if(l > 70) {
		    l = 70;
		  }

		  //Looping To Print For Each Length
		  for(int k = 0; k < (l+25); k++) {
		    System.out.print(s);
		  }
		  System.out.println("#");
		  Thread.sleep(5);
		  i++;
		}

	}

}
