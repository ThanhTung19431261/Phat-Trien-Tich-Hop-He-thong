package tuan2;

import java.util.Scanner;
import java.lang.Math;

public class Btclass1 {
    static Scanner sc = new Scanner(System.in);
	static int x;
	static int y;
	
	public Btclass1() {
	}

	public Btclass1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	static int ganToaDox() {
		return x =5;
	}
	static int ganToaDoy() {
		return y = 7;
	}
	static int nhapTDx() {
		System.out.println("Nhap toa do cho x:");
		x = sc.nextInt();
		return x;
	}
	static int nhapTDy() {
		System.out.println("Nhap toa do cho y:");
		y = sc.nextInt();
		return y;
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	static float tinhToado() {
		float TD = 0;
		return TD = (float) Math.sqrt(Math.pow(ganToaDox(), 2) + Math.pow(ganToaDoy(), 2));
	}
	public static void main(String[] args) {
        //Btclass1 t = new Btclass1();
       // t = new Btclass1(ganToaDox(),ganToaDoy());
       Btclass1 kt = new Btclass1(nhapTDx(), nhapTDy());
        //System.out.println(t);
        System.out.println("Toa do x,y la: " + kt);
        System.out.println("Khoang cach den goc toa do la: " + tinhToado());
    }
}
