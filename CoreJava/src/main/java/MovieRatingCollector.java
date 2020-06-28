import java.util.*;

class MovieInfo{
	String movieName;
	double rating;
	int count;
	double average;
}

public class MovieRatingCollector {
    public static class RatingCollectorImpl implements RatingCollector {
    	Map<String,MovieInfo> map = new HashMap<String, MovieInfo>();
    	MovieInfo info = null;
        @Override
        public void putNewRating(String movie, double rating) {
            info = new MovieInfo();
            info.movieName = movie;
            info.rating = rating;
            info.count = 1;
            if(map.containsKey(movie)) {
            	info = map.get(info.movieName);
            	info.count = ++info.count;
            	double sum = info.rating+rating;
            	info.rating = sum;
            } else {
            	map.put(movie, info);
            }
        }

        @Override
        public double getAverageRating(String movie) {
            info = map.get(movie);
            double avg = info.rating/info.count;
        	return avg;
        }

        @Override
        public int getRatingCount(String movie) {
        	info = map.get(movie);
            int count = info.count;
        	return count;
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface RatingCollector {
        // This is an input. Make note of this rating.  Rating can be a double number between 0 and 100.
        void putNewRating(String movie, double rating);

        // Get the average rating
        double getAverageRating(String movie);

        // Get the total number of ratings received for the movie
        int getRatingCount(String movie);
    }

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int numLines = 1;
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final RatingCollector stats = new RatingCollectorImpl();
            final Set<String> movies = new TreeSet<>();

            String line = "I_am_legend 22.22,A_Beutiful_Mind 33.33,I_am_legend 44.44,A_Beutiful_Mind 55.55,I_am_legend 66.66";
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String symbol = tokens[0];
                movies.add(symbol);
                final double price = Double.parseDouble(tokens[1]);

                stats.putNewRating(symbol, price);

            }

            for (String movie : movies) {
                System.out.println(
                        String.format("%s %.4f %d", movie, stats.getAverageRating(movie), stats.getRatingCount(movie)));
            }

        }
        scanner.close();

    }
}