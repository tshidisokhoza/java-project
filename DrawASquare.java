class DrawASquare {

    void square(int n) {
        System.out.println(" ");
        for (int i = 1; i <= n; i++) {
            System.out.print("#");
            for (int j = 1; j < n; j++) {
                System.out.print(" #");
            }
            System.out.println(" ");
        }
    }
}
