package Day5;

import java.util.Date;

public abstract class Insurrance {
	private String hoTen;
	private Date ngaySinh;
	private String noiThuongTru;
	private int soCMND;
	private String tenGoiBaoHiem;
	private String thoiHanDong;
	private String mucPhiDong;
	private String mucDich;
	private String cachThucDong;
	private Date thoiGianBatDau;
	private int insType;

	public Insurrance() {
	}

	

	public Insurrance(String hoTen, Date ngaySinh, String noiThuongTru, int soCMND, String tenGoiBaoHiem,
			String thoiHanDong, String mucPhiDong, String mucDich, String cachThucDong, Date thoiGianBatDau,
			int insType) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.noiThuongTru = noiThuongTru;
		this.soCMND = soCMND;
		this.tenGoiBaoHiem = tenGoiBaoHiem;
		this.thoiHanDong = thoiHanDong;
		this.mucPhiDong = mucPhiDong;
		this.mucDich = mucDich;
		this.cachThucDong = cachThucDong;
		this.thoiGianBatDau = thoiGianBatDau;
		this.insType = insType;
	}



	public String getTenGoiBaoHiem() {
		return tenGoiBaoHiem;
	}

	public void setTenGoiBaoHiem(String tenGoiBaoHiem) {
		this.tenGoiBaoHiem = tenGoiBaoHiem;
	}

	public String getThoiHanDong() {
		return thoiHanDong;
	}

	public void setThoiHanDong(String thoiHanDong) {
		this.thoiHanDong = thoiHanDong;
	}

	public int getInsType() {
		return insType;
	}

	public void setInsType(int insType) {
		this.insType = insType;
	}

	public String getMucPhiDong() {
		return mucPhiDong;
	}

	public void setMucPhiDong(String mucPhiDong) {
		this.mucPhiDong = mucPhiDong;
	}

	public String getMucDich() {
		return mucDich;
	}

	public void setMucDich(String mucDich) {
		this.mucDich = mucDich;
	}

	public String getCachThucDong() {
		return cachThucDong;
	}

	public void setCachThucDong(String cachThucDong) {
		this.cachThucDong = cachThucDong;
	}

	

	public Date getThoiGianBatDau() {
		return thoiGianBatDau;
	}



	public void setThoiGianBatDau(Date thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}



	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}



	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public String getNoiThuongTru() {
		return noiThuongTru;
	}

	public void setNoiThuongTru(String noiThuongTru) {
		this.noiThuongTru = noiThuongTru;
	}

	public int getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(int soCMND) {
		this.soCMND = soCMND;
	}

	@Override
	public String toString() {
		return "Ho Ten: " + hoTen + ", \nNgay Sinh: " + ngaySinh + ", \nNoi Thuong Tru: " + noiThuongTru
				+ ", \nSo CMND: " + soCMND + ", \nTen Goi Bao Hiem: " + tenGoiBaoHiem + ", \nThoi Han Dong: "
				+ thoiHanDong + ", \nMuc Phi Dong: " + mucPhiDong + ", \nMuc Dich: " + mucDich + ", \nCach Thuc Dong: "
				+ cachThucDong + ", \nThoiGianBatDau: " + thoiGianBatDau + "";
	}

}