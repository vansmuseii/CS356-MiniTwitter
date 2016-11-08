package minitwitter;

/**
 *
 * @author Van Muse
 */
public interface Subject {
    /**
     * This is responsible for controlling an observer when followed
     * and also get updates.
     * @param obs 
     */
    public void attach(Observer obs);
    public void detach (Observer obs);
    public void notifyObs();
    public String getUpdate(Observer obs);
}
