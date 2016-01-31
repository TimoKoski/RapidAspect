import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;


public class Twitter_updateStatus {

	public static void main(String[] args) {

		String latestStatus = "Tweet! #amazing";
		
		Twitter twitter = TwitterFactory.getSingleton();
	    Status status;
		try {
			status = twitter.updateStatus(latestStatus);
			
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //System.out.println("Successfully updated the status to [" + status.getText() + "].");
		
	}

}
