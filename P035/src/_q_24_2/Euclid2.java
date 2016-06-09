package _q_24_2;

public class Euclid2 {
	
	public static int gcd(int p, int q)
	{
		if(q == 0) return p;
		int r = p % q;
		return gcd(q, r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("1 111 111和 1 234 567的最大公约数是:" + gcd(1111111, 1234567));
	}

}
