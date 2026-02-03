import java.util.Scanner;

public class tonghaiso {

	public static void main(String[] args) {
       //	khai báo
		double num1, num2, sum;
		
		//khai báo đối tượng scanner
		Scanner banphim = new Scanner(System.in);
		
		// in ra thông tin, mời User nhập số thứ nhất
		System.out.print("mời nhập số thứ nhất: ");
		num1=banphim.nextDouble();
		
		System.out.print("mời nhập số thứ hai: ");
		num2=banphim.nextDouble();
		// tính toán
		sum=num1+num2;
		
		//xuất ra
		//System.out.print("tổng của hai số là: " + num1 + "và" + num2 + "là" + sum);
		System.out.printf("tổng của %.2f và %.2f là %.2f ", num1, num2, sum);
	}

}
