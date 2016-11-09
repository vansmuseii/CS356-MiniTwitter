/**
 *      File: Observer.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 2
 *      Date Last Modified: 11/09/2016
 *
 *      Purpose: This is an observer class which sets the updates
 *
 */

package minitwitter;

/**
 *
 * @author Van Muse
 */
public interface Observer {
    /**
     * This is for getting all the updates from the twitter feeds
     * @param sub 
     */
    public void update(Subject sub);
    public void setSub(Subject sub);
}
