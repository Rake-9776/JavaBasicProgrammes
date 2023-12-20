package ArrayProgrammes;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class sumOfArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6 };

		int sum = Arrays.stream(arr).sum();

		int sum2 = IntStream.of(arr).sum();

		int asInt = Arrays.stream(arr).reduce((e, e1) -> e + e1).getAsInt();
		
		int asInt2 = Arrays.stream(arr).reduce(Integer::sum).getAsInt();
		
		long sum3 = Arrays.stream(arr).summaryStatistics().getSum();
		
		
	}
}
