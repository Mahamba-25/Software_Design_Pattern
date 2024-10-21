package Visitor;

/**
 * Visitor interface for visiting different types of files.
 */
public interface Visitor {
    void visit(TextFile textFile);
    void visit(ExecutableFile executableFile);
}
