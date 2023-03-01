package mockinterview;

import java.util.ArrayList;

public class cocatenate {
	public static void main(String[]args) {
		String [] names= {"Opera","Atom","Money","Abc","Comma"};
		String ans="";
		int max=0;
		for(int i=0;i<names.length;i++) {
			String temp=names[i];
			int visi[]=new int[names.length];
			visi[i]=1;
			int j=0;
			while(j<names.length) {
				if(visi[j]!=1&&(temp.charAt(temp.length()-1)-'a'==names[j].charAt(0)-'A'||temp.charAt(temp.length()-1)-'a'==names[j].charAt(0)-'a')) {
					temp+=names[j];
					visi[j]=1;
					j=0;
					
				}
				else {
				j++;
				
			}
		}
		if(max<temp.length()) {
			ans=temp;
			max=temp.length();
		}
		
		
	}
System.out.println(ans);
}
}
