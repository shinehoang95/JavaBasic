package Day5;

import java.util.Date;

public class LifeInsurrance extends Insurrance {
	private Date thoiGianKetThuc;
	private String thoiGianTroCap;

	public LifeInsurrance() {
	}

	public LifeInsurrance(Date thoiGianKetThuc, String thoiGianTroCap) {
		super();
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.thoiGianTroCap = thoiGianTroCap;
	}

	public Date getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}

	public void setThoiGianKetThuc(Date thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}

	public String getThoiGianTroCap() {
		return thoiGianTroCap;
	}

	public void setThoiGianTroCap(String thoiGianTroCap) {
		this.thoiGianTroCap = thoiGianTroCap;
	}

	@Override
	public String toString() {
		return super.toString() + " \nThoi Gian Ket Thuc: " + thoiGianKetThuc + ", \nThoi Gian Tro Cap: "
				+ thoiGianTroCap + "";
	}

}