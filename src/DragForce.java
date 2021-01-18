/*
 * Name: Christopher Grigsby
 * Date: 10/13/20
 * Assignment: DriveFaster
 * Pseudocode:
 * 
 * PROGRAM DragForce: 
 * 
 * Initialize all variables (RHO, AREA, D_SUB_C, MPH_TO_MS, velocity, watts, horsePower, dragForce)
 * 
 * Prompt user for velocity 
 * velocity is input 
 * 
 * if velocity is less than 0 
 *   Calculate velocity by velocity times negative 1 
 * 
 * Calculate velocity by velocity times MPH_TO_MS
 * Calculate dragForce by RHO times velocity squared times AREA times C_SUB_D
 * Calculate watts by dragForce times velocity 
 * Calculate horsePower by watts divided by HP_CONVERSION
 * 
 * Display watts and horsePower 
 */

/**
 * Program Description: 
 * This program accepts a car's velocity and computes the power in watts and 
 * horsepower needed to overcome the resulting drag force.
 */

import java.util.Scanner; 

public class DragForce 
{

	public static void main(String[] args) 
	{
		// Initialize all variables 
		Scanner in = new Scanner(System.in); 
		final double RHO = 1.23;          //density of air kg/m^3
		final double AREA = 2.5;          //projected area of the car in m^2
		final double C_SUB_D = 0.2;       //drag coefficient
		final double MPH_TO_MS = 0.447;   //mph to m/s conversion rate
		final double HP_CONVERSION = 746; //to obtain horsepower from watts conversion
		double velocity = 0;
		double watts = 0; 
		double horsePower = 0;            //horsepower
		double dragForce = 0; 
		
		//Prompt user for input 
		System.out.print("Please enter a number for the car's velocity in Miles per Hour: "); 
		velocity = in.nextDouble(); 
		
		if ( velocity < 0 ) //input validation 
		{
			velocity = velocity * (-1); 
		}
		
		//Calculations
		velocity = velocity * MPH_TO_MS; 					      //convert mph to m/s
		dragForce = (RHO*Math.pow(velocity, 2)*AREA*C_SUB_D) / 2; //calculate drag force
		watts = dragForce * velocity; 						      //calculate watts
		horsePower = watts / HP_CONVERSION; 				      //calculate horsepower
			
		//Display 
		System.out.printf("%nTo overcome the resulting drag force the vehicle will need: "+
							"%.2f watts and %.2f horsepower", watts, horsePower); 		
	}//main

}//class
