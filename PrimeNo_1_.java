import java.util.Scanner;

public class count{

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value");
		int value = input.nextInt();
		input.close();
		
		count countobj = new count();
		int count = countobj.find_divicer(value);
		countobj.find_primeNumber(count);

	}
	
	private int find_divicer(int value) {
		int div = 2;
		int count = 0;
		while (div < value) {
			if (value%div == 0) {
				//System.out.println(div);
				count += 1;
			}
			div += 1;
		}
		return count;
	}
	
	private void find_primeNumber(int no) {
		if (no == 0) {
			System.out.println(" Is a Prime Number");
		}
		else {
			System.out.println(" Is Not a PrimeNumber");
		}		
	}
}
