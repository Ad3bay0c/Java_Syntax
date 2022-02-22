package src.collections;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

public class Main {
//    public static void main(String[] args) {
//        String largest = "";
        String s = "30 10 20";
//
//        String[] result = s.replaceAll("[^a-zA-Z0-9 ]", "").split(" ");
        StringBuffer j = new StringBuffer(s.length());
//        j.reverse();
//        System.out.println(j.toString());
//        int count = result.length;
//        for (String r : result) {
//            if (r.length() > largest.length()){
//                largest = r;
//            }
//        }
//        System.out.println(largest);
//        String[] result = s.split(" ");
//        String result2 = String.join(" ", result);
//        result.toString();
//        for (int i = result.length-1; i >= 0; i--) {
//            j.append(result[i]);
//            if (i > 0){
//                j.append(" ");
//            }
//        }
//        System.out.printf("%s: %s", j.toString());
//    }

    public static void main(String[] args) {
        String f = "75Number9 word3";
        String[] res = f.split("[a-zA-Z ]+");
        int sum = 0;
        for (String r : res){
            sum += Integer.parseInt(r);
        }
        System.out.println(sum);
        String.valueOf(sum);
    }

}
