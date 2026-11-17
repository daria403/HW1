public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        
        for (int i = 0; i < Integer.parseInt(args[0]); i++){
            double divided = 1.0 / (i*2 + 1);
            if (i % 2 != 0){
                divided *= (-1);
            }
            approxPi += divided;
        }
        approxPi *= 4;
        
        System.out.println(approxPi + " " + actualPi);
    }
}
