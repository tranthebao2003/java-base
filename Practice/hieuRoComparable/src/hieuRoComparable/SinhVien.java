package hieuRoComparable;

public class SinhVien implements Comparable<SinhVien>{
	private int maSv;
	private String name;
	private String nameClas;
	private double diemTb;
	public SinhVien(int maSv, String name, String nameClas, double diemTb) {
		super();
		this.maSv = maSv;
		this.name = name;
		this.nameClas = nameClas;
		this.diemTb = diemTb;
	}
	public int getMaSv() {
		return maSv;
	}
	public void setMaSv(int maSv) {
		this.maSv = maSv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameClas() {
		return nameClas;
	}
	public void setNameClas(String nameClas) {
		this.nameClas = nameClas;
	}
	public double getDiemTb() {
		return diemTb;
	}
	public void setDiemTb(double diemTb) {
		this.diemTb = diemTb;
	}
	
//	method này là lấy tên
	public String getTen() {
		
//		trim để xóa khoảng trắng đầu, cuối
		String s = this.name.trim();
//		indexOf trả về index đầu tiên thỏa mãn subString truyền vào
		if(s.indexOf(" ") >= 0) {
//			trả về index cuối cùng thỏa mãn subString truyền vào
			int vt = s.lastIndexOf(" ");
			return s.substring(vt + 1);
		} else {
			return s;
		}
	}
	@Override
	public int compareTo(SinhVien o) {
//		< 0 : đối tượng thực hiện so sánh này bé hơn đối tượng mình truyền vào
//		= 0 : 2 đối tượng như nhau
//		> 0 : ngược lại bé hơn 0
		
//		ví dụ ở đây mình thử so sánh 1 trường mã sinh viên
//		return this.maSv - o.maSv;
		
		String tenThis = this.getTen();
		String teno = o.getTen();
		
		return tenThis.compareTo(teno);
	}
	
	
}
