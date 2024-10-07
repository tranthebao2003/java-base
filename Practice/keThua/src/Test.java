
public class Test {
	public static void main(String[] args) {
		ConNguoi cn = new ConNguoi("TheBao", 2002);
		cn.an();
		cn.uong();
		cn.ngu();
		
		HocSinh hs = new HocSinh("The Bao", 2002, "Lop 1", "Thong nhat a");
		hs.an();
		hs.ngu();
		hs.uong();
		hs.lamBt();
	}
}
