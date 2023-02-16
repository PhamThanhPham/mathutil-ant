/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhpc.mathutil.core.test;


import com.thanhpc.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author ThanhPC
 */
public class MathUtilityTest {
    
    //Kiểm thử ngoại lệ thì sao
    //hàm getF() đc thiết kế nếu đưa n sai
    //thì hàm phải ném ra ngoại lệ
    
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        //Test case 5: getF() with a wrong arg: n = -5
        //Expected result: An execption is thrown
        
        MathUtility.getFactorial(30);
        //neu chi go lenh tren thi bi mau do
        //Do lenh nay gay ra Exception
        //Nhung ham nay` ky vong ra exception
        //Suy ra ham dung nhu thiet ke, dung thi phai mau xanh
        //JUniit 4 thi ko dung` ham assert de do ngoai le, Junit 5 thi dung`
        
    }
    
    @Test
    //Trong ham nay se chua cac test case de test getF()
    //Voi n hop le trong khoang 0...20

    public void testFactorialGivenRightArgumentReturnsWell() {
        
        //Test case #1: test getF() with n = 0
        //Expected value = 1
        int n = 0;
        long expectedValue = 1; //Expected value 0! = 1
        long actualValue = MathUtility.getFactorial(n);// thuc te tra ve gia tri may ?
        
        Assert.assertEquals(expectedValue, actualValue);
        
        //Test case 2: test getF() with n = 5
        //Expected = 120
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        
        //Test case 3: test getF() with n = 6 ; expected n = 720
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        
        //Test case 4: test getF() with n  = 4; expected = 24
        Assert.assertEquals(24, MathUtility.getFactorial(4));
    }
}
