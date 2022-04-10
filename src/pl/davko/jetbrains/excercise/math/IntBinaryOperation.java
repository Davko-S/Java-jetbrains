package pl.davko.jetbrains.excercise.math;

abstract class IntBinaryOperation {
    protected int firstArg;
    protected int secondArg;

    public IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    abstract int perform();
}
