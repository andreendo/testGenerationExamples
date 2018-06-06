package com.github.andreendo.testgenerationexamples.ex2;

import org.chocosolver.solver.Model;
import org.chocosolver.solver.variables.IntVar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andreendo
 */
public class AleatorioExecucaoSimbolicaTest {
    
    
    @Test
    public void test01() {
        Model model = new Model("my first problem");
        IntVar inicio = model.intVar("INICIO", -1000, 1000); 
        IntVar fim = model.intVar("FIM", -1000, 1000);   
        model.arithm(inicio, ">=", 0).post();
        model.arithm(fim, "<" , 0).post(); 

        model.getSolver().solve();

        System.out.println(inicio); 
        System.out.println(fim); 
    }
    
    @Test
    public void test02() {
        Model model = new Model("my first problem");
        IntVar inicio = model.intVar("INICIO", -1000, 1000); 
        IntVar fim = model.intVar("FIM", -1000, 1000);   

        model.arithm(inicio, "<", 0).post();
        model.getSolver().solve();
        System.out.println(inicio); 
    }    
    
    @Test
    public void test03() {
        Model model = new Model("my first problem");
        IntVar inicio = model.intVar("INICIO", -1000, 1000); 
        IntVar fim = model.intVar("FIM", -1000, 1000);   
        model.arithm(inicio, ">=", 0).post();
        model.arithm(fim, ">=" , 0).post(); 
        model.arithm(inicio, ">=" , fim).post(); 

        model.getSolver().solve();

        System.out.println(inicio); 
        System.out.println(fim); 
    }    
    
    @Test
    public void test04() {
        Model model = new Model("my first problem");
        IntVar inicio = model.intVar("INICIO", -1000, 1000); 
        IntVar fim = model.intVar("FIM", -1000, 1000);   
        model.arithm(inicio, ">=", 0).post();
        model.arithm(fim, ">=" , 0).post(); 
        model.arithm(inicio, "<" , fim).post(); 

        model.getSolver().solve();

        System.out.println(inicio); 
        System.out.println(fim); 
    }        
}
