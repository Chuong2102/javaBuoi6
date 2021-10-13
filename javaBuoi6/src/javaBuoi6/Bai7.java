package javaBuoi6;
import java.util.Scanner;
public class Bai7 {

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
	
	public static void Ptb2(float a, float b, float c) {
		if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                System.out.println("Phuong trinh co 1 nghiem "
                        + "x = " + (-c / b));
            }
            return;
        }
        // delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // nghiem
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co 2 nghiem la`: " + "x1 = " + x1 + " va x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem!!!");
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.println("Nhap n (1 hoac 2)");
		n = input.nextInt();
		
		while(n == 1 || n == 2) {
			if(n == 1) {
				int a, b;
				
				System.out.println("Phuong trinh bac 1");
				System.out.println("Nhap a");
				a = input.nextInt();
				System.out.println("Nhap b");
				b = input.nextInt();
				Ptb1(a,b);
			}
			else if(n == 2) {
				float a,b,c;
				
				System.out.println("Phuong trinh bac 2");
				
				System.out.println("Nhap a");
				a = input.nextFloat();
				System.out.println("Nhap b");
				b = input.nextFloat();
				System.out.println("Nhap c");
				c = input.nextFloat();
				
				Ptb2(a,b,c);
			}
			
			System.out.println("Ban co muon tiep tuc? Nhap 1 hoac 2 de tiep tuc. Nhap bat ki de ket thuc");
			n = input.nextInt();
		}
		
			System.out.println("Thoat ch trinh");
		
	}

}
