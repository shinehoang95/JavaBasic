package Day5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Day5.DataAccess;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 
 * @author HCD-Fresher017
 *
 */
public class InsurranceManagement {
	static Scanner scan = new Scanner(System.in);
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String[] args) throws ParseException {
		InsurranceManagement insmng = new InsurranceManagement();
		
		
		int insType = 0;
		do {
			System.out.println("Goi bao hiem");
			System.out.println("--Bao hiem tu vong = 0");
			System.out.println("--Bao hiem sinh ky =1");
			System.out.println("--Bao hiem thoi han hop dong =2");
			insType = inputVl();

		} while (insType < 0 || insType > 2);
		switch (insType) {
		case 0:
			insmng.inputDeathInsurrance();
			break;
		case 1:
			insmng.inputLifeInsurrance();
			break;
		case 2:
			insmng.inputContractInsurrance();
			break;
		}
		
	}

	public static int inputVl() {
		int insType = 0;
		boolean type = false;
		while (type == false) {
			System.out.println("Xin moi chon:");
			try {
				insType = scan.nextInt();
				type = true;
			} catch (Exception e) {
				System.out.println("Moi nhap lai");
				scan.nextLine();
			}
		}
		return insType;
	}

	public void inputInsurrance(Insurrance ins) throws ParseException {
		scan.nextLine();
		System.out.println("Nhap ho ten: ");
		ins.setHoTen(scan.nextLine());
		System.out.println("Nhap ngay sinh");
		ins.setNgaySinh(formatter.parse(scan.nextLine()));
		System.out.println("Noi thuong tru: ");
		ins.setNoiThuongTru(scan.nextLine());
		System.out.println("So CMND: ");
		ins.setSoCMND(scan.nextInt());
		scan.nextLine();
		System.out.println("Thoi han: ");
		ins.setThoiHanDong(scan.nextLine());
		System.out.println("Muc phi dong: ");
		ins.setMucPhiDong(scan.nextLine());
		System.out.println("Muc dich: ");
		ins.setMucDich(scan.nextLine());
		System.out.println("Cach thuc dong: ");
		ins.setCachThucDong(scan.nextLine());
		System.out.println("Thoi gian bat dau: ");
		ins.setThoiGianBatDau(formatter.parse(scan.nextLine()));
	}

	public void inputDeathInsurrance() throws ParseException {
		Insurrance ins = new DeathInsurrance();
		inputInsurrance(ins);
		ins.setInsType(0);
		ins.setTenGoiBaoHiem("Bao hiem tu vong");
		System.out.println("Truong hop dong bao hiem: ");
		((DeathInsurrance) ins).setTruongHopDongBaoHiem(scan.nextLine());
		System.out.println("Thoi gian toi thieu tham gia: ");
		((DeathInsurrance) ins).setThoiGianToiThieuThamGia(scan.nextLine());
		System.out.println(((DeathInsurrance) ins).toString());
		addInsurrance1(((DeathInsurrance) ins));
	}

	public void inputLifeInsurrance() throws ParseException {
		Insurrance ins = new LifeInsurrance();
		inputInsurrance(ins);
		ins.setInsType(1);
		ins.setTenGoiBaoHiem("Bao hiem sinh ky");
		System.out.println("Thoi gian ket thuc: ");
		((LifeInsurrance) ins).setThoiGianKetThuc(formatter.parse(scan.nextLine()));
		System.out.println("Thoi gian tro cap: ");
		((LifeInsurrance) ins).setThoiGianTroCap(scan.nextLine());
		System.out.println(((LifeInsurrance) ins).toString());
		addInsurrance2((LifeInsurrance) ins);
	}

	public void inputContractInsurrance() throws ParseException {
		Insurrance ins = new ContractInsurrance();
		inputInsurrance(ins);
		ins.setInsType(2);
		ins.setTenGoiBaoHiem("Bao hiem hop dong");
		System.out.println("Thoi gian ket thuc: ");
		((ContractInsurrance) ins).setThoiGianKetThuc(formatter.parse(scan.nextLine()));
		System.out.println("San pham di kem: ");
		((ContractInsurrance) ins).setSanPhamDiKem(scan.nextLine());
		System.out.println(((ContractInsurrance) ins).toString());
	}
	
	public void addInsurrance1(DeathInsurrance dins){
		DataAccess da=new DataAccess();
		Connection con =da.getConnect();
		PreparedStatement pstm = null;
		
		String sql = "INSERT INTO INSURRANCE(hoten,ngaysinh,noithuongtru,soCMND,tengoiBH,thoihandong,mucphidong,mucdich,"
				+ "cachthucdong,thoigianbatdau,loaiBH,thoigiantoithieuthamgia)"+"VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, dins.getHoTen());
			pstm.setDate(2, new java.sql.Date(dins.getNgaySinh().getTime()));
			pstm.setString(3, dins.getNoiThuongTru());
			pstm.setInt(4, dins.getSoCMND());
			pstm.setString(5, dins.getTenGoiBaoHiem());
			pstm.setString(6, dins.getThoiHanDong());
			pstm.setString(7, dins.getMucPhiDong());
			pstm.setString(8, dins.getMucDich());
			pstm.setString(9, dins.getCachThucDong());
			pstm.setDate(10, new java.sql.Date(dins.getThoiGianBatDau().getTime()));
			pstm.setString(11, dins.getTruongHopDongBaoHiem());
			pstm.setString(12, dins.getThoiGianToiThieuThamGia());
			pstm.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
	}
	}
		public void addInsurrance2(LifeInsurrance lins){
			DataAccess da=new DataAccess();
			Connection con =da.getConnect();
			PreparedStatement pstm = null;
			
			String sql = "INSERT INTO INSURRANCE(hoten,ngaysinh,noithuongtru,soCMND,tengoiBH,thoihandong,mucphidong,mucdich,"
					+ "cachthucdong,thoigianbatdau,thoigianketthuc,thoigiantrocap)"+"VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
			try {
				pstm = con.prepareStatement(sql);
				pstm.setString(1, lins.getHoTen());
				pstm.setDate(2, new java.sql.Date(lins.getNgaySinh().getTime()));
				pstm.setString(3, lins.getNoiThuongTru());
				pstm.setInt(4, lins.getSoCMND());
				pstm.setString(5, lins.getTenGoiBaoHiem());
				pstm.setString(6, lins.getThoiHanDong());
				pstm.setString(7, lins.getMucPhiDong());
				pstm.setString(8, lins.getMucDich());
				pstm.setString(9, lins.getCachThucDong());
				pstm.setDate(10, new java.sql.Date(lins.getThoiGianBatDau().getTime()));
				pstm.setDate(11, new java.sql.Date(lins.getThoiGianKetThuc().getTime()));
				pstm.setString(12, lins.getThoiGianTroCap());
				pstm.executeUpdate();
			}
			catch (SQLException e) {
				e.printStackTrace();
		}
	
}
		public void addInsurrance3(ContractInsurrance cins){
			DataAccess da=new DataAccess();
			Connection con =da.getConnect();
			PreparedStatement pstm = null;
			
			String sql = "INSERT INTO INSURRANCE(hoten,ngaysinh,noithuongtru,soCMND,tengoiBH,thoihandong,mucphidong,mucdich,"
					+ "cachthucdong,thoigianbatdau,thoigianketthuc,sanphamdikem)"+"VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
			try {
				pstm = con.prepareStatement(sql);
				pstm.setString(1, cins.getHoTen());
				pstm.setDate(2, new java.sql.Date(cins.getNgaySinh().getTime()));
				pstm.setString(3, cins.getNoiThuongTru());
				pstm.setInt(4, cins.getSoCMND());
				pstm.setString(5, cins.getTenGoiBaoHiem());
				pstm.setString(6, cins.getThoiHanDong());
				pstm.setString(7, cins.getMucPhiDong());
				pstm.setString(8, cins.getMucDich());
				pstm.setString(9, cins.getCachThucDong());
				pstm.setDate(10, new java.sql.Date(cins.getThoiGianBatDau().getTime()));
				pstm.setDate(11, new java.sql.Date(cins.getThoiGianKetThuc().getTime()));
				pstm.setString(12, cins.getSanPhamDiKem());
				pstm.executeUpdate();
			}
			catch (SQLException e) {
				e.printStackTrace();
		}
	
}
}