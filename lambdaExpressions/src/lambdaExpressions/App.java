package lambdaExpressions;

interface Lambda{
	public void demo();
}

public class App {

	public static void main(String[] args) {
		
		Lambda lambda = new Lambda() {

			@Override
			public void demo() {
				System.out.println("System 1");
				
			}
			
		};
		lambda.demo();
		
	}

}
