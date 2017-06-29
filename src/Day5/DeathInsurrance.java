package Day5;

public class DeathInsurrance extends Insurrance {
	private String truongHopDongBaoHiem;
	private String thoiGianToiThieuThamGia;

	public DeathInsurrance() {
	}

	/**
	 * 
	 * @param truongHopDongBaoHiem
	 * @param thoiGianToiThieuThamGia
	 */
	public DeathInsurrance(String truongHopDongBaoHiem, String thoiGianToiThieuThamGia) {
		super();
		this.truongHopDongBaoHiem = truongHopDongBaoHiem;
		this.thoiGianToiThieuThamGia = thoiGianToiThieuThamGia;
	}

	public String getTruongHopDongBaoHiem() {
		return truongHopDongBaoHiem;
	}

	public void setTruongHopDongBaoHiem(String truongHopDongBaoHiem) {
		this.truongHopDongBaoHiem = truongHopDongBaoHiem;
	}

	public String getThoiGianToiThieuThamGia() {
		return thoiGianToiThieuThamGia;
	}

	public void setThoiGianToiThieuThamGia(String thoiGianToiThieuThamGia) {
		this.thoiGianToiThieuThamGia = thoiGianToiThieuThamGia;
	}

	@Override
	public String toString() {
		return super.toString() + " \nTruong Hop Dong Bao Hiem: " + truongHopDongBaoHiem
				+ ", \nThoi Gian Toi Thieu Tham Gia: " + thoiGianToiThieuThamGia + ",";
	}
}