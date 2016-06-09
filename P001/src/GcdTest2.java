
public class GcdTest2 {
	
	public static int gcd(int p, int q)
	{
		for( int i = ( p < q ? p : q ) ; i >= 1 ; -- i)
		{
			if( p % i == 0 && q % i == 0)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(0,30));
	}

}
