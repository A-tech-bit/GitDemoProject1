package project1;

public class Test1 {

	public static void main(String args[]) {
		String s = "123abs123";

		int temp = 0;
		int sum = 0;
		for (char v : s.toCharArray()) {

			if (Character.isDigit(v)) {

				temp = temp * 10 + (v - '0');
			} else {
				sum = sum + temp;
			}
		}
	}

}
