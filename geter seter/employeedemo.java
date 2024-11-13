package day2;

public class employeedemo {

	public static void main(String[] args) {
		employee e1=new employee();
		employee e2=new employee();
		employee e3=new employee();
		employee e4=new employee();
		
		
		e1.setid(10);
		e1.setname("Pradeep");
		e1.setcity("villupram");
		
		e2.setid(11);
		e2.setname("Hari");
		e2.setcity("chennai");
		
		e3.setid(12);
		e3.setname("dharun");
		e3.setcity("Madurai");
		
		e4.setid(13);
		e4.setname("Gokul");
		e4.setcity("pondy");
		
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		

	}

}
