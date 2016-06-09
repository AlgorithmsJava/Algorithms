package _q_17;

public class exR2 {
	public static String exR2(int n) {
		String s = exR2(n-3) + n +exR2(n-2) + n;
		if(n <= 0) return "";
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(exR2(3));
		//Exception in thread "main" java.lang.StackOverflowError
	}
}
