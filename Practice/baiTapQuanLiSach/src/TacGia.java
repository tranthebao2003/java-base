
public class TacGia {
	private String tenTacGia;
	private Ngay ngaySing;
	
	
	public TacGia(String tenTacGia, Ngay ngaySing) {
		super();
		this.tenTacGia = tenTacGia;
		this.ngaySing = ngaySing;
	}


	public String getTenTacGia() {
		return tenTacGia;
	}


	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}


	public Ngay getNgaySing() {
		return ngaySing;
	}


	public void setNgaySing(Ngay ngaySing) {
		this.ngaySing = ngaySing;
	}
	
}
