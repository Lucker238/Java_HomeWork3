import java.util.ArrayList;
import java.util.Collections;

public class Task1_10 {

    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Krasniy");
        arr1.add("Oranjeviy");
        arr1.add("Jeltiy");
        arr1.add("Zelyeniy");
        arr1.add("Sero-Barmalinoviy");
        arr1.add("Cherniy");
        arr1.add("Beliy");
        arr1.add("Seriy");   //1

        arr1.forEach(n -> System.out.println(n + "!")); //2

        arr1.add(0, "Fioletoviy"); //3

        String extraction = arr1.get(3); //4

        arr1.set(4, "Yarko Zelyeniy"); //5

        arr1.remove(3); //6

        int index = -1;
        String forSearch = "oranjeviy";
        for (String i : arr1) {
            if (i.equalsIgnoreCase(forSearch)){
                index = arr1.indexOf(i);        //7
                break;
            }
        }

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add(arr1.get(0));
        arr2.add(arr1.get(2));
        arr2.add(arr1.get(4));
        arr2.add(arr1.get(6));  //8

        arr1.retainAll(arr2); //9 

        Collections.sort(arr1); //10


        System.out.println(index);
        System.out.println(extraction);
        System.out.println(arr1);
        System.out.println(arr2);



    }
}