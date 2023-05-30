/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unique;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author 390
 */
@WebService(serviceName = "GCD")
public class GCD {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getNumbers")
    public int getNumbers(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        int gcd=1;
        for(int i = 1; i <= num1 && i <= num2; i++)  
        {  
            //returns true if both conditions are satisfied   
            if(num1%i==0 && num2%i==0)  
            {
                //storing the variable i in the variable gcd  
                gcd = i;  
            }
        }   
        return gcd;
    }

    /**
     * This is a sample web service operation
     */
    
}

