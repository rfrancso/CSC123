//Francsico Rodriguez (frodriguez127@toromail.csudh.edu)

public class OddNumbersLab2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 99; i++) {
			if (i / 2 * 2 == i) {
				continue;
			}
			System.out.println(i);
		}
	}
}
