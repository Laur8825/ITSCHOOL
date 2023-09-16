package session4.challenges;

//17. Write a Java program that simulates a simple authentication system. Declare a boolean variable hasUsername and hasPassword.
// Set up a series of logical conditions using these two variables that will check the following conditions:
//If both hasUsername and hasPassword are true, print "Authentication successful".
//If either hasUsername or hasPassword is false, print "Authentication failed".
//If hasUsername is true but hasPassword is false, print "Password is incorrect".


public class Challenge17 {
    public static void main(String[] args) {
        boolean hasUserName = true;
        boolean hasPassword = false;

        if (hasUserName && hasPassword) {
            System.out.println("Authentication successful");
        } else if (!hasUserName || hasPassword) {
            System.out.println("Authentication failed");
        } else if (hasUserName && !hasPassword) {
            System.out.println("Password is incorrect");
        }
        System.out.println(hasUserName);
        System.out.println(hasPassword);
    }
}
