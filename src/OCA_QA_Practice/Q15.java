package OCA_QA_Practice;

public class Q15 {
    public static void main(String[] args) {
        StringBuilder sb1= new StringBuilder("Duke");
       // String sb1= new String("Duke");
        String str1=sb1.toString();
        String str2=str1;
       // String str2=new String(str1);//

        System.out.println(str1==str2);

    }
}
