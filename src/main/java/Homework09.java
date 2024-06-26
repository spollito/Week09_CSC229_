/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */

    
    // ToDo 01:  Write an algorithm to solve the following problem
    /*
    The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over one hundred divisors?
    
    */
    public class Homework09 {
        public static void main(String[] args) {
            int index = 1;
            int divisorCount = 0;

            while (true) {
                // Calculate the triangle number
                int triangleNumber = index * (index + 1) / 2;
                divisorCount = countDivisors(triangleNumber);

                // Check if the number of divisor is more than 100
                if (divisorCount > 100) {
                    System.out.println("First triangle number to have more then 100 divisors is: " + triangleNumber);
                    break;
                }

                index++;
            }
        }

        // Function to count divisors of a given number
        public static int countDivisors(int number) {
            int count = 0;
            int sqrt = (int) Math.sqrt(number);

            for (int i = 1; i <= sqrt; i++) {
                if (number % i == 0) {

                    count += 2;
                    if (i == number / i) {
                        count--;
                    }
                }
            }

            return count;
        }
    }
