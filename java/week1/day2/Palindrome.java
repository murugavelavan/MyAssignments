package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=121;
int r,sum=0,temp;
temp=num;
while(num>0) {
	r=num%10;
	sum=(sum*10)+r;
	num=num/10;
}if(sum==temp) {
	System.out.println("the given number is palindrome");
	}
	else {
		System.out.println("the given number is not palindrome");
	}

	}}
