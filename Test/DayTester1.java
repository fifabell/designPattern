package Test;

public class DayTester1 {

	public static void main(String[] args) {

		Day d1 = new Day();
		Day d2 = new Day(2010);
		Day d3 = new Day(2010, 10);
		Day d4 = new Day(2010, 10, 15);
		
		System.out.println("d1	= " + d1);
		System.out.println("d2	= " + d2);
		System.out.println("d3	= " + d3);
		System.out.println("d4	= " + d4);
		
		Day[] a = new Day[3];
		for(int i = 0; i < a.length; i++) { 
			a[i] = new Day();
		}
		
		for(int i = 0; i < a.length; i++) { 
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}