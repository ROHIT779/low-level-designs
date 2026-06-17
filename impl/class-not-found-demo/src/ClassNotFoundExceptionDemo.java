public class ClassNotFoundExceptionDemo {

    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            System.out.println("Caught exception with message: "+ex.getMessage());
        }finally{
            System.out.println("Finally executed");
        }
    }
}