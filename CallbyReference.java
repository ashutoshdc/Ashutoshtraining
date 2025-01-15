package cybernxt;

public class CallbyReference {
	int x,y;
	public void addition(CallbyReference a) {
		x=a.x+10;
		System.out.println(x);
		x=a.y +x;
		System.out.println(x);
		//System.out.println(a.y);
	}

	public static void main(String[] args) {
		CallbyReference ob =new CallbyReference();
		ob.x=10;
	ob.y=15;
		ob.addition(ob);

	}

}
