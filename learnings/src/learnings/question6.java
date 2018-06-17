package learnings;

public class question6 {

	public static void main(String[] args) {

		int a = 5;
		int b = 3;
		int c;

		if (a < b) {
			c = 7;
		} else if ((a + b) / 2 > (b - a)) {
			c = 14;
		} else if ((a != b) && (a - b > 0)) {
			c = 22;
		} else {
			c = 42;
		}

		System.out.println(c);

	}
}