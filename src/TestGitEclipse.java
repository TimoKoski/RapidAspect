import java.util.List;
import twitter4j.*;


public class TestGitEclipse {

	public static void main(String[] args) throws TwitterException {
		
		 Twitter twitter = TwitterFactory.getSingleton();
		    List<Status> statuses = twitter.getHomeTimeline();
		    System.out.println("Showing home timeline.");
		    for (Status status : statuses) {
		        System.out.println(status.getUser().getName() + ":" +
		                           status.getText());
		    }
	}
}
