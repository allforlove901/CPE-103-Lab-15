
public class RunTimes {

	public static void main(String args[]){
		
		Algorithms alg = new Algorithms();
		System.out.println("Logarithmic algorithm's running times:");
		
		for(long N=10000; N<100000000; N = N*2){
			long startTime = System.nanoTime();
			alg.logarithmicAlgorithm(N);
			long endTime = System.nanoTime();
			System.out.println("T(" + N + ") = " + (endTime-startTime)/1000000);
		}
		
		System.out.println("\nLinear algorithm's running times:");
		for(long N=10000; N<100000000; N = N*2){
			long startTime = System.nanoTime();
			alg.linearAlgorithm(N);
			long endTime = System.nanoTime();
			System.out.println("T(" + N + ") = " + (endTime-startTime)/1000000);
		}
		
		System.out.println("\nNlogN algorithm's running times:");
		for(long N=10000; N<100000000; N = N*2){
			long startTime = System.nanoTime();
			alg.NlogNAlgorithm(N);
			long endTime = System.nanoTime();
			System.out.println("T(" + N + ") = " + (endTime-startTime)/1000000);
		}
		
		System.out.println("\nQuadratic algorithm's running times:");
		for(long N=10000; N<330000; N = N*2){
			long startTime = System.nanoTime();
			alg.quadraticAlgorithm(N);
			long endTime = System.nanoTime();
			System.out.println("T(" + N + ") = " + (endTime-startTime)/1000000);
		}
	}	
}
