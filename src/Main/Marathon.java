package Main;

class Marathon {

	public static int BestRunner(int[] times) {
		int best = 0;
		for (int i = 0; i < times.length; i++) {
			if (times[i] < times[best]) {
				best = i;
			}
		}
		return best;
	}

	public static int secondBestRunner(int[] times) {
		int best = 0, secondBest = 0;
		best = BestRunner(times);
		if (best == 0) {
			secondBest = 1;
		}
		for (int i = 0; i < times.length; i++) {
			if (i == best) {
				continue;
			}
			if (times[i] < times[secondBest]) {
				secondBest = i;
			}
		}
		return secondBest;
	}

	public static void main(String[] arguments) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
				"Matt", "Alex", "Emma", "John", "James", "Jane", "Emily",
				"Daniel", "Neda", "Aaron", "Kate" };

		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412,
				393, 299, 343, 317, 265 };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ": " + times[i]);
		}
		int best = 0, secondBest = 0;

		best = BestRunner(times);
		secondBest = secondBestRunner(times);

		System.out.println("Best Runner : " + names[best] + ": " + times[best]);
		System.out.println("Second Best Runner : " + names[secondBest] + ": "
				+ times[secondBest]);
	}
}
