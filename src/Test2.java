import twitter4j.*;

public class Test2 {
	public static void main(String[] args) {
		
		String latestStatus = "second tweet!";
		
		Twitter twitter = TwitterFactory.getSingleton();
	    Status status;
		try {
			status = twitter.updateStatus(latestStatus);
			
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//status = twitter.showStatus(1);
		}
	    //System.out.println("Successfully updated the status to [" + status.getText() + "].");
		
	}
	
}
