package minitwitter;

/**
 *
 * @author Van Muse
 */
public interface Observer {
    public void update(Subject sub);
    public void setSub(Subject sub);
}
