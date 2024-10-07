package baiTapKeThuaAbstract;

public class XeOto extends PhuongTien{
	public String loaiNhienLieu;


	public XeOto(String loaiPt, HangSx hangSx, String loaiNhienLieu) {
		super(loaiPt, hangSx);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
		return 100;
	}
	
	
}
