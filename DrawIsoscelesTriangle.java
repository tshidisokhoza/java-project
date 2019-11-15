class DrawIsoscelesTriangle {
    void isoscelesTriangle(int n) {

        String hash = "#";

        for (int i = 1; i <= n; i++) {
            for (int k = n -i; k >= 1; k-- ) {
                System.out.print(" ");
            }
            System.out.println(hash);
            for (int j = 1; j <= 2; j++) {
                hash +="#";
            }
        }
    }
}
