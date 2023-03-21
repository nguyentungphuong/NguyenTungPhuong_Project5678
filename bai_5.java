import java.util.Scanner;
public class bai_5 {

	public static void main(String[] args) {
		int n, t=0;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.print("nhap n:");
			n=sc.nextInt();
			t+=n;
		}while(t<100);
		System.out.println("tong la"+t);
	}
}
