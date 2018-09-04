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
package org.demo.ann;

import org.prostyperceptron.SingleNeuron;

/**
 * Program demonstracyjny na potrzeby implementacji perceptronu.
 * 
 * TODO logowanie JUL lub Log4J
 * @author Damian Duda <damian.duda@gmail.com>
 */
public class DemoANN {
    
    public static void main(String[] args){
        
        SingleNeuron neuron;
        
        // konstruktor ma zasięg pakietowy
        // musi być publiczny żeby był dosięgalny z innego pakietu
        neuron = new SingleNeuron();
        
        // weights
        // TODO fit the inputs number with weight inputs
        
        int[] inputWeights = new int[3];
        inputWeights[0] = -1;
        inputWeights[1] = 0;
        inputWeights[2] = 1;
        
        System.out.println("Perceptron:");
        System.out.println("numInputs: " + neuron.getNumInputs() );
        System.out.println("stimulate: " + neuron.stimulate(inputWeights));
        
         // Create input layer        
        SingleNeuron inputPerceptron = new SingleNeuron(2);
        
        System.out.println("Input Perceptron");
        System.out.println("Inputs: " + inputPerceptron.getNumInputs());
        for(int number: inputPerceptron.getInputWeights()){
            System.out.println("Weight: " + number);
        }
        
        // Create first layer
        int hiddenInputs[] = new int[5];
        SingleNeuron hiddenPerceptron = new SingleNeuron(5, hiddenInputs);
        System.out.println("Hidden Perceptron");
        System.out.println("Inputs: " + hiddenPerceptron.getNumInputs());
        for (int i=0; i<hiddenPerceptron.getNumInputs(); i++){
            System.out.println("weight[" + i + "]= " 
                    + hiddenPerceptron.getInputWeights()[i]);
        }
        
    }
    
}