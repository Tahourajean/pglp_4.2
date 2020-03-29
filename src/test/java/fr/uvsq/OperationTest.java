/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;


/**
 *
 * @author USER
 */
public class OperationTest {
    
    public OperationTest() {
    }
    
   @Test
    public void test() {

        /// Test junit sur l'addition;
        Operation op1 = Operation.PLUS;

        double somme = op1.eval(5, 5);
        assertEquals(10, somme, somme);
        //assertEquals(10, somme);

        /// Test junit sur la soustraction;
        Operation op2 = Operation.MOINS;

        double difference = op2.eval(5, 5);

        assertEquals(0, difference, difference);
        
        
        
       

/// Test junit sur la multiplication;
        Operation op3 = Operation.MULT;

        double produit = op3.eval(5, 5);

        assertEquals(25, produit, produit);

/// Test junit sur la division;
        Operation op4 = Operation.DIV;

        double quotient = op4.eval(5, 5);

        assertEquals(1, quotient, quotient);

        // fail("Not yet implemented");
    }
    
}
