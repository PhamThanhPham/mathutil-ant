/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhpc.mathutil.core;

/**
 *
 * @author ThanhPC
 */
public class MathUtility {

    public static final double PI = 3.14;

    //Ham tinh N! = 1 x 2 x 3 x 4 x 5 x ...
    //Ko co giai thua am
    //0! = 1! = 1 quy uoc 0! = 1
    //Vi giai thua tang gia tri rat nhanh, 20! vua du 18 so 0
    //tuc la 21! tran kieu LONG
    //Ham nay chi tinh tu 0 cho den 20
    //Co 2 cach viet ham nay for truyen thong va de quy - recursion
    public static long getFactorial(int n) {
        
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20!");
        
        if(n == 0 || n == 1)
            return 1;
        
        //song sot den doan nay tu 2 den 20
        long product = 1;
        for (int i= 2; i <= n; i++) 
            product *= i;
        
        return product;
    }
    
    
}
