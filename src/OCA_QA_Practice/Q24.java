package OCA_QA_Practice;

public class Q24 {
    public static void main(String[] args) {

        int nums1[]={1,2,3};
        int nums2[]={1,2,3,4,5};
         nums2=nums1;

        for (int i : nums2) {
            System.out.print(i+":");
        }
        // answer A
        System.out.println();

       // System.out.println(Arrays.toString(num2));


    }
}
