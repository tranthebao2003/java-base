package main;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{
	private String maSv;
	private String hoVaTen;
	private int namSinh;
	private double diemTb;
	
	
	public SinhVien(String maSv) {
		this.maSv = maSv;
	}
	public SinhVien(String maSv, String hoVaTen, int namSinh, double diemTb) {
		this.maSv = maSv;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTb = diemTb;
	}
	public String getMaSv() {
		return maSv;
	}
	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public double getDiemTb() {
		return diemTb;
	}
	public void setDiemTb(double diemTb) {
		this.diemTb = diemTb;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(maSv, other.maSv);
	}
	
	@Override
	public String toString() {
		return "SinhVien [maSv=" + maSv + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", diemTb=" + diemTb + "]";
	}
	@Override
	public int compareTo(SinhVien o) {
		return this.maSv.compareTo(o.maSv);
	}
	
	
}
