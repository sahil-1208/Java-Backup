package dataSource;

import java.util.stream.Stream;

import enums.Genre;
import enums.Language;
import model.Cast;
import model.Movie;

public class DataSource {

	public Stream<Movie> getMoviesStream() {
		Cast oppenheimer = new Cast("Cillian Murphy", "Emily Blunt", "Christopher Nolan");
		Cast jogi = new Cast("Diljit Dosanjh", "Amyra Dastur", "Ali Abbas Zafar");
		Cast qismat = new Cast("Ammy Virk", "Sargun Mehta", "Jagdeep Sidhu");
		Cast fiftyShadesOfGrey = new Cast("Jamie Dornan", "Dakota Johnson", "Sam Taylor-Johnson");
		Cast chobbar = new Cast("Jayy Randhawa", "Drishty Talwar", " Maneesh Bhatt");
		Cast murderMystery = new Cast("Adam Sandler", "Jennifer Aniston", "Kyle Newacheck");
		Cast annabelle = new Cast("Ward Horton", "Annabelle Wallis", "John R.Leonetti");
		Cast spiderMan = new Cast("Shameik Moore", "Hailee Steinfeld", "Joaquim Dos Santos");
		Cast munnaBhai = new Cast("Sanjay Dutt", "Gracy Singh", "Rajkumar Hirani");
		Cast gangsOfWasseypur = new Cast("Manoj Bajpayee", "Richa Chadha", "Anurag Kashyap");
		Cast lahoriye = new Cast("Amrinder Gill", "Sargun Mehta", "Amberdeep Singh");
		Cast avatar = new Cast("Sam Worthington", "Zoe Saldana", "James Cameron");
		Cast conjuring = new Cast("Patrick Wilson", "Vera Farmiga", "James Wan");
		Cast inferno = new Cast("Tom Hanks", "Felicity Jones", "Ron Howard");
		Cast deepWater = new Cast("Ben Affleck", "Ana de Armas", "Adrian Lyne");
		Cast ambarsariya = new Cast("Diljit Dosanjh", "Monica Gill", "Mandeep Kumar");
		Cast uri = new Cast("Vicky Kaushal", "Yami Gautam", "Aditya Dhar");
		Cast extraction = new Cast("Chris Hemsworth", "Golshifteh Farahani", "Sam Hargrave");
		Cast pirates = new Cast("Johnny Depp", "Kaya Scodelario", "Joachim Rønning");
		Cast shershaah = new Cast("Sidharth Malhotra", "Kiara Advani", "Vishnuvardhan");

		return Stream.of(
				new Movie(101, "Oppenheimer", 3.10, Genre.ACTION, Language.ENGLISH, oppenheimer,"https://youtu.be/7KD8JwDmMFA"),
				new Movie(102, "Jogi", 1.56, Genre.THRILLER, Language.HINDI, jogi, "https://youtu.be/X3VgZVsvt-U"),
				new Movie(103, "Qismat", 2.17, Genre.DRAMAS, Language.PUNJABI, qismat, "https://youtu.be/xgQcYRakbms"),
				new Movie(104, "Fifty Shades of Grey", 2.05, Genre.ADULT, Language.ENGLISH, fiftyShadesOfGrey,"https://youtu.be/SfZWFDs0LxA"),
				new Movie(105, "Chobbar", 2.05, Genre.ACTION, Language.PUNJABI, chobbar,"https://youtu.be/jKXSv_KibMw"),
				new Movie(106, "Murder Mystery", 1.37, Genre.MYSTERY, Language.ENGLISH, murderMystery,"https://youtu.be/LM2F56uK0fs"),
				new Movie(107, "Annabelle", 1.39, Genre.HORROR, Language.ENGLISH, annabelle,"https://youtu.be/KisPhy7T__Q"),
				new Movie(108, "Spider-Man: Across the Spider-Verse", 2.20, Genre.FANTASY, Language.ENGLISH, spiderMan,"https://youtu.be/cqGjhVJWtEg"),
				new Movie(109, "Munna Bhai M.B.B.S.", 2.36, Genre.COMEDY, Language.HINDI, munnaBhai,"https://youtu.be/6lCGvu-hwX4"),
				new Movie(110, "Gangs of Wasseypur", 5.21, Genre.THRILLER, Language.HINDI, gangsOfWasseypur,"https://youtu.be/9ZpPQdrHfl8"),
				new Movie(111, "Lahoriye", 2.17, Genre.DRAMAS, Language.PUNJABI, lahoriye,"https://youtu.be/0owS3euUNtk"),
				new Movie(112, "Avatar: The Way of Water", 3.12, Genre.FANTASY, Language.ENGLISH, avatar,"https://youtu.be/d9MyW72ELq0"),
				new Movie(113, "The Conjuring", 1.52, Genre.HORROR, Language.ENGLISH, conjuring,"https://youtu.be/ejMMn0t58Lc"),
				new Movie(114, "Inferno", 2.01, Genre.MYSTERY, Language.ENGLISH, inferno,"https://youtu.be/RH2BD49sEZI"),
				new Movie(115, "Deep Water", 1.55, Genre.ADULT, Language.ENGLISH, deepWater,"https://youtu.be/qWNxIZQ594s"),
				new Movie(116, "Ambarsariya", 2.02, Genre.COMEDY, Language.PUNJABI, ambarsariya,"https://youtu.be/WNwIMS-v1KI"),
				new Movie(117, "Uri: The Surgical Strike", 2.18, Genre.ACTION, Language.HINDI, uri,"https://youtu.be/6SSbCbudN3o"),
				new Movie(118, "Extraction", 1.56, Genre.THRILLER, Language.ENGLISH, extraction,"https://youtu.be/L6P3nI6VnlY"),
				new Movie(119, "Pirates of the Caribbean", 2.08, Genre.FANTASY, Language.ENGLISH, pirates,"https://youtu.be/Hgeu5rhoxxY"),
				new Movie(120, "Shershaah", 2.15, Genre.ACTION, Language.HINDI, shershaah,"https://youtu.be/Q0FTXnefVBA"));
	}

}
