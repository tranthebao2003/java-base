
public class HInhChuNhat extends Hinh {
	private double chieuRong, chieuCao;

	public HInhChuNhat(ToaDo toaDo, double chieuRong, double chieuCao) {
		super(toaDo);
		this.chieuRong = chieuRong;
		this.chieuCao = chieuCao;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}

	public double getChieuCao() {
		return chieuCao;
	}

	public void setChieuCao(double chieuCao) {
		this.chieuCao = chieuCao;
	}

	@Override
	public double tinhS() {
		// TODO Auto-generated method stub
		return this.chieuCao * this.chieuRong;
	}

	
}
