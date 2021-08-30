
public class Calculator {
	 interface IntegerMath {
	        int operation(int a, int b);

	        default IntegerMath swap() {
	            return (a, b) -> operation(b, a);
	        }
	    }

	    private static int apply(int a, int b, IntegerMath op) {
	        return op.operation(a, b);
	    }
	    
	  

	    public static void main(String... args) {
	        IntegerMath addition = (a, b) -> a + b;
	        IntegerMath subtraction = (a, b) -> a - b;
	        IntegerMath multiply = (a, b) -> a* b;
	        System.out.println("40 + 2 = " + apply(40, 2, addition));
	        System.out.println("20 - 10 = " + apply(20, 10, subtraction));
	        System.out.println("2 * 3 = " + apply(2, 3, multiply));
	        System.out.println("10 - 20 = " + apply(20, 10, subtraction.swap()));
	        
	        SuchThread wow = new SuchThread();
	        wow.setName("Bob");
	        wow.run();
	    }
}
