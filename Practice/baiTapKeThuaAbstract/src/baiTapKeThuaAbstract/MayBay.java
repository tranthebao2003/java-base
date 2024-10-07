package baiTapKeThuaAbstract;

public class MayBay extends PhuongTien{
	public String loaiNhienLieu;


	public MayBay(String loaiPt, HangSx hangSx, String loaiNhienLieu) {
		super(loaiPt, hangSx);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}
	
	public void catCanh() {
		System.out.println("Máy bay cất cánh");
	}
	
	public void haCanh() {
		System.out.println("Máy bay hạ cánh");
	}

	@Override
	public double layVanToc() {
		return 999;
	}
	
	
}
