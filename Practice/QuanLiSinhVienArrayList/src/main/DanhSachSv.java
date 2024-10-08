package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class DanhSachSv {
//	<> là generic sẽ học sau
	private ArrayList<SinhVien> danhSach;

	public DanhSachSv() {
//		tạo 1 ArrayList cho và gán nó cho danh sach
		this.danhSach = new ArrayList<SinhVien>();
	}

	public DanhSachSv(ArrayList<SinhVien> danhSach) {
		super();
		this.danhSach = danhSach;
	}

//  1.
	public void addSv(SinhVien sv) {
		this.danhSach.add(sv);
	}

//	2.
	public void printListSv() {
//		phải có hàm toString bên class sinh viên
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}
	
//	3.
	public boolean dsRongHayKhong() {	
		return this.danhSach.isEmpty();
	}
	
//	4.
	public int laySlSv() {
		return this.danhSach.size();
	}
	
//	5.
	public void lamRongDsSv() {
		this.danhSach.removeAll(this.danhSach);
	}
	
//	6
	public boolean kiemTraTonTai(SinhVien sv) {
//		phải có hàm equal bên class sinh viên
		return this.danhSach.contains(sv);
	}
	
//	7
	public boolean xoaSv(SinhVien sv) {
//		phải có hàm equal bên class sinh viên
		return this.danhSach.remove(sv);
	}
	
//	8
	public void timKiemsv(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if(sinhVien.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(sinhVien);
			}
		}
	}
	
//	9
	public void sapXepSvGiamDanTheoDiem() {
//		để sử dụng Comparator ta viến thêm 1 hàm compare
//		khi đè lại cái interface Comparator
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if(sv1.getDiemTb() < sv2.getDiemTb()) {
					return 1;
				} else if(sv1.getDiemTb() > sv2.getDiemTb()) {
					return -1;
				} else {
					return 0;
				}
				
			}
		});
	}
}
