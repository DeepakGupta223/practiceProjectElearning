package practiceProject;

public class PracticeProject1TypeCasting {
	public static void main(String args[]) {
		int intNum=3;
		double intChangeDouble = intNum; //Widening casting-> Automatic casting into double
		System.out.println(intNum);
		System.out.println(intChangeDouble);
		
		//now for narrowing Casting -> manual casting
		double doubleNum  =21.50;
		int intNum2 = (int) doubleNum;
		System.out.println(doubleNum);
		System.out.println(intNum2);
		
		
	}

}
