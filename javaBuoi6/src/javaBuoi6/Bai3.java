package javaBuoi6;
import java.util.Scanner;
public class Bai3 {

	public static void Print(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		String str;
		
		System.out.println("Nhap xau bat ki`");
		str = input.next();
		System.out.println("Nhap n");
		n = input.nextInt();
		for(int i = 0; i < n; i++)
			Print(str);
	}

}
