package cybernxt;

public class CallbyValue {
	int x;
	public void Addition(int a)
	{
		x=a+10;
		System.out.println(x);
	}
	public static void main(String[] args) {
		CallbyValue ob =new CallbyValue();
		ob.Addition(5);
		

	}

}
