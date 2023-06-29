package jsp;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int[] dest = new int[10];
//
//        for (int i = 0; i < 10; i++) {
//            dest[i] = i;
//            System.out.println(dest[i]);
//
//        }
////        int i = 0;
////        for (int s : dest) {
////            if (i < 10) {
////                dest[i] = i;
////                System.out.println(dest[i]);
////                i++;
////            } else break;
////        }
//        System.out.println(Arrays.toString(dest));






        String word1 = "TRUE";
        char[] rerer = word1.toCharArray();
        System.out.println(rerer);
        Boolean b = Boolean.valueOf(word1);
        System.out.println(b);


        String word2 = "Hello";
        if (word1.equals(word2)){
            System.out.println("True");
        } else System.out.println("False");

        String word3 = new String("Hello");
        if (word2==word3){
            System.out.println("True");
        }else System.out.println("False");

        if (word2.equals(word3)){
            System.out.println("True");
        }else System.out.println("False");
    }
}
