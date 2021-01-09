package pl.davko.jetbrains.excercise.cipherApp;

abstract class MethodFactory {

    public static Method setMethod(String alg) {

        if (alg.equals("unicode")) {
            return new UnicodeMethod();
        } else {
            return new ShiftMethod();
        }
    }
}
