package pl.davko.jetbrains.excercise;

abstract class IntBinaryOperation {
    protected int firstArg;
    protected int secondArg;

    public IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    abstract int perform();
}
