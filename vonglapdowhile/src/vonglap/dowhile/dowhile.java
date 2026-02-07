package vonglap.dowhile;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner vonglap = new Scanner (System.in);
		System.out.print("nhap số lần lặp: ");
		int n = vonglap.nextInt();
		
		int i = 1;
		do {
			System.out.println("Hello 66CNTT-2");
			i++;
		} while  (i<=n);

	}

}
