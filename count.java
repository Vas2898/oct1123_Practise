public class count{

	public static void main(String[] args) {
		count countobj = new count();
		countobj.find_divicer(100);

	}
	private void find_divicer(int no) {
		int div = 2;
		int count = 0;
		while (div < no) {
			if (no%div == 0) {
				System.out.println(div);
				count += 1;
			}
			div += 1;
		}
		System.out.println(count);
	}
}
