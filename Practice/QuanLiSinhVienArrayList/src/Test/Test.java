package Test;

import java.util.Scanner;

import main.DanhSachSv;
import main.SinhVien;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSv dssv = new DanhSachSv();

		int luaChon = 0;
		choice: do {
			System.out.println("MENU-----------------");
			System.out.println("Vui lòng chọn chức năng: ");
			System.out.println("1. Thêm sinh viên vào danh sách. \n" + "2. In danh sách sinh viên ra màn hình. \n"
					+ "3. Kiểm tra danh sách có rỗng hay không. \n" + "4. Lấy ra số lượng sinh viên trong danh sách. \n"
					+ "5. Làm rỗng danh sách sinh viên. \n"
					+ "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dữa trên mã sinh viên. \n"
					+ "7. Xóa 1 sinh viên ra khỏi danh sách sinh viên dựa trên mã sinh viên. \n"
					+ "8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập vào từ bàn phím. \n"
					+ "9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp. \n"
					+ "0. Chọn 0 để thoát khỏi chương trình. \n");

			luaChon = sc.nextInt();
//			để nó xử lí phím enter để nó khỏi bỏ qua masv
			sc.nextLine();
			
			switch (luaChon) {
			case 1:
				System.out.println("Nhập mã sinh viên: ");
				String maSv = sc.nextLine();
				
				System.out.println("Nhập họ và tên: ");
				String hoVaTen = sc.nextLine();
				
				System.out.println("Nhập năm sinh: ");
				int namSinh = sc.nextInt();
				
				System.out.println("Nhập điểm trung bình: ");
				double diemTb = sc.nextDouble();
				
				SinhVien sv = new SinhVien(maSv, hoVaTen, namSinh, diemTb);
				dssv.addSv(sv);
				
				break;

			case 2:
				dssv.printListSv();
				
				break;
			case 3:
				System.out.println("Kiểm tra danh sách rỗng: " + dssv.dsRongHayKhong());
				
				break;
			case 4:
				System.out.println("Số lượng sinh viên trong danh sách: " + dssv.laySlSv());
				
				break;
			case 5:
				dssv.lamRongDsSv();
				break;
			case 6:
				System.out.println("Nhập mã sinh viên: ");
				String maSv2 = sc.nextLine();
				
				SinhVien sv2 = new SinhVien(maSv2);
				System.out.println("Kiểm tra sinh viên có trong danh sách: " + dssv.kiemTraTonTai(sv2));
				break;
			case 7:
				System.out.println("Nhập mã sinh viên: ");
				String maSv3 = sc.nextLine();
				
				SinhVien sv3 = new SinhVien(maSv3);
				System.out.println("Xóa sinh viên có trong danh sách: " + dssv.xoaSv(sv3));
				break;
			case 8:
				System.out.println("Nhập vào tên sinh viên: ");
				String ten = sc.nextLine();
				dssv.timKiemsv(ten);
				break;
			case 9:
				dssv.sapXepSvGiamDanTheoDiem();
				dssv.printListSv();
				break;
			case 0:

				break;

			default:
				System.out.println("Lựa chọn không hợp lệ!");
				break choice;
			}
		} while (luaChon != 0);
	}
}
