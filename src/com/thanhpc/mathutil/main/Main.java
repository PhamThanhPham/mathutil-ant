/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhpc.mathutil.main;

import com.thanhpc.mathutil.core.MathUtility;

/**
 *
 * @author ThanhPC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testFactorialGivenRightArgumentRunsWell();
        testFactorialGivenWrongArgumentThrowsException();
    }
    
    //dan dev phai co trach nhiem test code cua minh chay dung hay sai trc khi
    //lap rap no voi cac class khac de tao nen 1 chuc nang
    //Ghi chu:
    //Co nhieu quy tac dat ten ham cho viec kiem thu
    //Ten ham se bao ham y nghia cua viec kiem thu
    
    //Thiet ke ham getF..() la chi tinh n! tu 0 ... 20
    //n < 0 || n > 20 ham` se~ ko tinh bang cach nem ra NGOAI LE!!!
    public static void testFactorialGivenWrongArgumentThrowsException() {
        //Test case #4: Test getF() with n = -5, wrong argument
        //Expected value : an execption is thrown
        //IllegalArgumentExeption
        
        System.out.println("Test -5 !:  expected = Illegal Argument Exception is thrown");
        MathUtility.getFactorial(5);
    }
    
    public static void testFactorialGivenRightArgumentRunsWell() {
        
        //Test Case #1: Test getFactorial with n = 0
        //Expected value: 1 - hy vong dua n  = 0 vao thi ham se tra 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        
        System.out.println("Test " + n + "!: expected = " + expectedValue
                                            + " | actual: " + actualValue);
        
        //Test case #2: Test getFactorial with n = 1
        //Expected value = 1 
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "!: expected = " + expectedValue
                                            + " | actual: " + actualValue);
        
        //Test case #3: Test getFactorial
        System.out.println("Test " + 3 + "!: expected = 6" 
                                + " | actual: " + MathUtility.getFactorial(3));
        
        
    }
}
