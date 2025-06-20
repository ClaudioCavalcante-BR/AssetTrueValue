
package strategy;

import strategy.DepreciationStrategy;

/**
 *
 * @author claudioalmeida
 */
public class LinearDepreciation extends DepreciationStrategy {

    public LinearDepreciation() {
        super("Linear Depreciation"); // Define a descrição da estratégia
    }

    @Override
    public double calculate(double accountingValue, int usefulLife) {
    if (usefulLife == 0) {
        throw new ArithmeticException("Vida útil não pode ser zero.");
    }
    return accountingValue / usefulLife;
    }
}