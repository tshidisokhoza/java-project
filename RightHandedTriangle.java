class RightHandedTriangle {

    void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("#");
            for (int j=1; j < i; j++) {
                System.out.print(" #");
            }
            System.out.println(" ");
        }
    }
}
