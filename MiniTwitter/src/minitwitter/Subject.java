/**
 *      File: Subject.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 2
 *      Date Last Modified: 11/09/2016
 *
 *      Purpose: This sets the user to be attached to the user
 *
 */

package minitwitter;

/**
 *
 * @author Van Muse
 */
public interface Subject {
    public void attach(Observer obs);
    public void detach (Observer obs);
    public void notifyObs();
    public String getUpdate(Observer obs);
}
