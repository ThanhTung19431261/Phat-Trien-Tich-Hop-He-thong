package tuan2;

import java.util.Scanner;

public class Bt2 {
    static Scanner sc = new Scanner(System.in);
	
	public static boolean prime(int n) {
		if(n <= 1) {
			return false;
		}
		for (int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int n;
		for (int i = 0; i < 5; i++) {
			System.out.println("Nhap vao so nguyen: ");
			n = sc.nextInt();
			if (prime(n)) {
				System.out.println(n+" la so nguyen to");
			}
			else {
				System.out.println(n+" khong phai so nguyen to");
			}
		}
		
	}
}
