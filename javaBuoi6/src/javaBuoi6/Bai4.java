package javaBuoi6;
import java.util.Scanner;
public class Bai4 {
	
	public static void Ptb1(int a, int b) {
        double nghiem;
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            nghiem = (double) -b / a;
            System.out.println("Phuong trinh co nghiem x = " + nghiem);
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a, b;
		double result;
		
		System.out.println("Nhap a");
		a = input.nextInt();
		System.out.println("Nhap b");
		b = input.nextInt();
		
		Ptb1(a,b);
	}

}
