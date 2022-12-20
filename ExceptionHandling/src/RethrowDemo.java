// Rethow an exception.
class Rethrow {
    public static void genException() {
        // here, numer is longer than demon.
        int [] numer = {4,8,16,32,64,128,256,512};
        int [] denom = {2,0,4,4,0,8};

        for(int i = 0; i < numer.length; i++) {
            try{
                System.out.println(numer[i] + " / " +
                denom[i] + " is " + numer[i]/denom[i]);
            }
            catch(ArithmeticException exc) {
                //catch the exception
                System.out.println("Can't divide by Zero");
            }
            catch(ArrayIndexOutOfBoundsException exc) {
                //catch the exception
                System.out.println("No matching element found");
                throw exc;
            }
        } 
    }
}

class RethowDemo {
    public static void main(String[] args){
        try{
            Rethrow.genException();
        }
        catch(ArrayIndexOutOfBoundsException exc){
            //recatch exception
            System.out.println("Fatal Error - " +
            "program terminated.");
        }
    }
}
