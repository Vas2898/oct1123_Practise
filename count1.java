import java.util.Scanner;

public class count{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value");
		int value = input.nextInt();
		input.close();
		
		count countobj = new count();
		countobj.find_divicer(value);

	}
	private void find_divicer(int no) {
		int div = 2;
		int count = 0;
		while (div < no) {
			if (no%div == 0) {
				//System.out.println(div);
				count += 1;
			}
			div += 1;
		}
		System.out.println("Conte of "+count);
	}
}
