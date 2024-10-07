import java.util.Scanner;

public class baiTapHinhTron {
	public static void main(String[] args) {
		double r, dienTich, chuVi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào r: ");
		r = sc.nextDouble();
		chuVi = 2*Math.PI*r;
		dienTich = Math.pow(chuVi, 2) / (4*Math.PI);
		
		System.out.println("Chu vi hình tròn: " + Math.round(chuVi * 100.0)/100.0);
		System.out.println("Diện tích hình tròn: " + Math.round(dienTich * 100.0)/100.0);
	}
}
