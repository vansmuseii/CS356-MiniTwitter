/**
 *      File: User.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 2
 *      Date Last Modified: 11/09/2016
 *
 *      Purpose: This handles all the necessary elements for the
 *      user.
 *
 */

package minitwitter;

import javax.swing.DefaultListModel;

/**
 *
 * @author Van Muse
 */
public class User implements Observer, Subject {

    /**
     * These variables are for name, the tweet
     * a list for followers, following, and news feed.
     */
    private String name;
    private String tweet;
    private DefaultListModel<Observer> followers;
    private DefaultListModel<String> following;
    private DefaultListModel<String> newsFeed;
    private DefaultListModel<String> uniqueMessage;

    /**
     * This is the constructor that was responsible for taking in the user name,
     * and setting its news feed, who they're following and its followers
     *
     * @param name
     */
    public User(String name) {
        this.name = name;
        this.newsFeed = new DefaultListModel<>();
        this.following = new DefaultListModel<>();
        this.followers = new DefaultListModel<>();
        this.uniqueMessage = new DefaultListModel();
    }

    /**
     * Prints tweet and notifies the observers.
     *
     * @param tweet
     */
    public void tweet(String tweet) {
        this.tweet = tweet;
        newsFeed.addElement("- Me: " + tweet);
        uniqueMessage.addElement(tweet);
        notifyObs();
    }

    /**
     * Returns the user name
     *
     * @return
     */
    public String getUserName() {
        return name;
    }

    /**
     * returns the new feed
     *
     * @return
     */
    public DefaultListModel<String> getNewsFeedListModel() {
        return this.newsFeed;
    }

    /**
     * returns the followers
     *
     * @return
     */
    public DefaultListModel<String> getFollowingListModel() {
        return this.following;
    }
    
    public DefaultListModel<String> getUniqueMessages(){
        return this.uniqueMessage;
    }

    /**
     * Follows a person and attaches them
     *
     * @param user
     */
    public void follow(User user) {
        setSub(user);
        user.attach(this);
    }
        
    /**
     * This is for setting the name for the object
     *
     * @return
     */
    public String toString() {
        return name;
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
}
