class LongestString {

    void longest(String[] myArray) {

        String longest = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i].length() > longest.length()) {
                longest = myArray[i];
            }
        }
        for (String s : myArray) {
            if (s.length() == longest.length()) {
                System.out.println(s);
            }
        }
    }

}
