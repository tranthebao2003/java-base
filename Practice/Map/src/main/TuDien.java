package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
//	nếu mình ko sử dụng String String cho key, value
//	mà là 1 String, class thì bắt buộc trong class phải
//	có comparable và equals để so sánh
//	TreeMap: có thứ tự
//	private Map<String, String> duLieu = new TreeMap<String, String>();
	
//	HashMap: thì không
	private Map<String, String> duLieu = new HashMap<String, String>();

	public String themTu(String tuKhoa, String yNghia) {
		return this.duLieu.put(tuKhoa, yNghia);
	}

	public String xoaTu(String tuKhoa) {
		return this.duLieu.remove(tuKhoa);
	}

	public String traTu(String tuKhoa) {
		String yNghia = this.duLieu.get(tuKhoa);
		return yNghia;
	}

	public void inTuKhoa() {
//		vì từ khóa sẽ không trùng nhau nên mình dùng
//		set
		Set<String> tapHopTuKhoa = this.duLieu.keySet();
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}

	public int laySoLuong() {
		return this.duLieu.size();
	}

	public void xoaTatCa() {
		this.duLieu.clear();
	}

	public static void main(String[] args) {
		TuDien tuDien = new TuDien();
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("---------------");
			System.out.println("Tra từ điển");
			System.out.println("1. Thêm từ (Từ khóa, ý nghĩa)\n" + "2. Xóa từ\n"
					+ "3. Tìm ý nghĩa của từ khóa => tra từ\n" + "4. In ra danh sách từ khóa\n"
					+ "5. In ra số lượng từ\n" + "6. Xóa tất cả các từ\n" + "0. Nhấn 0 để thoát");
			luaChon = sc.nextInt();
			sc.nextLine();
			switch (luaChon) {
			case 1:
				System.out.println("Nhập vào từ khóa: ");
				String tuKhoa = sc.nextLine();
				System.out.println("Nhập vào ý nghĩa: ");
				String yNghia = sc.nextLine();

				tuDien.themTu(tuKhoa, yNghia);
				break;
			case 2,3:
				System.out.println("Nhập vào từ khóa: ");
				String tuKhoa2 = sc.nextLine();
				if(luaChon == 2) {
					tuDien.xoaTu(tuKhoa2);
				} else {
					System.out.println("ý nghĩa là: " + tuDien.traTu(tuKhoa2));
				}
				break;
			case 4:
				tuDien.inTuKhoa();
				break;
			case 5:
				System.out.println("Số lượng từ khóa: " + tuDien.laySoLuong());
				break;
			case 6:
				tuDien.xoaTatCa();
				break;

			default:
				break;
			}
		} while (luaChon != 0);
	}
}
