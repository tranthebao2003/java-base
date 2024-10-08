package stringConvertToArray;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		String s = "Xin chào các bạn, tui là thế bảo";
		
//		cắt dựa trên khoảng trắng
		String[] a = s.split(" ");
		System.out.println(Arrays.toString(a));
		
		String[] b = s.split(",");
		System.out.println(Arrays.toString(b));
		
		String s2 = "Xin chào, mình là bảo. Mình là dân it";
//		có thể truyền vào 1 regex
		String[] c = s2.split("\\.|\\,");
		System.out.println(Arrays.toString(c));
	}
}
