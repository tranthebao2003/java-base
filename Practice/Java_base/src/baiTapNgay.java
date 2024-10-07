import java.util.Scanner;

public class baiTapNgay {
	public static void main(String[] args) {
		int month, year;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao thang: ");
		month = sc.nextInt();
		
		System.out.println("Nhap vao nam: ");
		year = sc.nextInt();
		
		switch (month) {
		case 1: 
		case 3: 
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		{
			System.out.println(month + " có 31 ngày: ");
			break;
		}
		
		case 4:
		case 6:
		case 9:
		case 11:
		{
			System.out.println(month + " có 30 ngày: ");
			break;
		}
		
		case 2:
		{
			if((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
				System.out.println(month + " có 29 ngày ");
			} else {
				System.out.println(month + " có 28 ngày ");
			}
			break;
		}
			
		default:
			System.out.println("Nhập tháng năm sai!");
		}
	}
}
