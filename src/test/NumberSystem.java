package test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberSystem {

	public class PrimeNumber {
		public boolean checkNoIsPrime(int number) {
			Calculator modFunction = (a, b) -> a % b;
			for (int i = 2; i < number; i++) {
				if (modFunction.calculate(number, i) == 0)
					return false;
			}
			return true;
		}
	}

	static class EvenNumber {

		public List<Integer> filterEvenNumber(List<Integer> num) {
			Predicate<Integer> evenPredicate = (number) -> number % 2 == 0;
			List<Integer> evenList = num.stream().filter(evenPredicate).collect(Collectors.toList());

			return evenList;
		}

	}

}
