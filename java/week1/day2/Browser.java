package week1.day2;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Browser call = new Browser();
System.out.println("chrome");
System.out.println(call.load());
System.out.println(call.lauchbro("chrome"));
	}
	String lauchbro(String browsername) {
		System.out.println("Browser launch successfully");
		return browsername;
	}
String load() {
	
	return ("Applicaton url loaded successfully");
}
}
