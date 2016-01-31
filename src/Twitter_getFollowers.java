import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Single;

import twitter4j.*;

public class Twitter_getFollowers {

public static void main(String[] args){
	Twitter twitter = TwitterFactory.getSingleton();
	String followerList = "";
	try{
		IDs ids = twitter.getFriendsIDs(-1);
		do
		{
			for(long id: ids.getIDs()){
				String name = twitter.showUser(id).getName();
				String screenName = twitter.showUser(id).getScreenName();
				followerList += name + " | " + screenName + "\n";
				}	
		}while (ids.hasNext());
	}catch (Exception e){
		e.printStackTrace();
	}
	System.out.println(followerList +"\n");
}
}
