package RootFinders;

public class Newton extends RootFinder implements IRootFinder {

    @Override
    protected double calculateEpsilonA() {
        return 0;
    }


    @Override
    public double findRoot(IEquation equation) {
        return calculate(equation);
    }

    private double calculate(IEquation equation){

        double a = -20; //przyjmujemy parametry początkowe
        double b = 20; //początkowe xi+1

        if (equation.calculateEquation(a) * equation.calculateEquation(b) >= 0)
        {
            return 0;
        }

        double c = a;
        while ((b-a) >= epsilon)
        {
            // Find middle point
            c = equation.calculateEquation(a)/equation.calculateDerivativeValue(a);

            // Check if middle point is root
            if (equation.calculateEquation(c) == 0.0)
                break;

                // Decide the side to repeat the steps
            else if (equation.calculateEquation(c)*equation.calculateEquation(a) < 0)
                b = c;
            else
                a = c;
        }
        return c;
    }


}
