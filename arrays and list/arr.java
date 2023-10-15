//Example in Java to Create 2d ArrayList using Fixed-Size Array
import java.util.ArrayList;
import java.util.Arrays;

public class arr {
    public static void main(String[] args) {

        ArrayList<String>[][] arraylist1 = new ArrayList[3][3];
        arraylist1[0][0] = new ArrayList<String>();
      
        arraylist1[0][0].add("sone");
        arraylist1[0][0].add("stwo");
        arraylist1[0][0].add("sthree");

        arraylist1[0][1] = new ArrayList<String>();
        arraylist1[0][1].add("sone");
        arraylist1[0][1].add("stwo");
        arraylist1[0][1].add("sthree");

        arraylist1[0][2] = new ArrayList<String >();
        arraylist1[0][2].add("sone");
        arraylist1[0][2].add("stwo");
        arraylist1[0][2].add("sthree");

        System.out.println(Arrays.deepToString(arraylist1));

    }
}
