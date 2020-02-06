
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// First we have to create an object to store the functions
		Calculator calculator = new Calculator();
		 System.out.println(calculator.factorial(5));
		 System.out.println(calculator.power(3,2));
		 System.out.println(calculator.exp(2));
		 System.out.println(calculator.cos(0.3));
		 System.out.println(calculator.sin(0.3));
		 double[] vector1 = {1,1,1};
		 double[] vector2 = {1,2,3};
		 double[][] matrix = {{1,1,1},{1,2,3}};
		 System.out.println(calculator.scalarProduct(vector1, vector2));
		 System.out.println(calculator.matrixVectorProduct(matrix, vector2)); 


		

	}
// Here I will create the methods!
	//Factorial!
	public double factorial(int x) {
		int result = 1;
		for(int i = 1; i<=x; i++) {
			result = result * i ;}
		return result;
		}
	
	
	//Power
		public double power(double x, double y) {
			double result = 1d;  // A must move still do not know why!
			for(int i=1; i<=y; i++) {
			 result = result * x ;} 
			 return result;
	}
        
	//Exponential
	public double exp(double x) {
		double result = 1d;
		for (int i = 1; i<=30; i++) {
		result = result + power(x,i) / factorial(i);
		}
		return result;
	}
	
	// Cosine Function
	public double cos(double x) {
		double result = 1d;
		for(int i = 1; i <=5; i++) {
			result = result + (power(-1,i)*power(x,2*i)) / factorial(2*i);
			
		}
		return result;
	}
	
	// Sine Function
	public double sin(double x) {
		double result = 1d;
		for(int i = 1; i <=5; i++) {
			result = x - (power(-1,i)*power(x,2*i+1)) / factorial(2*i+1);
		}
		return result;
	}
	
	// Scalar product of N-dim vectors
	public double scalarProduct(double[] a, double[] b) {
		double result = 0d;
		if(!(a.length == b.length))// The exclamation mark stands for NOT!
			System.out.println("error!");
		for(int i=0; i < a.length; i++) {// Because arrays start from zero
			result = result + a[i]*b[i];
		}
		return result;
	}
	// matrix multiplication with a vector
	public double matrixVectorProduct(double[][] matrix, double[] x) {
		
		
	
	return 0;
	}

	
	
}	
