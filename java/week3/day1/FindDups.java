package week3.day1;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num = {2,5,7,7,5,9,2,3};
Arrays.sort(num);

for(int i=0;i<num.length-1;i++) {
	if(num[i+1]==num[i]) {
		System.out.println("Duplicate values are "+num[i]);
	}
}
	}

}
