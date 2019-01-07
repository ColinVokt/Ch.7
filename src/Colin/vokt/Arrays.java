package Colin.vokt;

public class Arrays {

	public static void main(String[] args) {
		String[] gamelist = {"one","two","three","four","five"
				,"six","seven","eight","nine","ten"};

		
		for ( int i=0; i<5; i++) {
			System.out.println(gamelist[i]);
		}
		
		double[] nums;
		nums = new double[100];
		System.out.println(nums[1]);
		
		char[] charlist = new char[10];
		System.out.println(charlist[0]);
	
		int numintlist[] = new int[11];
		System.out.println(numintlist[0]);
	
		boolean boolist[] = new boolean[10];
		System.out.println(boolist[9]);
		for (int i=0 ; i<100 ; i++) {
			nums[i] = Math.random() * 100;
			
		}
		for (int i=0 ; i<100 ; i++) {
		System.out.println(nums[1]);
		}
		int x = nums.length;
		System.out.println(x);
		for (int i=0 ; i<x ; i++) {
			System.out.println(nums[1]+ " ");
		}
		
		char[] city = {'s','a','l','t',' ','l','a','k','e'};
			System.out.println(city);
			
			double total = 0;
			for (int i=0 ; i<nums.length ; i++) {
				
				total = total+nums[i];
		}
		System.out.println(total);
		
		int[] myList = new int [10];
		for (int i=0 ; i<10 ; i++) {
			myList[i] = (int) (Math.random() * 10);
			
		}
		
		for (int i=0 ; i<10 ; i++) {
			if (myList[i] == 5) {
				System.out.println("True");
				break;
			}
			else {
				System.out.println("false");
			}
		}
		
		int min = myList[0];
		 
		for (int i=0 ; i<myList.length ; i++) {
			if (myList[i] < min) {
				min = myList[1];
			}
			
		}
		
		System.out.println(min);
		 
		for (int i=0 ; i<10 ; i++) {
			myList[i] = i;

		}
		
		for (int i = myList.length -1; i>0 ; i--) {
			int j = (int)(Math.random()*(i+1));
			int temp = myList[1];
			myList[i] = myList[j];
			myList[j] = temp;
			
			
		}
		for (int i=0 ; i<10 ; i++) {
			System.out.println(myList[i]);
		
	
		}
		for (int e: myList) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
}