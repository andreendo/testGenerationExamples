package com.github.andreendo.testgenerationexamples.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

/**
 *
 * @author andreendo
 */

@RunWith(Parameterized.class)
public class UtilitarioRandomTest {
    
    @Parameters
    public static Collection<Object[]> data() {
        ArrayList<Object[]> ret = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int len = 1 + random.nextInt(1000); //1 to 1000
            int v[] = new int[len];
            for (int j = 0; j < len; j++) {
                v[j] = random.nextInt();
            }
            ret.add(new Object[] { v });
        }        
        
        return ret;
    }

    @Parameter // first data value (0) is default
    public int[] v;
    
    @Test
    public void test() throws Exception {
        Utilitario u = new Utilitario();
        Extremos e = u.acharExtremos(v);
        System.out.println("test with v with " + v.length + " elements; output: " + e);
        
        //invariantes
        //nao eh o oraculo mais preciso, mas sao verificacoes validas
        assertTrue(e.getMenor() <= e.getMaior());
        assertTrue(e.getIndiceMaior() >= 0 && e.getIndiceMaior() <= v.length);
        assertTrue(e.getIndiceMenor() >= 0 && e.getIndiceMenor() <= v.length);
    }
}
