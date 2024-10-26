package test;

public class Test {
	
	public static void main(String[] args) throws Exception {
//		// Declare Number system instance
//		NumberSystem numberSystem = new NumberSystem();
//		
//		//Now create inner class instance
//		NumberSystem.PrimeNumber primeNo = numberSystem. new PrimeNumber();
//
//		// Show function output 
//		System.out.println(primeNo.checkNoIsPrime(3));
		
		// premitive data type
		//	  byte, int (32 bit) , char (16 bit), String, float(32 bit), boolean, double , short (16 bit)
//		int [] arra = {1,2,3,4};
//		int [] arrb = arra;
//		// print before changes
//		printArray(arra);
//		System.out.println("After changing other refrence value: ");
//		arrb[2] = 7;
//		printArray(arra);	
		
		// example of volatile keyword 
//		WorkerThread workerThread = new WorkerThread();
//		workerThread.start();
//		Thread.sleep(1000);
//		workerThread.stopThread();
//		workerThread.join();
		
		// example of fibonacci series
		Series series = new Series();
		Series.FibonacciSeries fibonacciSeries = series. new FibonacciSeries(); 
		Series.printSeries(fibonacciSeries.generateNfibonacciNumber(10));
		
	}
	
	
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
	}
}
