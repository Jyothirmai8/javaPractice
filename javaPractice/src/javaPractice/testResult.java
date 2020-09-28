package javaPractice;

public class testResult {

	public static void main(String[] args) {
		AB a = new AB(2, 4);
		System.out.println(a.testA);

	}

}
class AB{
	int testA,testB;
	AB(int i, int j){
		testA =i;
		testB=j;
	}
}