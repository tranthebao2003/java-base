package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong_HashSet {
	Set<String> thungPhieuDuThuong = new HashSet<String>();
	
	
	public RutThamTrungThuong_HashSet() {
	}

	public boolean themPhieu(String giaTri) {
		return this.thungPhieuDuThuong.add(giaTri);
	}
	
	public boolean xoaPhieu(String giaTri) {
		return this.thungPhieuDuThuong.remove(giaTri);
	}
	
	public boolean kiemTraPhieuTonTai(String giaTri) {
		return this.thungPhieuDuThuong.contains(giaTri);
	}
	
	public void xoaAllPhieuDuThuong() {
		this.thungPhieuDuThuong.clear();
	}
	
	public int laySoLuongPhieu() {
		return this.thungPhieuDuThuong.size();
	}
	
	public void inAll() {
		System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
	}
	
	public String rut1phieu() {
		String ketQua = "";
		Random rd = new Random();
//		random ngẫu nhiên vị trí của phiếu trong thùng phiếu nhỏ hơn kích thước của thùng
		int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
		ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
		return ketQua;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
		
		int luaChon = 0;
		do {
			System.out.println("-----------------");
			System.out.println("Menu: ");
			System.out.println("1. Thêm mã số dự thưởng");
			System.out.println("2. Xóa mã số dự thưởng");
			System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không");
			System.out.println("4. Xóa tất cả mã số dự thưởng");
			System.out.println("5. Số lượng mã số dự thưởng");
			System.out.println("6. Rút thăm trúng thưởng");
			System.out.println("7. In ra tất cả phiếu trúng thưởng");
			System.out.println("0. Thoát khỏi chương trình");
			
			luaChon = sc.nextInt();
			sc.nextLine();
			
			switch (luaChon) {
			case 1,2,3:
				System.out.println("Nhập vào mã phiếu dự thưởng");
				String giaTri = sc.nextLine();
				if(luaChon == 1) {
					rt.themPhieu(giaTri);
				} else if(luaChon == 2) {
					rt.xoaPhieu(giaTri);
				} else {
					System.out.println("Kết quả kiểm tra: " + rt.kiemTraPhieuTonTai(giaTri));
				}
				break;
			
			case 4:
				rt.xoaAllPhieuDuThuong();
				break;
			
			case 5:
				System.out.println("Số lượng phiếu: " + rt.laySoLuongPhieu());
				break;
				
			case 6:
				System.out.println("Mã số trúng thưởng là: " + rt.rut1phieu());
				break;
				
			case 7:
				System.out.println("Các mã phiếu dự thưởng: ");
				rt.inAll();
				break;
			default:
				break;
			}
		} while (luaChon != 0);
	}
}
