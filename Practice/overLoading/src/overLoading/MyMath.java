package overLoading;

public class MyMath {
	
//	ta thấy 3 phương thức giống tên nhau chỉ khác
//	loại và số lượng tham số truyền vào thì ta gọi đây là
//	overLoading
	public int timMin(int a, int b) {
		if(a<b) return a;
		else return b;
	}
	
	public double timMin(double a, double b) {
		if(a<b) return a;
		else return b;
	}
	
	public double timMin(double a, double b, double c) {
		if(a<b) return a;
		else return b;
	}
}
