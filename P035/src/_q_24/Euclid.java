package _q_24;

import java.util.Scanner;

public class Euclid {
	public static int gcd(int p , int q) {
		if (q == 0) return p;
		else
			{
			int r = p % q;
			System.out.println( q + "\t" + r);
			return gcd(q , r);			
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入你要计算最大公约数的两个值:");
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		//System.out.println("最大公约数是:" + );
		System.out.println("最大公约数是:" + gcd( num1, num2));
	}

}
