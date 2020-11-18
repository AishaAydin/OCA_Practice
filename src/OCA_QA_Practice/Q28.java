package OCA_QA_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q28 {
    public static void main(String[] args) {
        String []arr={"He","How","Are","You"};

        List<String> arrList=new ArrayList<>(Arrays.asList(arr));
        if(arrList.removeIf(s-> {
            System.out.print(s);
            return s.length()<=2;})) {
            System.out.println(" removed");
        }
    }
}
