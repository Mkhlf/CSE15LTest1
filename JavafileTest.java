import static org.junit.Assert.*;
import org.junit.*;

/**
 * To run the file use:
 * 
 * javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar JavafileTest.java
 * 
 * java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore JavafileTest
 */
public class JavafileTest {
    @Test
    public void test1() {
        assertTrue(!Javafile.returnFalse());

    }

}
