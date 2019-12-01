package RootFinders;

public enum RootFinderType {
    BISECTION("Bisection"),
    NEWTON("Newtonian"),
    ETC("any else more");

    private String label;

    RootFinderType(String label) {
        this.label = label;
    }

    public String toString() {
        return label;
    }
}
