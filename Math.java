/*
*  Author:  Lauren Cooper
*  Last Modified: May 19, 2017
*/

/*
* This class is a utility class for math functions.
*/

import java.lang.IllegalArgumentException;

public class Math {


 	/* This method raises the base to the exponent
     * and returns that power. 
     * Throws IllegalArgumentException if a negative
     * exponent is provided.
    */
    static int pow (int base, int exponent) throws IllegalArgumentException {
        if (exponent < 0) { 
			throw new IllegalArgumentException("Positive power required: " + 
												exponent + " is invalid.\n");
		}

		int power = 1;
        for(int x = 0; x < exponent; ++x) {
			power *= base;			
        } 
        return power;
    }  
} 
