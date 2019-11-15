class FrameSomeText {

    void frame(String[] myArray) {
        String longest = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i].length() > longest.length()) {
                longest = myArray[i];
            }
        }

        for (int i = 0; i < (longest.length()+4); i++) {
            System.out.print("*");
        }
        System.out.println(" ");

        for (String s : myArray) {
            System.out.print("* " + s);
            int j;
            for (j = s.length() + 2; j <= longest.length() + 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < (longest.length()+4); i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }

}
