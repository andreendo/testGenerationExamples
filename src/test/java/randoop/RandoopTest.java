package randoop;

import org.junit.Test;
import static org.junit.Assert.*;
import randoop.main.Main;

/**
 *
 * @author andreendo
 */
public class RandoopTest {
    
    @Test
    public void test() {
        //String CLASS_UNDER_TEST = "com.github.andreendo.testgenerationexamples.ex3.Pessoa";
        String CLASS_UNDER_TEST = "com.github.andreendo.testgenerationexamples.ex2.Calculadora";
        
        String[] args = {"gentests", "--testclass=" + CLASS_UNDER_TEST, "--time-limit=20"};
        Main.main(args);
        //files RegressionTest*.java were generated in the project root folder
    }
}
