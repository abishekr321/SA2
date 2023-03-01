package mockinterview;


import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class mileage {
  public static void main(String[]args) {
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter the n");
	  int n=scanner.nextInt();
	  String[] vehichles=new String[n];
	  double[] mileage=new double[n];
	  for(int i=0;i<n;i++) {
		  System.out.println("vehichle Name");
		  vehichles[i]=scanner.next();
		  System.out.println("kms run");
		  double run=scanner.nextDouble();
		  System.out.println("fuel consumed");
		  double fuel=scanner.nextDouble();
		  mileage[i]=run/fuel;
		   }
	  for(int i=0;i<n;i++) {
		  for(int j=i+1;j<n;j++) {
			  if(mileage[i]>mileage[j]) {
				  String name=vehichles[i];
				  vehichles[i]=vehichles[j];
				  vehichles[j]=name;
			  }
		  }
	  }
	  System.out.println(Arrays.toString(vehichles));
      
  }

}
