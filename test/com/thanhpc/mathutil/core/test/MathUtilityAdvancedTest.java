/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhpc.mathutil.core.test;

import com.thanhpc.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author ThanhPC
 */
@RunWith(value = Parameterized.class)
//bao voi Junit rang se~ code o trong class nay, tach data va ham so sanh rieng
//biet nhau - DATA DRIVEN TESTING
//
public class MathUtilityAdvancedTest {
    
    //Chuan bi mang 2 chieu de chua data trong cac test case
    //Se~ dung`
    //quy uoc mang phai la static public.
    
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Object[][] {
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120},
        };
    }
    
    //map tung cap data o tren vao` 2 bien va se~ day 2 bien nay vao`
    //ham` assertEquals()
    
    @Parameterized.Parameter(value = 0) // lay cot 0 cua mang gan vao`
    public int n;
    
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    //test
    @Test
    public void testFactorialGivenRightArgumentReturnWell() {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
