
public class SapXepChon implements SapXepInterface{

	@Override
	public void sapXepTang(double[] arr) {
		int min_idx;
		for (int i = 0; i < arr.length - 1; i++) {
			min_idx = i;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
				double temp = arr[min_idx];
				arr[min_idx] = arr[i];
				arr[i] = temp;
			}
		}
		
	}

	@Override
	public void sapXepGiam(double[] arr) {
		// TODO Auto-generated method stub
		
	}

}
