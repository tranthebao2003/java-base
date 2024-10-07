package baiTapKeThuaAbstract;

public abstract class PhuongTien{

	private String loaiPt;
	private HangSx hangSx;

	public PhuongTien(String loaiPt, HangSx hangSx) {
		this.loaiPt = loaiPt;
		this.hangSx = hangSx;
	}

	public String getLoaiPt() {
		return loaiPt;
	}

	public void setLoaiPt(String loaiPt) {
		this.loaiPt = loaiPt;
	}

	public String layTenHangSx() {
		return this.hangSx.getTenHangSx();
	}
	public void batDau() {
		System.out.println("Bắt đầu");
	}
	
	public void tangToc() {
		System.out.println("Tăng tốc");
	}
	
	public void DungLai() {
		System.out.println("Dừng lại");
	}
	
	public abstract double layVanToc();
}
