package RootFinders;

public abstract class RootFinder {
    public double epsilon;

    public RootFinder() {
        this.epsilon = 0.0001;
    }

    public RootFinder(double epsilon) {
        this.epsilon = epsilon;
    }

    protected abstract double calculateEpsilonA();

}
