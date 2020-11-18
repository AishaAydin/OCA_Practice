package OCA_QA_Practice;

public class Q22 {
    public static void main(String[] args) {
       int ans;
       try{
           int num=10;
           int div=0;
           ans=num/div;

       }catch (ArithmeticException e){
           ans=0;          // line 1
       }catch (Exception e){
           System.out.println("Invalid calculation");
       }
       // System.out.println("Answer: "+ans); // line2

    }
}
