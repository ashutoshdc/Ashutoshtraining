package cybernxt;

public class Calculation {
	int x=100,y=200;
	//case 1 not taking any parameter not returning output
	void sum() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
	Calculation newcal=new Calculation();
	newcal.sum();
	}

}
  