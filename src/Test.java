
public class Test {

	public static void main(String[] args) {
		tableOfSquares(1,10);
		
	}
		static void getSquare(int n) {
			for(int i=0; i < n || i==n; i++) {
				System.out.println("the square of "+ i + " is "+ i*i);
			}
		}
		
		static void tableOfSquares(int i, int n) {
			if(i < n || i==n) {
				System.out.println(i + ", " + i*i);
				tableOfSquares(i + 1, n);
			}else {
				return;
			}
			
		}
		
	}

