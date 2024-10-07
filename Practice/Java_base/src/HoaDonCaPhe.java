
//tính tổng tiền, 
// Kiểm tra khối lượng cà phê của túi đã bán có lớn hơn
// 1 con số được đưa vào chương trình hay không?
// kiem tra gia tien của hóa đơn có lớn hơn 500k hay ko?
// Tính số tiền giảm giá, giảm x% cho các hóa đơn có giá
// trị lớn hơn 500k
// Tính số tiền khách phải trả sau khi đã giảm giá
public class HoaDonCaPhe {
	private String nameCafe;
	private double giaTien1kg;
	private double khoiLuong;

	public HoaDonCaPhe(String nameCafe, double giaTien1kg, double khoiLuong) {
		this.nameCafe = nameCafe;
		this.giaTien1kg = giaTien1kg;
		this.khoiLuong = khoiLuong;
	}

	public double sum() {
		return this.giaTien1kg * this.khoiLuong;
	}

	boolean checkWeight(double weight) {
		return this.khoiLuong > weight;
	}

	boolean checkBill() {
		return this.sum() > 500000;
	}

	double sale(double x) {
		if(this.sum() > 500000) {
			return (x/100*this.sum());
		}
		return 0;
	}
	
	double payment(double x) {
		return this.sum() - this.sale(x);
	}

	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Trung nguyên", 500000, 2);
		System.out.println("Tổng tiền: " + hd.sum());

		System.out.println("Kiem tra khoi luong > 2kg: " + hd.checkWeight(2));
		System.out.println("Kiem tra khoi luong > 2kg: " + hd.checkWeight(1));

		System.out.println("Kiem tra bill > 500k: " + hd.checkBill());
		
		System.out.println("gia giá cho bill > 500k: " + hd.sale(10));
		System.out.println("giá sau khi giảm của bill > 500k: " + hd.payment(10));
	}
}
