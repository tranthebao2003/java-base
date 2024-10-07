
public class SinhVien {
	private String maSV, hoVaTen;
	private NgaySinh ngaySinh;
	private double diemTB;
	private Lop lop;
	
	public SinhVien(String maSV, String hoVaTen, NgaySinh ngaySinh, double diemTB, Lop lop) {
		this.maSV = maSV;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diemTB = diemTB;
		this.lop = lop;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public NgaySinh getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(NgaySinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}
	
	public void layTenKhoa() {
		System.out.println("Tên khoa: " + lop.getTenKhoa());
	}
	
	public boolean kiemTraThiDat() {
		return this.diemTB >= 5;
	}
	
	public boolean kiemTraCungNgay(SinhVien svKhac) {
		return this.ngaySinh.equals(svKhac.getNgaySinh());
	}
}
