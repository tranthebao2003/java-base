
public class HinhTron extends Hinh {

	private double r;
	
	public HinhTron(ToaDo toaDo, double r) {
		super(toaDo);
		this.r = r;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
//	hinh tron này là lớp con của 1 class object
//	thì nhiệm vụ lớp con là phải cụ thể hóa lớp
//	abstract này 
	@Override
	public double tinhS() {
		// TODO Auto-generated method stub
		return Math.PI * this.r * this.r;
	}

	
}
