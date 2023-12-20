package day9;

public class ConditionalFlow {

	public static void main(String[] args) {
		
		
		boolean result = 2 == 3;
		if (result){
			System.out.println("Yuvraj");
		}
		else {
		System.out.println("Sachin");
		}
		ConditionalFlow conditionalFlow = new ConditionalFlow();
//		conditionalFlow.calculateData(2, 3);
		
		boolean methodOutput = conditionalFlow.calculateData(7, 3);

		if (methodOutput){
			System.out.println("Yuvraj");
		}
		else {
		System.out.println("Sachin");
		}
		
		if (conditionalFlow.calculateData(5, 3)) {
			System.out.println("chal gya");
		} else {
			System.out.println("nhi chalne ka option ");
		}
	}
	
	boolean calculateData(int first, int second) {
		// boolean result = 2 > 3;
		boolean result = first > second;
		
		return result;
	}

}
