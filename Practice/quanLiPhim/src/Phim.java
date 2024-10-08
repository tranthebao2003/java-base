public class Phim {
	private String tenPhim;
	private int namsx;
	private HangSX hangsx;
	private double giaVe;
	private NgayChieu ngayChieu;

	public Phim(String tenPhim, int namsx, HangSX hangsx, double giaVe, NgayChieu ngayChieu) {
		this.tenPhim = tenPhim;
		this.namsx = namsx;
		this.hangsx = hangsx;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public int getNamsx() {
		return namsx;
	}

	public void setNamsx(int namsx) {
		this.namsx = namsx;
	}

	public HangSX getHangsx() {
		return hangsx;
	}

	public void setHangsx(HangSX hangsx) {
		this.hangsx = hangsx;
	}

	public double getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}

	public NgayChieu getNgayChieu() {
		return ngayChieu;
	}

	public void setNgayChieu(NgayChieu ngayChieu) {
		this.ngayChieu = ngayChieu;
	}

	public boolean giaVeRe(Phim phim1) {
		return this.giaVe < phim1.giaVe;
	}

	public void tenHangSx() {
		System.out.println("Tên hãng sản xuất của phim " + this.tenPhim + " là: " + this.hangsx.getTenHangSX());
	}
	
	public double giaSauKhiGiam(double x) {
		return this.giaVe * (1-x/100);
	}
}
