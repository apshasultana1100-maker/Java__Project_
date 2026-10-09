package Java_Training;

public class Day1_Day2__ {
    public static void main(String[] args) {
        int basic = 50000 ;
        int bonus = 5000 ;
        int tax = 10 / 1000 ;

        int gross = basic + bonus ;
        int tax1 = gross * 10/1000 ;
        int net_salary = gross - tax1 ;

        System.out.println(gross) ;  // 55000
        System.out.println(tax1); // 550
        System.out.println(net_salary); // 54450
    }

}

// Scenario based QnA;
// Q1. An e-commerce application stores product quantity. Which data type would you choose? What if quantity can be
//2.5?

// --  If quantity is a whole number like 1, 2, 10, 50:
//     we use, int
//     If quantity can be 2.5, then we use: double.

//Q2. A banking system needs to store a very large whole number. What would you check before choosing int or long?
// -- long.

// Q3. A tester expected 2.5 from 10/4 but got 2.0. Explain the cause and give two fixes.
// --- A tester use int which gives int otp. Tester need to use float to get float o/p.

//Q4. Why can float discount = 12.5; fail compilation? Fix it.
//float_discount = 12.5f not float discount = 12.5 , by using "f" near the integer, the memory locates as float.

//Q5. Explain = versus == using a login example.
// (=) assign to the value.
// (==) equals to the value.

//Q6. For login validation, when would you use && instead of ||?
// --  && = both condition are true
//     || = either one of the condition is true or false.
//      For login validation, the username and pw need to be valid, username && pw ; true : true.
//      the username valid and pw invalid, username || pw ; true : false

//Q7. A counter must use its old value and then increment. Which is appropriate: x++ or ++x? Demonstrate.
// -- x++ = post increment , use first then increase later.
//    ++x = pre increment, increase first, use later.

//Q8. The program compiles but CMD cannot find the main class. Name three checks.
// Three checks:
//Class name and file name should be same.
//Check that .class file is created after javac.
//Run the correct class name using:  java Test

