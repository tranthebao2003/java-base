
public class MayTinhCasioFX500 implements MayTinhBoTuiInterface{
//	neu ko co contructor thì mac dinh nó có 1 contructor rỗng

	@Override
	public double cong(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double tru(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double nhan(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double chia(double a, double b) {
		// TODO Auto-generated method stub
		try {
			return a/b;
		} catch (Exception e) {
			return 0;
		}
	}
	
}
