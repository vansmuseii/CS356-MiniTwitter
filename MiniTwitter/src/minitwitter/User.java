package minitwitter;

import javax.swing.DefaultListModel;

/**
 *
 * @author Van Muse
 */
public class User implements Observer, Subject {

    private String name;
    private String tweet;
    private DefaultListModel<Observer> followers;
    private DefaultListModel<String> following;
    private DefaultListModel<String> newsFeed;

    public User(String name) {
        this.name = name;
        this.newsFeed = new DefaultListModel<>();
        this.following = new DefaultListModel<>();
        this.followers = new DefaultListModel<>();
    }

    public void tweet(String tweet) {
        this.tweet = tweet;
        newsFeed.addElement("- " + name + " | " + tweet);
        notifyObs();
    }

    public String getUserName() {
        return name;
    }

    public DefaultListModel<String> getNewsFeedListModel() {
        return this.newsFeed;
    }

    public DefaultListModel<String> getFollowingListModel() {
        return this.following;
    }
    public void follow(User user){
		setSub(user);
		user.attach(this);
	}

    public Object[] getFollowers() {
        return this.followers.toArray();
    }

    public Object[] getMessages() {
        return this.newsFeed.toArray();
    }

    @Override
    public void update(Subject sub) {
        this.newsFeed.addElement("- " + sub.toString() + ": " + sub.getUpdate(this));
    }

    @Override
    public void setSub(Subject sub) {
        following.addElement(sub.toString());
    }

    @Override
    public void notifyObs() {
        for (Object user : followers.toArray()) {
            ((Observer) user).update(this);
        }
    }

    @Override
    public void attach(Observer obs) {
        followers.addElement(obs);
    }

    @Override
    public void detach(Observer obs) {
        followers.removeElement(obs);
    }

    @Override
    public String getUpdate(Observer obs) {
        return this.tweet;
    }
    
    public String toString(){
        return name;
    }
}
