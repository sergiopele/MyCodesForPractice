package Practice.String;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class main {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(new ArrayList<>(Arrays.asList(10,20,30,40)));
		List<Integer> list2=new ArrayList<>(new ArrayList<>(Arrays.asList(5,3,8,9,10,11,5)));
		
		printer(findMaxSum(list));
		printer(findMaxSum(list2));
		
		
	}
	
	public static int findMaxSum(List<Integer> list) {
		int max, sMax;
		
		for(int i=0;i<list.size();i++){
			for (int j = i; j < list.size()-i-1; j++) {
				if(list.get(j)> list.get(j+1)){
					int temp= list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
		max=list.get(list.size()-1);
		sMax=list.get(list.size()-2);
		
		return max+sMax;
	}
	public static void printer(int num){
		System.out.println(num);
	}
}