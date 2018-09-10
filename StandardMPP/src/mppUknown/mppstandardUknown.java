package mppUknown;

import java.math.BigInteger;
	import java.util.Arrays;
	import java.util.List;
	import java.util.Optional;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;
	
	
public class mppstandardUknown {

		public static Optional<Integer> maximumVal(List<Integer> first, List<Integer> second) {
			Optional<Integer> max = first.stream().flatMap(f -> second.stream().map(s -> Math.max(f, s)))
					.reduce((x, y) -> (x > y) ? x : y);
			return max;
		}

		public static Optional<Integer> maximumconcat(Integer[] first, List<Integer> second) {
		
			//to display both as list
			System.out.println("Henok belive me" + Stream.of(Stream.of(first), second.stream()).flatMap(x -> x)
					.map(String::valueOf).reduce((x,y)-> ""+x + y).get());
			
			return Stream.of(Stream.of(first), second.stream()).flatMap(x -> x).reduce((x, y) -> x > y ? x : y);
		}

		public static Integer[] concatMax(Integer[] first, List<Integer> second) {
			return (Integer[]) Stream.concat(Stream.of(first), second.stream()).toArray(Integer[]::new);
		}

		public static void main(String[] args) {
			
			System.out.println("Haben Intiger  "+Stream.iterate(BigInteger.ZERO, n->n.add(BigInteger.ONE).add(BigInteger.ONE)).limit(5).collect(Collectors.toList()));
			Integer[] myintOne = { 1, 2, 3, 4, 5, 6 };
			List<Integer> first = Arrays.asList(1, 2, 3, 4, 5);
			maximumconcat(myintOne,first);
			
			Long counts = Stream.of(myintOne).collect(Collectors.counting());
			System.out.println("Counting collectors " + counts);
			
			Integer[] myint = Stream.of(myintOne).flatMap(x -> Stream.of(x)).toArray(Integer[]::new);
			System.out.println(Arrays.toString(myint));

			List<Integer> mylist = first.stream().flatMap(x -> Stream.of(x)).collect(Collectors.toList());
			System.out.println(mylist);

			List<Integer> a = Stream.of(1, 5, 3, 0).collect(Collectors.toList());
			List<Integer> b = Stream.of(5, 7, 3, 5, 1).collect(Collectors.toList());
			System.out.println(maximumVal(a, b).get());

			System.out.println(Arrays.toString(concatMax(myintOne, b)));
		}

	}

