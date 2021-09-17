package tuan2;

import java.util.Scanner;

public class Btclass2 {
    static Scanner sc = new Scanner(System.in);
	static int tuSo;
	static int mauSo;
	
	
	public Btclass2(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	
	public Btclass2() {
	}
	@Override
	public String toString() {
		return tuSo + "/" + mauSo;
	}
	public static int nhapTS() {
		System.out.println("Nhap tu so: ");
		tuSo = sc.nextInt();
		return tuSo;
	}
	public static int nhapMS() {
		System.out.println("Nhap mau so: ");
		mauSo = sc.nextInt();
		return mauSo;
	}
	public static void nghichDao() {
		int nd = 0;
		nd = tuSo;
		tuSo =mauSo;
		mauSo = nd;
	}
	public static float gtriThuc() {
		float GTT;
		return GTT = (float)tuSo / (float)mauSo;
	}
	public static void main(String[] args) {
        Btclass2 t = new Btclass2(nhapTS(), nhapMS());
        System.out.println("Phan so la: " + t);
        System.out.println("Gia tri thuc cua phan so la: " + gtriThuc());
        nghichDao();
        System.out.println("Gia tri nghich dao: "+ t);
    }
}
