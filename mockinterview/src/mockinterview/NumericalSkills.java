package mockinterview;

import java.io.InputStream;
import java.util.Scanner;

public class NumericalSkills {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the input");
		 int number=scanner.nextInt();
		 int oddnumber=number;
		System.out.println("even");
		while(true) {
			number=number+1;
			 int count=0;
			for(int i=2;i<Math.sqrt(oddnumber);i++) {
				if(number%i==0) {
					count++;
				}
			}
			if(count==0) {
				break;
				
			}
			if(number%2==0) {
				System.out.print(number+",");
			}
		 }
	System.out.println("odd");
	while(true) {
		oddnumber=oddnumber+1;
		 int count=0;
		for(int i=2;i<oddnumber;i++) {
			if(oddnumber%i==0) {
				count++;
			}
		}
		if(count<2) {
			break;
			
		}
		if(oddnumber%2!=0) {
			System.out.println(oddnumber);
		}
	 }
}


}
