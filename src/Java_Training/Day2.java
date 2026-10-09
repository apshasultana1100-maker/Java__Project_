package Java_Training;

public class Day2 {
    public static void main(String[] args) {

        // BASIC
        // 1.Create variables for employee name, ID, department, salary and active status. Print a neat report.

        int employee_ID = 101  ;
        String employee_name = "Alizey" ;
        String department_name = "QA Engineer" ;
        double salary = 55000 ;
        Boolean active_status = true ;
        System.out.println(

                "Report:" + "Employee ID:" + employee_ID     + ","   +   "Deparment name:" + department_name  + "," + "Salary:" + salary +  "," + "Active Status:" + "active") ;

        // 2.Create a product with price and quantity. Calculate subtotal, 18% tax and final total.

        String Product_name = "Orange Pulp" ;
        Float price = 99.09F ;
        Float quantity = 100f ;

        Float subtotal = price * quantity ; // 99.09 * 100 = 9909.0
        Float tax = subtotal * 0.18f ; // 9909.0 * 18/100 = 1783.6201
        Float total = subtotal + tax ;  // 99.09 + 1783.6201 = 11692.62

        System.out.println("Sub_Total:" + subtotal); //9909.0
        System.out.println("Tax:" + tax); // 1783.6201
        System.out.println("Final Total:" + total); // 11692.62

        // 3.Read an integer and print whether it is positive, negative or zero.

        int number = 25 ;
        String result =  number > 0 ? "Postive" : number < 0 ? "Negative" : "Zero" ;
        System.out.println(result);

        // 4. Check whether a number is divisible by both 3 and 5 using logical operators.

        int num = 15  ;
        System.out.println(num % 3 == 0 && num % 5 == 0);

        // 5. Create two integers and print sum, difference, product, quotient and remainder.

        int N1 = 25 ;
        int N2 =  30;
        int sum = N1 + N2 ; // 25+30 = 55
        int difference = N1 - N2 ;  // 25-30 = -5
        int product = N1*N2 ; // 25*30 = 750
        int quotient =  N1/N2 ; // 25/30 = 0
        int remainder = N1%N2 ;  // 25%30 = 25
        System.out.println("Sum:" + sum);  // 55
        System.out.println("D:" + difference); // -5
        System.out.println("P:" + product); // 750
        System.out.println("Q:" + quotient); // 0
        System.out.println("R:" + remainder); // 25

        // INTERMEDIATE
        // 1.Calculate simple interest using principal, rate and time.

        int P = 1000;
        int R = 5  ;
        int T = 2 ;
        int simple_interest = P*R*T / 100 ;  // 1000*5*2 / 100 = 100
        System.out.println("Simple Interest:" + simple_interest) ; // 100

        // 2. Write an eligibility check: age &gt;= 18 AND income &gt;= 25000.

        int Age = 35 ;
        int income =  30000 ;
        boolean eligible = Age >=  18  && income >= 25000;
        System.out.println("Eligible:" + eligible) ;

        // 3. Use ternary to mark an order as &quot;Free Delivery&quot; when amount &gt;= 999.

        int amount = 1000 ;
        String delivery = amount >= 999 ? "Free Delivery" : "Delivery Charges Apply";
        System.out.println("Delivery:" + delivery);

        // 4. Create a static counter that increments every time an object is created.

        int count = 0;
        count++; // 0 to1
        count++; // 1 to 2
        count++; // 2 to 3
        System.out.println(count);  // 3

        //5. Demonstrate pre-increment and post-increment and explain the output.

        int x = 5 ; // 7
        int y =  ++ x ; // increase first, then use -- 6
        int z = x++; // use first, then increase later -- 6
        int r = y + z;  // 6 + 6 = 12
        int h = z + y ; // 6 + 6 = 12
        System.out.println(x) ; // 7
        System.out.println(y) ; // 6
        System.out.println(z) ; // 6
        System.out.println(r) ; // 12
        System.out.println(h) ; // 12

        // CHALLENGE.
        // 1.Build a banking withdrawal validator using balance, withdrawal amount, accountActive and pinValid.

        int balance = 50000;
        int withdrawal = 10000;

        boolean accountActive = true;
        boolean pinValid = true;

        boolean banking_withdrawal =  balance >= withdrawal && accountActive && pinValid ;

        System.out.println("BW:" + banking_withdrawal) ;

        // 2. Build an e-commerce discount rule: VIP = 10%, standard = 5%, but only when cart &gt;= 2000.
        int cart = 2500 ;
        String discount_cart = cart >= 2000 ? "VIP" : "Standard" ;
        System.out.println("discount_rule:" + discount_cart) ;

        // 3. Build a flight booking rule: logged in, seats available, fare &gt; 0, payment successful.

        boolean loggedIn = true;
        boolean seatsAvailable = true;
        int fare = 5000;
        boolean paymentSuccessful = true;
        boolean flight_BR = (loggedIn && seatsAvailable && fare >=0 && paymentSuccessful ) ;
        System.out.println("flight_BR:" + flight_BR) ;

    }

}

        // Scenario based QnA
        // 1 - Banking Login ;
        // A customer can log in only when the account is active AND username/password are valid. Which variables
        // and operators will you use? What happens when one condition fails?

        // --  Here, we need to use Boolean and && operator for  active acc, username nd password. If anyone of the  condition'
        //     fail, the customer cannot log in.

        //    boolean accountActive = true;
        //    boolean usernameValid = true;
        //    boolean passwordValid = true;
        //    boolean login = accountActive && usernameValid && passwordValid;
        //     System.out.println(login);

        // 2.Scenario 2 - ATM Withdrawal
        //   With_drawal is valid only when KYC is verified, account is active, amount is positive, and amount is not greater
        //   than available balance. Design the boolean expression and at least 5 combinations.
        //
        // --- Here we have to write the boolean conditions for the  account active, amount is in positive, amount is greater
        //   than the available bal and kyc is verified.
        //  boolean KyC verified = true ;
        //  boolean account_active = true ;
        //  boolean amount_positive = true ;
        //  boolean available_bal = true ;
        //  boolean withdrawal_allowed = true ;
        //  boolean withdrawal = kycVerified && accountActive && amountPositive && availableBalance && withdrawal_allowed ;
        //   System.out.println(withdrawal);

        // 3.Scenario 3 - E-commerce Checkout
        //Free delivery is offered for cart amount &gt;= 999. Premium users get 10% discount, standard users get 5%, but
        //only when cart amount &gt;= 2000. Identify variables and conditions.

        //  Here, we use Ternary operator and Int data type.
        // -- int cart = 1000
        //    int cart_amount = cart_amount >= 2000 ? "Premium users" : "Standard users" ;
        //    System.out.println(cart_amount) ;

        //  4. Scenario 4 - Flight Booking ;
        // Booking requires login, seat availability, valid fare and successful payment. A refundable booking has an
        //additional fee. Write the arithmetic and boolean logic.

        // --- boolean successful_payment = true ;
        //     boolean login = true ;
        //     boolean seat_availability = true ;
        //     boolean refundable = true ;
        //     double valid_fare = 3000 ;
        //     double refund_fee = 1000 ;
        //     double total_fare = valid_fare + refund_fee ;
        //     boolean booking = logged && seat_availability && valid_fare > 0 && successful_payment ;
        //     system.out.println(total_fare) ;
        //     system.out.println(booking) ;


        // 5. Scenario 5 - QA Retry Logic
        // A test may retry up to 3 times. Model retryCount and maxRetry. What should happen at retryCount = 0, 2, 3
        // and 4?

        // --  Here, we use logic as "retryCount < maxRetry", when the test retry at the count
        //      0, 1, 2 - successful and retry allowed. Whereas, at the count 3,4,5 -unsucessfull, retry not allowed. The counting starts from 0, 1, 2 which are 3 attempts.
        //     int maxRetry = 3;
        //     int retryCount = 0;
        //     int test = (retryCount < maxRetry) ;
        //     system.out.println(test) ;

        // 6. Scenario 6 - API Response Validation
        //An API test passes when statusCode == 200 AND responseTime &lt; 2000 AND response body is not null.
        //Convert this into a Java boolean expression.

        // -- int status_code =  200 ;
        //    int response_time = 21000 ;
        //    String response_body = "Successful''
        //    Boolean api  = statusCode == 200  && responseTime < 2000 && responseBody != null;
        //    system.out.println(api) ;

        // Scenario 7 - Passenger Age Rule
        //Infant = age &lt; 2, child = age &gt;= 2 and age &lt; 12, adult = age &gt;= 12. Which operators and conditions will you
        //use?

        // ---  Here we use relational operator and && condition.
        // int infant = 1 ;
        // int child = 10 ;
        // int adult = 15 ;
        // boolean infant = age < 2;
        // boolean child = age >= 2 && age < 12;
        // boolean adult = age >= 12;
        // system.out.println(infant) ;
        // system.out.println(child) ;
        // system.out.println(age) ;

        // Scenario 8 - Payment Amount Mismatch
        //Displayed amount and charged amount must match for this practice. Which relational operator will you use?
        //What edge cases would you test?

        // -- Here, for amount mismatch, use the == (equal to) relational operator and edge test cases are,
        // same amount = 10 and 10 -- match ;
        //  diff amount = 10 and 11 -- no match ;
        //  double displayed_amount = 10 ;
        //  double charged_amount = 10 ;
        //  double match = displayed amount == charged amount ;
        //  system.out.println(match) ;

























