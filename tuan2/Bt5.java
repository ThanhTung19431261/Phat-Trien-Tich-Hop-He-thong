package tuan2;

public class Bt5 {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
        
		System.out.println("Nhập vào số phần tử trong mảng: ");
        int n;
        n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        for(int i=0; i<arr.length; i++){
            System.out.print("Nhập vào giá trị cho phần tử thứ "+(i+1)+": ");
            arr[i] = sc.nextDouble();
        }
        sc.close();
        for(int i=0; i<arr.length; i++){
        	if(arr[i] > 0)
        		sum = sum + arr[i];
        }
        System.out.format("Kết quả là: %.3f", sum);
    }
}
