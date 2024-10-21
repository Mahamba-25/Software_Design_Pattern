package Visitor;

/**
 * File interface representing a general file.
 * Classes implementing this interface can accept a Visitor.
 */
public interface File {
    void accept(Visitor visitor);
}
