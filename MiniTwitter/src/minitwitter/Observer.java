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
