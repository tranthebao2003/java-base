import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {

	SinhVien sv1 = new SinhVien(150, "dd231", "lop 1", 3.2);
	SinhVien sv2 = new SinhVien(120, "b32", "lop 2", 8);
	SinhVien sv3 = new SinhVien(1220, "c31", "lop 10", 8);
	
	SinhVien[] a_sv = new SinhVien[] {sv1, sv2, sv3};

	System.out.println("Ban đầu: " + Arrays.toString(a_sv));
//	hàm sắp xếp
	Arrays.sort(a_sv);
	System.out.println("Sau khi sắp xếp: " + Arrays.toString(a_sv));
	
//	tìm kiếm binarysearch
	System.out.println("Tìm kiếm sv1 trong mảng: " + Arrays.binarySearch(a_sv, sv1));
	}
}
