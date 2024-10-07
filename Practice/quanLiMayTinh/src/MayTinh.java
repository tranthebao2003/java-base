

public class MayTinh {
	private HangSX hangSx;
	private NgaySX ngaySx;
	private double giaBan;
	private double thoiBh;
	public MayTinh(HangSX hangSx, NgaySX ngaySx, double giaBan, double thoiBh) {
		super();
		this.hangSx = hangSx;
		this.ngaySx = ngaySx;
		this.giaBan = giaBan;
		this.thoiBh = thoiBh;
	}
	public HangSX getHangSx() {
		return hangSx;
	}
	public void setHangSx(HangSX hangSx) {
		this.hangSx = hangSx;
	}
	public NgaySX getNgaySx() {
		return ngaySx;
	}
	public void setNgaySx(NgaySX ngaySx) {
		this.ngaySx = ngaySx;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public double getThoiBh() {
		return thoiBh;
	}
	public void setThoiBh(int thoiBh) {
		this.thoiBh = thoiBh;
	}
	
	public boolean kiemTraThapHon(MayTinh mtk) {
		return this.giaBan < mtk.giaBan;
	}
	
	public void tenQg() {
		System.out.println(this.hangSx.getQuocGia().getTenQg());
	}
}
