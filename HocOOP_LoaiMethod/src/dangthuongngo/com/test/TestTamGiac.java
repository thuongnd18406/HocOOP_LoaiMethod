package dangthuongngo.com.test;

import dangthuongngo.com.model.TamGiac;

public class TestTamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TamGiac tg1=new TamGiac(20,12,25);
		System.out.println("Chu vi "+tg1.tinhChuVi());
		System.out.println("Diện Tích "+tg1.tinhDienTich());
		System.out.println(tg1);
	}

}
