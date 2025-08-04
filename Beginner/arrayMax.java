import java.util.Scanner;

public class arrayMax{
  public static void main(String[] args){
    Scanner  sc = new Scanner(System.in);
		int[] numbers = new int[4];
    
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
