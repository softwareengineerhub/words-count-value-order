/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.words.count.value.order;

/**
 *
 * @author Denys.Prokopiuk
 */
public class Main {
    
    
    /*
    a==5
    b=3
    c=2
    */
    public static void main(String[] args) {
        WordProcessor wordProcessor = new WordProcessorImpl();
        wordProcessor.process("a b a b a b c a c a");
        Branch1 b1 = new Branch1();
        Branch2 b2 = new Branch2();
    }
    
}
