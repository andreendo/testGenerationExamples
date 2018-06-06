package com.github.andreendo.testgenerationexamples.ex2;

/**
 *
 * @author andreendo
 */
public class Calculadora {

    /**
     * @param vetor
     * @param inicioInterv deve ser >= 0 e menor que fimInterv
     * @param fimInterv deve ser >= 0 e maior que inicioInterv
     * @return (i) media dos inteiros do vetor que estão no intervalo
     * [inicioInterv, fimInterv] (ii) -1 se os parametros forem invalidos
     */
    public float calcularMedia(int vetor[], int inicioInterv, int fimInterv) {
        if (inicioInterv < 0 || fimInterv < 0) {
            return -1;
        }

        if (inicioInterv >= fimInterv) {
            return -1;
        }

        float soma = 0, n = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= inicioInterv && vetor[i] <= fimInterv) {
                soma = soma + vetor[i];
                n++;
            }
        }
        return soma / n;
    }
}
