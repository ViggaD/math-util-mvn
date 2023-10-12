/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.giaolang.mathutilcore.test;

import com.giaolang.math.util.mvn.MathUtilMvn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dell
 */
public class MathUtilityTest {
    
    //Test case 1 - verify gerFactorial (width n = 0)
    //Steps/produre
                  //1. given n = 0
                  //2 Call/invoke getFactorial(n = 0)
    //Expected Result
    //            the method must return 1 as the result of 0! = 1
    //Runtime 
    
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk(){
        assertEquals(1, MathUtilMvn.getFactorial(0));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk(){
        assertEquals(1, MathUtilMvn.getFactorial(1));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument5ReturnsOk(){
        assertEquals(120, MathUtilMvn.getFactorial(5));
    }
}
