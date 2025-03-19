package week1.day2;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m=0,n=1;
for(int i=0;i<10;i++) {
int sum=m+n;
m=n;
n=sum;
System.out.println(sum);
	}

}}
