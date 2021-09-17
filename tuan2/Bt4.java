package tuan2;

public class Bt4 {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
        
        long sum = 0;
        int n;
        
        do {
            System.out.println("Nhap n = ");
            n = sc.nextInt();
        }while(n <= 0);
         
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
         
        System.out.println("Tong = " + sum);
        sc.close();
    }
}
