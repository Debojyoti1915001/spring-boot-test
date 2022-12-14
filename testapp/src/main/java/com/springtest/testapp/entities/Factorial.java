
package com.springtest.testapp.entities;

import org.springframework.stereotype.Service;

@Service
public class Factorial {
 
    // Method
    // To compute factorial
    public int factorial(int n)
    {
        // Base case
        if (n == 0)
            return 1;
 
        return n * factorial(n - 1);
    }
}