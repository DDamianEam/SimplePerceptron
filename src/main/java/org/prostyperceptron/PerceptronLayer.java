/*
 * Copyright (c) 2018, dudadam1
 * All rights reserved.
 *
 * Permission to use, copy, modify, and distribute this software for anyt
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

/**
 * Groups neutrons into a layer.
 * 
 * TODO Gather outputs and use it recursivelly as input to 
 * next layer.
 * @author Damian Duda <damian.duda@gmail.com>
 */
public class PerceptronLayer {
    
   // How many neurons in layer?
    private int numNeurons;
   // keep neurons in the table, initiate in constructor
    private SingleNeuron layer[];
      
    
   //TODO Layer
   // Perceptron perceptronLayer[];
   
    // Default constructor takes default neuron - input buffer
    // with one input and one output
    PerceptronLayer(){
       this.numNeurons = 1;
       layer[0] = new SingleNeuron();
   }
   
     // Construct the N-neuron input layer if weights are not specified
    PerceptronLayer(int N){
       this.numNeurons = N;
       
       for(int i=0; i< this.numNeurons; i++){
           layer[i] = new SingleNeuron();
       }
       
   }
   
   int getNumPerceptrons(){
       return numNeurons;
   }
}

