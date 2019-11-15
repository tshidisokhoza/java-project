class CheckIfEven {

    String evenOrOdd(int n) {

        String parity;

        if (n % 2 == 0) {
            parity = "Even";
        } else {
            parity = "Odd";
        }
        return n + " is an " + parity + " number.";

    }

}
