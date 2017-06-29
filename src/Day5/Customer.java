package Day5;

public class Customer {
	private String hoTen;
	private String ngaySinh;
	private String noiThuongTru;
	private String soCMND;

	public Customer() {
	}

	public Customer(String hoTen, String ngaySinh, String noiThuongTru, String soCMND) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.noiThuongTru = noiThuongTru;
		this.soCMND = soCMND;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String string) {
		this.ngaySinh = string;
	}

	public String getNoiThuongTru() {
		return noiThuongTru;
	}

	public void setNoiThuongTru(String noiThuongTru) {
		this.noiThuongTru = noiThuongTru;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	@Override
	public String toString() {
		return "Customer [hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", noiThuongTru=" + noiThuongTru + ", soCMND="
				+ soCMND + "]";
	}

}