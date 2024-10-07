
// ở đây ta thấy nó sẽ kế thừa dưới dạng override 
// của cả 2 class MayTinhBoTuiInterface và SapXepInterface
public class PhanMemMayTinh implements MayTinhBoTuiInterface, SapXepInterface{

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
			System.out.println(b + "khác 0");
			return 0;
		}
	}

	@Override
	public void sapXepTang(double[] arr) {
		int i, j;
		double key;
		for (i = 0; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int i, j;
		double key;
		for (i = 0; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			
			while(j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		
	}

}
