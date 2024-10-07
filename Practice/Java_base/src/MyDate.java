public class MyDate {
//	tao ra 1 class Date: ngay thang nam
//	trong Date co cac du lieu: day, month, year
//	trong Date co phuong thuc: 
//	in ra ngay, in ra thang, in ra nam, in ra ngay thang nam
	
	private int day;
	private int month;
	private int year;
	
//	contructor
	public MyDate(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void printDay() {
		System.out.println("Day: " + this.day);
	}
	public void printMonth() {
		System.out.println("Month: " + this.month);
	}
	public void printYear() {
		System.out.println("Year: " + this.year);
	}
	public void printDate() {
		System.out.println(this.day + "/" + this.month + "/" + this.year); 
	}
	
	
	
	public static void main(String[] args) {
		int d;
		MyDate md = new MyDate(25, 2, 2024);
		md.printDay();
		md.printMonth();
		md.printYear();
		md.printDate();
	}
}

