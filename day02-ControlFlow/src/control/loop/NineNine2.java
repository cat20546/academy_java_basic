package control.loop;

public class NineNine2 {
	public static void main(String[] args) {
		for (int stage = 2; stage < 9; stage += 3) {
			
			System.out.printf("%n%d단\t\t%d단\t\t", stage, stage + 1);
			if (stage < 8) {
				System.out.printf("%d단", stage + 2);
			}
			System.out.println();

			for (int times = 1; times < 10; times++) {
				System.out.printf("%d x %d = %2d\t%d x %d = %2d\t"
						, stage, times, stage * times
						, stage + 1, times,	(stage + 1) * times);
				
				if (stage < 8) {
					System.out.printf("%d x %d = %2d", stage + 2, times, (stage + 2) * times);
				}
				System.out.println();
			}
		}
	}
}


