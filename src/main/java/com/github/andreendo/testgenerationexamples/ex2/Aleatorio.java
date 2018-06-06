package com.github.andreendo.testgenerationexamples.ex2;

import java.util.Random;

/**
 *
 * @author andreendo
 */
public class Aleatorio {

    public int gerarNumeroAleatorio(int inicio, int fim) {
        if (/*1*/ inicio < 0 || /*2*/ fim < 0) {
            return -1; /*3*/
        }

        if (inicio >= fim) { /*4*/
            return -1; /*5*/
        }
        int diff = fim - inicio + 1;        /*6*/
        Random random = new Random();       /*6*/
        int tInt = random.nextInt(diff);    /*6*/
        return inicio + tInt;               /*6*/
    }
}
