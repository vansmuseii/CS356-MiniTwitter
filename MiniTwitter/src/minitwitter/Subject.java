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
