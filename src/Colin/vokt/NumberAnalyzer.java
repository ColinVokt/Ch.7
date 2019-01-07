package Colin.vokt;

public class NumberAnalyzer {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter the number of items");
		int n = input.nextInt();
		
		double[] numbers = new double[n];
		double sum = 0;
		
		System.out.print("Enter the numbers");
		for (int i = 0 ; i<n ; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
			
		}
		
		double average  = sum / numbers.length;
		
		int lower = 0;
		int high = 0;
		
		for (double element:numbers) {
			if (element < average ) {
				lower++;
			}
			else {
				high++;
			}
		 }
		double max = numbers[0];
		double min = numbers[0];
		
		for (double element:numbers) {
			if (element < min) {
				min = element;
			}
			if (element > max) {
				max = element;
			}
			
		}
		
		
			for (int i = 0; i < n-1; i++)
				
				for (int j =0; j < n-1; j++) {
					if (numbers[j] > numbers[j+1]) {
						double temp;
						temp = numbers[j];
						numbers[j] = numbers[j + 1];
						numbers[j+1] = temp;
					}
				}
					double x = 0;
		int median = numbers.length/2;
		if (numbers.length%2 == 1) {
			 x = numbers[median];
		}
		else {
		 x = (numbers[median-1] + numbers[median]) / 2;
		}
		
		double maxValue;
		int maxCount;
		
		for (int i = 0; i < numbers.length; ++i) {
			int count = 0;
			for (int j = 0; j < numbers.length; ++j) {
				if (numbers[j] == numbers[i]) { 
					++count;
				}
			
			if (count > maxCount) {
				maxCount =  count;
				maxValue = numbers[i];
			}
			
		}
		}
		double mean = sum / n;
		double mode;
		
			
			System.out.println(mean);
			System.out.println(min);
			System.out.println(max);
			System.out.println(x);
			System.out.println(maxCount);
		
	}

}
	
