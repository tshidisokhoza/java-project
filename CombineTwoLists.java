import java.util.Arrays;

class CombineTwoLists {

    void combineTwoStrings(String[] list1, String[] list2) {

        String[] minList = list1;
        String[] maxList = list2;

        if (list2.length >= list1.length) {
            minList = list1;
            maxList = list2;
        } else  {
            minList = list2;
            maxList = list1;
        }


        String[] myArray = new String[]{};
        for (int i = 0; i < minList.length; i++) {

            myArray = Arrays.copyOf(myArray,myArray.length+1);
            myArray[(myArray.length-1)] = minList[i];

            myArray = Arrays.copyOf(myArray,myArray.length+1);
            myArray[(myArray.length-1)] = maxList[i];

        }
        for (int i = minList.length; i < maxList.length; i++) {
            myArray = Arrays.copyOf(myArray,myArray.length+1);
            myArray[(myArray.length-1)] = maxList[i];
        }

        System.out.println(Arrays.toString(myArray));
    }
}
