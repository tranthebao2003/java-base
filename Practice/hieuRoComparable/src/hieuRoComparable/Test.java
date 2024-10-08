package hieuRoComparable;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(150, "b", "lop 1", 3.2);
		SinhVien sv2 = new SinhVien(120, "b", "lop 2", 8);
		
		System.out.println(sv1.compareTo(sv2));
	}
}
