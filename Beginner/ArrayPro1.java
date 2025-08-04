import java.util.Scanner;

public class ArrayPro1{
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
	
		System.out.println("Enter 4 numbers to find the largest: ");
		for(int i=0;i<numbers.length;i++){
			System.out.println("Enter the number "+(i+1)+": ");
			numbers[i] = sc.nextInt();
		}
		
		int max = numbers[0];
		for(int i=0;i<numbers.length;i++){
			if(max < numbers[i]){
				max=numbers[i];
			}
		}
		System.out.println("Largest number: "+max);
	
	int[] arrMin = new int[5];
	
	System.out.println("Enter 4 numbers to find the smallest: ");
	for(int i=0;i<arrMin.length;i++){
		System.out.println("Enter the number "+(i+1)+": ");
		arrMin[i]=sc.nextInt();
	}
	int min=arrMin[0];
	for(int i=0;i<arrMin.length;i++){
		if(min>arrMin[i]){
			min=arrMin[i];
		}
	}
	System.out.println("Smallest number: "+min);
	}
}
