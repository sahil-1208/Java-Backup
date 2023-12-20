package movieDataStream;

import java.util.stream.Stream;

import movieDataStream.enums.Genre;
import movieDataStream.enums.Language;

public class DataSource {
	public Stream<Movie> getMoviesStream() {
		Cast cast1 = new Cast("SRK", "Priyanka", "kj");
		Cast cast2 = new Cast("Diljit", "Nimrat", "Ambardeep");
		Cast cast3 = new Cast("SRK", "Katrina", "Yash chopra");
		Cast cast4 = new Cast("Ammy virk", "Sonam Bajwa", "Jagdeep sidhu");
		Cast cast5 = new Cast("Elvish Yadav", "Alia Bhatt", "Bigboss");
		Cast cast6 = new Cast("Salman Khan", "Bhoomika", "Satish Kaushik");
		Cast cast7 = new Cast("Yuvraj Pawar", "Eva Elfia", " Prabhjeet singh");
		Cast cast8 = new Cast("SIDHU MOOSEWALA", "Neha Sharma", "kuchbhi");
		Cast cast9 = new Cast("Sanjay dutt", "Namrata", "Mahesh Dalle");
		Cast cast10 = new Cast("SHAH RUKH KHAN", "AShwariya RAi", "Aditya Chopra");
		Cast cast11 = new Cast("RAO SAHAB", "Ashika", "Abhishek");

		return Stream.of(new Movie(101, "JMD", Language.HINDI, Genre.MYSTERY, 67.43, cast1),
				new Movie(102, "Jodi", Language.HINDI, Genre.FANTASY, 99.43, cast2),
				new Movie(103, "JTHJ", Language.HINDI, Genre.MYSTERY, 45.43, cast3),
				new Movie(104, "Maurh", Language.ENGLISH, Genre.HORROR, 53.43, cast4),
				new Movie(105, "SYSTTUUUMMMMM", Language.HINDI, Genre.ADULT, 26.43, cast5),
				new Movie(106, "TERE NAAM", Language.HINDI, Genre.COMEDY, 46.43, cast6),
				new Movie(107, "FAKE TAXI", Language.ENGLISH, Genre.FANTASY, 64.43, cast7),
				new Movie(108, "LAWRENCE", Language.HINDI, Genre.MYSTERY, 23.43, cast8),
				new Movie(109, "VAASTAV", Language.HINDI, Genre.ACTION, 78.43, cast9),
				new Movie(110, "MOHABBATIEN", Language.HINDI, Genre.ADULT, 45.43, cast10),
				new Movie(111, "BIGG BOSS", Language.HINDI, Genre.COMEDY, 34.43, cast11));

	}

}
