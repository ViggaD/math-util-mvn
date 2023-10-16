/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.giaolang.mathutilcore.test;

import com.giaolang.math.util.mvn.MathUtilMvn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Dell
 */
public class MathUtilityDDTTest {
    
    public static Object[][] initData(){
        Object[][] dataSet = {{0, 1}, 
                              {1, 1}, 
                              {2, 2}, 
                              {3, 6}, 
                              {5, 120}};
        return dataSet;
    }
    
    
    //hàm xài data từ nơi khác đưa đến, mảng data đưa vào
    @ParameterizedTest
    @MethodSource(value = "initData")
    public void verifyFactorialGivenRightArgumentReturnOk(int n, long excepted){
        assertEquals(excepted, MathUtilMvn.getFactorial(n));
    }
}
