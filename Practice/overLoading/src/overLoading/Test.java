package overLoading;

public class Test {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println("tim min return int "+ mm.timMin(5, 5));
		System.out.println("tim min return double "+ mm.timMin(5.2, 5.1));
		System.out.println("tim min return 3 tham số "+ mm.timMin(5.2, 5.1,1));
	}
}
