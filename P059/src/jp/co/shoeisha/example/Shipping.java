package jp.co.shoeisha.example;

/**
 * @author Youichi
 *
 */
public class Shipping {

	/**
	 * @param weight
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static int calculate(int weight, int x, int y, int z) {

		if (!(weight > 0 && weight < 30)) {
			throw new IllegalArgumentException();
		}

		int sum = x + y + z;

		if (!(x > 0 && y > 0 && z > 0 && sum > 0 && sum < 180)) {
			throw new IllegalArgumentException();
		}

		switch (checkSize(weight, sum)) {

		case 'S':
			return 600;
		case 'M':
			return 1200;
		case 'L':
			return 1800;
		default:
			throw new IllegalArgumentException();

		}
	}

	/**
	 * @param weight
	 * @param sum
	 * @return
	 */
	private static char checkSize(int weight, int sum) {
		if (sum < 60 && weight < 10) {

			return 'S';
		} else if (sum < 120 && weight < 20) {
			return 'M';
		} else if (sum < 180 && weight < 30) {

			return 'L';
		} else {
			throw new IllegalArgumentException();
		}
	}
}

