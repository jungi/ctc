package ctc;

public class Ch3Pr4 {

	public static void towersOfHanoi(Ch3Pr1Stack a, Ch3Pr1Stack b,
			Ch3Pr1Stack c) {
			if (!a.isEmpty()) {
				b.push(a.pop());
				towersOfHanoi(a, b, c);
				c.push(b.pop());
			}
	}
}
