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


//3 TESST CASE TREEN KO ĐẸP, BỐC MÙI, BAD SMELLS VÌ CHỈ KHÁC NHAU PHẦN DATA
//TRONG NGHỀ KIỂM THỬ CÓ 1 KĨ THUẬT ĐÓ LÀ TÁCH HẲN DATA KIỂM THỬ RA
//1 CHỖ, CHO DỄ NHÌN, DỄ QUẢN LÍ ĐC DATA THIẾU ĐỦ HAY KO 

//SAU ĐÓ TA ĐƯA BỘ DATA NÀY VÀO TRONG CÂU LỆNH SO SÁNH ASSERT()
//QUA CÁC THAM SỐ (PARAMETER)
//TỨC LÀ ASERTEQUALS (EXPECTED, ACTUAL) là 2 THAM SỐ
//ỨNG VƠI SBOOJ DÂT ĐC TÁCH RA



//Code nhìn đẹp nhìn gọn đc thiếu đủ test data, test case
//kĩ thuật tách data kiểm thử ra khỏi câu lệnh so sánh -> được gọi 
// là DDT - DATA-DRIVEN TESTING - KIỂM THỬ THEO HƯỚNG TÁCH DATA RIÊNG LẺ

