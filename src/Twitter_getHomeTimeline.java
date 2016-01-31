import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;


public class Twitter_getHomeTimeline {

	public static void main(String[] args) throws TwitterException, FileNotFoundException, UnsupportedEncodingException {
		// TODO Auto-generated method stub

		String timelineWhole = new String();
		
		 Twitter twitter = TwitterFactory.getSingleton();
		    List<Status> statuses = twitter.getHomeTimeline();
		    System.out.println("Showing home timeline.");
		    for (Status status : statuses) {
		        System.out.println(status.getUser().getName() + ":" +
		                           status.getText());
		    
		    timelineWhole += status.getText() + "\n";
		    }
		    
		    FileWriter fw = new FileWriter();
		    fw.writeToFile(timelineWhole);
		
	}

}
