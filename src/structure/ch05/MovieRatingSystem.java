package structure.ch05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieRatingSystem {

	public static void main(String[] args) {
		// Movie Object 계속 추가하는 자료구조
		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("쿵푸팬더4", 5));
		movies.add(new Movie("갓필드", 4));
		movies.add(new Movie("코코", 3));
		movies.add(new Movie("주토피아", 5));

		System.out.println(movies);
		for (Movie movie : movies) {
			System.out.println(movie.getTitle());
		}

		for (int i = 0; i < movies.size(); i++) {
			// 배열이 아님 --> get() 메서드 사용
			System.out.println(movies.get(i).getTitle());
		}

		// 어떤 데이터를 정렬하려면 정렬 알고리즘을 구현해서 기능을 만들어주면 된다.
		// 버블 정렬, 퀵..... 등 굉장히 많은 알고리즘이 있다.

		Collections.sort(movies, new Comparator<Movie>() {
			@Override
			public int compare(Movie m1, Movie m2) {
				return Integer.compare(m2.getRating(), m1.getRating());
			}
		});

		// 평점순으로 정렬된 영화 목록 출력
		for (Movie movie : movies) {
			System.out.println(movie);
		}

	} // end of main

} // end of class

class Movie {

	private String title;
	private int rating;

	public Movie(String title, int rating) {
		this.title = title;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public int getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", rating=" + rating + "]";
	}

}