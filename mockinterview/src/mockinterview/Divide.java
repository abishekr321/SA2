package mockinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Divide {
	public static void recur(ArrayList<Integer> arr1, List<List<Integer>> ans, int start, int target, int[] arr) {
		if(start==arr.length) {
		if(target==0) {
			ans.add(new ArrayList(arr1));
		}
		return;
		}
		if(arr[start]<target) {
			arr1.add(arr[start]);
			recur(arr1,ans,start+1,target-arr[start],arr);
			arr1.remove(arr1.size()-1);
			recur(arr1,ans,start+1,target,arr);
		}
	}
	public static void main(String[] args) {
		int[] arr={1,2,3,4,6,12,8};
		int sum=0;
		int target=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		if(sum%2!=0) {
			System.out.println(-1);
			System.exit(0);
		}
		else {
			target=sum/2;
		}
		Arrays.sort(arr);
		List<List<Integer>> ans=new ArrayList();
		ArrayList<Integer>arr1=new ArrayList();
         recur(arr1,ans,0,target,arr);
         System.out.println(ans);
		
			
	
	}
}
