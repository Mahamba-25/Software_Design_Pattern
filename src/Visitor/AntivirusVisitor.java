package Visitor;

/**
 * Concrete visitor class for performing antivirus scans on files.
 */
public class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Scanning text file: " + textFile.getContent());
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Scanning executable file: " + executableFile.getName());
    }
}
