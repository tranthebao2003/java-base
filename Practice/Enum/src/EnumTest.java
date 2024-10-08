
public class EnumTest {
//	Day chính là enum ấy, nó chỉ có thể nhận vào nhưg
//	value đã định nghĩa
	private Day thu;
	private String monHoc;
	public EnumTest(Day thu, String monHoc) {
		super();
		this.thu = thu;
		this.monHoc = monHoc;
	}
	public Day getThu() {
		return thu;
	}
	public void setThu(Day thu) {
		this.thu = thu;
	}
	public String getMonHoc() {
		return monHoc;
	}
	public void setMonHoc(String monHoc) {
		this.monHoc = monHoc;
	}
	@Override
	public String toString() {
		return "EnumTest [thu=" + thu + ", monHoc=" + monHoc + "]";
	}
	
	
}
