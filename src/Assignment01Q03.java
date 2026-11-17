public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        
        int numOdd = 0;
        int numBefore = 0;
        int numCurrent = 1;
        for (int i = 0; i < x; i++) {
            if (numCurrent % 2 != 0){
                numOdd++;
            }
            System.out.print(numCurrent); 
            int numNext = numBefore + numCurrent;
            numBefore = numCurrent;
            numCurrent = numNext;
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
