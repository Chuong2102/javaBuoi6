package javaBuoi6;
import java.util.Scanner;
public class Bai5 {

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
		float a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap a");
		a = input.nextFloat();
		System.out.println("Nhap b");
		b = input.nextFloat();
		System.out.println("Nhap c");
		c = input.nextFloat();
		
		Ptb2(a,b,c);
	}

}
