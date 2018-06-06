package evosuite;

import org.evosuite.EvoSuite;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andreendo
 */
public class EvosuiteTest {
    
    @Test
    public void test() {
        String CLASS_UNDER_TEST = "com.github.andreendo.testgenerationexamples.ex1.Utilitario";
        
        //String[] args = {"-class" , CLASS_UNDER_TEST, "-generateSuite", , "-Dstopping_condition=MaxTime"};
        
        String[] args = {"-target", "./target/classes/", "-class", "com.github.andreendo.testgenerationexamples.ex1.Utilitario", "-Dsearch_budget=20"};
        EvoSuite.main(args); 
    }
}
