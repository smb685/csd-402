/**
 * Program: WaterHeatingCalculator.java
 * Author: Sylvester Brandon
 * Course: CSD-402
 * Module: 1
 * Date: [Insert Date]
 *
 * Description:
 * This program calculates the amount of energy (in Joules) required to heat
 * a given mass of water from an initial temperature to a final temperature.
 * 
 * Formula:
 *      Q = waterMass * (finalTemperature - initialTemperature) * 4184
 * 
 * Where:
 *      - waterMass is the mass of the water in kilograms
 *      - finalTemperature and initialTemperature are in Celsius
 *      - Q is the energy in Joules
 *
 * Documentation:
 * The joule is a derived unit of energy in the International System of Units.
 * It is equal to the energy transferred to (or work done on) an object when 
 * a force of one newton acts on that object in the direction of the force's 
 * motion through a distance of one metre (1 newton metre or N·m). It is also 
 * the energy dissipated as heat when an electric current of one ampere passes 
 * through a resistance of one ohm for one second. It is named after the English 
 * physicist James Prescott Joule. ("Joule", Wikipedia, 2024)
 */

 import java.util.Scanner;

 public class WaterHeatingCalculator {
 
     public static void main(String[] args) {
         
         // Create scanner object for user input
         Scanner input = new Scanner(System.in);
         
         // Prompt user for the amount of water in kilograms
         System.out.print("Enter the amount of water in kilograms: ");
         double waterMass = input.nextDouble();
         
         // Prompt user for initial temperature in Celsius
         System.out.print("Enter the initial temperature (°C): ");
         double initialTemperature = input.nextDouble();
         
         // Prompt user for final temperature in Celsius
         System.out.print("Enter the final temperature (°C): ");
         double finalTemperature = input.nextDouble();
         
         // Calculate the energy required using the formula
         double energy = waterMass * (finalTemperature - initialTemperature) * 4184;
         
         // Display the result
         System.out.printf("The energy required to heat the water is %.2f Joules.%n", energy);
         
         // Close scanner
         input.close();
     }
 }
 