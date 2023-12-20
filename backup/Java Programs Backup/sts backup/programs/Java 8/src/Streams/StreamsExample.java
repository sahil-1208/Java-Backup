package Streams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {

		Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Stream<String> stringStream = Stream.of("yuvraj", "prabhjeet", "Ali", "Sahil");
		Stream<Video> videoStream = Stream.of(new Video(), new Video());
//		Predicate<Integer> predicate = (Integer data) -> {
//			return data % 2 == 0;
		
		//Stream<Integer> evenIntStream = intStream.filter(predicate);
		Stream<Integer> evenIntStream = intStream.filter((Integer data) -> {return data % 2 == 0;});
		Consumer<Integer> consumer = (Integer data) -> System.out.println(data);
		evenIntStream.forEach(consumer);
		Function<String, Integer> function = (String input) -> {
			return input.length();
		};
		Stream<Integer> lengthStream = stringStream.map(function);
		lengthStream.forEach(data -> System.out.println(data));

	}
}

class Video {
	private String name;
	private byte[] byteArray;

	// getter setter
}