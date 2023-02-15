/**
 * 
 */
package com.signify.client;
import com.signify.service.CalculatorService;

/**
 * @author hp
 *
 */
public class CalClient {
	
public static void main(String[] args) {
	CalculatorService service = new CalculatorService();
	System.out.println("Addition of variable-->"+service.addition(10, 10));
	System.out.println("Subtraction of variable-->"+service.addition(20,10));
	System.out.println("Multiplication of variable-->"+service.addition(10, 10));
	System.out.println("Division of variable-->"+service.addition(20,2));
	
	//call the static methods here 
	
    System.out.println("call the static methods-->"+CalculatorService.testStatic());
    
}
}
