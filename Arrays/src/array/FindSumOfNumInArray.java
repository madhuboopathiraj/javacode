package array;

import java.util.HashMap;
import java.util.HashSet;

public class FindSumOfNumInArray {
	public static void main(String[] args) {
		int[]arr= {11,2,3,14,5};
		int target=17;
		int[]ans=new int[2];
		HashMap<Integer, Integer>map=new HashMap<>(); //storage area starts with empty map
		for(int i=0;i<arr.length;i++) {
			int sno=target-arr[i];
			if(map.containsKey(sno)) { //checks whether the map contains the value or not
				ans[0]=map.get(sno); //it gets the index value of sno and stores inside the ans[0]
				ans[1]=i;            //it stores the current index value 
				
			}map.put(arr[i],i);//which puts value inside the hashmap
		}System.out.println(ans[0]+" "+ans[1]);
	}
}