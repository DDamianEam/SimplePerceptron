/*
 * Copyright (c) 2018, Damian Duda <damian.duda@gmail.com>
 *
 * Permission to use, copy, modify, and distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
package org.prostyperceptron;

import static java.lang.Integer.signum;


/**
 * Model matematyczny perceptronu na podstawie książki Białynickich-Birula.
 * 
 * TODO Unit tests
 * 
 * Pojedynczy perceptron wykorzystuje funkcję aktywacji do ustalenia własnego 
 * stanu.
 * Wejściem jest wektor liczb
 * Funkcja progowa jest znormalizowana do 1.
 * 
 * Dla zadanego wektora wejściowego liczb neuron powinien zwracać wartość
 * funkcji aktywacji.
 * 
 * Rozmiar wektora wejściowego powinien odpowiadać liczbie wejść neuronu
 * 
 * @author dudadam1
 */
public class Perceptron {
    
    private int numInputs;
    private int inputWeights[];

    // konstruktor ma zasięg pakietowy
    // musi być publiczny żeby był dosięgalny z innego pakietu
    // TODO funkcję aktywacji wstrzykiwać przez konstruktor można
    public Perceptron(){ 
        numInputs = 1;
        inputWeights = new int[1];
        // Default is to be input buffer/layer
        inputWeights[0] = 1;
    }
    
    Perceptron(int numInputs){ 
        this.numInputs = numInputs;
        this.inputWeights = new int[numInputs];
        // Default is to be input buffer/layer
        for (int i=0; i<this.numInputs; i++)
            this.inputWeights[i] = 1;
        
    }
    
    // Perceptron constructor with defined weights
    Perceptron(int numInputs, int[] inputWeights){
        this.numInputs = numInputs;
        // yes, we can do this, this is not C!
        // we do not loose reference outside of scope
        this.inputWeights = inputWeights;
        
    }
    public int getNumInputs() {
        return numInputs;
    }

    public int stimulate(int[] inputData ){
        
        // call activation function
        // move to new class
        
        int result = 0;
        
        for (int i=0; i < numInputs; i++){
           result += inputWeights[i] * inputData[i];
            System.out.println("input weight " + i + ": " + inputWeights[i]);
            System.out.println("input data " + i + ": " + inputData[i]);
        }
        
        /*
         * public static int signum(int i) 
         * Returns the signum function of the specified int value.
         * (The return value is -1 if the specified value is negative;
         * 0 if the specified value is zero;
         * and 1 if the specified value is positive.)
         */
        result = signum(result);
        
        // TODO Derivative function
        
        
        return result;
    }
    
    
}

