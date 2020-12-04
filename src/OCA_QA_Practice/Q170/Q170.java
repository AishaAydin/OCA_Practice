package OCA_QA_Practice.Q170;

public class Q170 {
    public static final int MIN=1;

    public static void main(String[] args) {
        int x=args.length;
        System.out.println(x);
        if (checkLimit(x)){//line n1
            System.out.println("Java SE");

        }else {
            System.out.println("Java EE");
        }
    }
    public static boolean checkLimit(int x){
        return (x>=MIN)?true :false;
    }
}
