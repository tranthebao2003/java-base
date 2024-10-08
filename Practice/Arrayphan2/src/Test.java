import java.util.Arrays;
import java.util.Collections;

public class Test {
	public static int[] reverse(int[] x) {
		int[] rs = new int[x.length];
		int index = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			rs[index] = x[i];
			index++;
		}
		return rs;
	}
	
	public static void main(String[] args) {

		int[] a = new int[] { 1, 8, 2, 5, 2, 7, 8, 10, 6 };
		int[] b = new int[15];
		
//		hàm sắp xếp
		System.out.println("a ban đầu: " + Arrays.toString(a));
		Arrays.sort(a);
		a = Test.reverse(a);
		System.out.println("a sau khi sắp xếp giảm dần: " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("a sau khi sắp xếp tăng dần: " + Arrays.toString(a));
		

//		hàm binarySearch chỉ sử dụng được khi hàm đã
//		sắp xếp tăng dần
		System.out.println("hàm tìm kiếm: " + Arrays.binarySearch(a, 8));
		System.out.println("hàm tìm kiếm: " + Arrays.binarySearch(a, -1));
		
//		hàm fill
		Arrays.fill(b, 5);
		System.out.println("mảng b sau khi fill: " + Arrays.toString(b));
	}
}
