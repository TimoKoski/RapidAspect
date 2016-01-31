import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;


public class Twitter_getHomeTimeline {

	public static void main(String[] args) throws TwitterException {
		// TODO Auto-generated method stub

		 Twitter twitter = TwitterFactory.getSingleton();
		    List<Status> statuses = twitter.getHomeTimeline();
		    System.out.println("Showing home timeline.");
		    for (Status status : statuses) {
		        System.out.println(status.getUser().getName() + ":" +
		                           status.getText());
		    }
		
	}

}
