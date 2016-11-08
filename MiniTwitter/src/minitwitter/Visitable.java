package minitwitter;

/**
 *
 * @author Van Muse
 */
public interface Visitable {
    /**
     * This is supposed to accept a visitor.
     * @param visitor 
     */
    void accept(Visitor visitor);
}
