public class arraySumAvg{
	public static void main(String[] args){
		Scanner  sc = new Scanner(System.in);
		
		int[] numbers = new int[4];
		
		double sum = 0;
		System.out.println("Enter 4 numbers: ");
		for(int i=0;i<numbers.length;i++){
			System.out.println("Enter the number "+ (i+1)+ ": ");
			numbers[i] = sc.nextInt();
			sum += numbers[i];
		}
		System.out.println("Sum = "+sum);
		
		double average =sum /numbers.length;
		System.out.println("Average: "+ average);
  }
}
