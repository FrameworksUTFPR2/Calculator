package frameworksutfpr.git.calculator.interfaces;

import java.util.List;

public interface Calculator  {

    //Simple opperations
    public Double multiplication(Double value1, Double value2);

    public Double division(Double value1, Double value2);

    public Double sum(Double value1, Double value2);

    public Double subtraction(Double value1, Double value2);

    //Advanced opperations
    public List<Double> multiplication(List<Double> values);

    public List<Double> division(List<Double> values1, Double values2);

    public List<Double> sum(List<Double> values1);

    public Double subtraction(Double values1, List<Double> values2);
}
