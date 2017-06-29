package Day5;

import java.util.Date;

/**
 * @author HCD-Fresher017
 *
 */
public class ContractInsurrance extends Insurrance {
	private Date thoiGianKetThuc;
	private String sanPhamDiKem;

	public ContractInsurrance() {
	}

	public ContractInsurrance(Date thoiGianKetThuc, String sanPhamDiKem) {
		super();
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.sanPhamDiKem = sanPhamDiKem;
	}

	public Date getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}

	public void setThoiGianKetThuc(Date thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}

	public String getSanPhamDiKem() {
		return sanPhamDiKem;
	}

	public void setSanPhamDiKem(String sanPhamDiKem) {
		this.sanPhamDiKem = sanPhamDiKem;
	}

	@Override
	public String toString() {
		return super.toString() + " \nThoi Gian Ket Thuc=" + thoiGianKetThuc + ", \nSan Pham Di Kem=" + sanPhamDiKem
				+ "";
	}

}