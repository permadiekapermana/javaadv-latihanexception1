public class DivideException {
    public void division(int operandA, int operandB) {
        int quotient = -1;                
        try{            
            quotient  = operandA/operandB;
            System.out.println("Result is : "+quotient);
        }

        catch(Exception e){
            System.out.println("Computing Division.");
            System.out.println("Exception : "+ e.getMessage());
        }
        finally{
            if(quotient != -1){
                System.out.println("Finally Block Executes");
                System.out.println("Result : "+ quotient);
            }else{
                System.out.println("Finally Block Executes. Exception Occurred");
            }

        }
        System.out.println("Main Program Terminating");
    }

    public static void main(String[] args) {
        DivideException object = new DivideException();
        object.division(100,0);
        System.out.println();
        object.division(100,50);
    }
}