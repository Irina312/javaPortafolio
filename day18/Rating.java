package day18;

	public class Rating {
		// this time enum was created as a separate class MovieRating
		// And it's possible to use inside other classes
		// because it doesn't belong to the specific class
		
		public static void main(String[] args) {
			System.out.println(getRatingMsg(MovieRating.Excelent));
			
			MovieRating r = MovieRating.Average;
			System.out.println(getRatingMsg(r));
			
			System.out.println(getRatingMsg(MovieRating.Bad));
		}
		
		public static String getRatingMsg(MovieRating rating) {
			String msg;
			
			switch(rating) {
			case Excelent:
				msg = "You must see this movie!";
				break;
			case Average:
				msg = "This movie is OK, but not great.";
				break;
			case Bad:
				msg = "Skip it.";
				break;
			default:
				msg = "Something went wrong";
			}
			
			return msg;
		}
	}