
package strategy;

/**import strategy.DepreciationStrategy;

/**
 *
 * @author claudioalmeida
 */
public class DecliningBalanceDepreciation extends DepreciationStrategy {

    public DecliningBalanceDepreciation() {
        super("Declining Balance Depreciation");
    }

    @Override
    public double calculate(double accountingValue, int usefulLife) {
        double rate = 0.20; // ou parâmetro externo
        double depreciation = 0;
        for (int i = 0; i < usefulLife; i++) {
            depreciation += accountingValue * Math.pow((1 - rate), i) * rate;
        }
        return accountingValue - depreciation;
    }
}