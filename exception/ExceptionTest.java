class ExceptionTest{
    public static void main(String args[]){
        int a,b,c;
        try{
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            c=a/b;
            System.out.println("Result is= "+c);
        }
        catch(NumberFormatException nfe){
            System.out.println("please enter only numeric value");
        }
        catch(ArithmeticException ae){
            System.out.println("devide by zero not available");

        }
        catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("please enter atleast two numbers");
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
        finally{
            System.out.println("welcome in exception class");
        }
    }
}