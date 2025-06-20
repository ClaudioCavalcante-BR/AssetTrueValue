
package factory;


import strategy.DepreciationStrategy;
import strategy.LinearDepreciation;
import strategy.DecliningBalanceDepreciation;
/**
 *
 * @author claudioalmeida
 */
public class DepreciationStrategyFactory {
    public static DepreciationStrategy createStrategy(String strategyType) {
        switch (strategyType.toUpperCase()) {
            case "LINEAR":
                return new LinearDepreciation();
            case "DECLINING":
                return new DecliningBalanceDepreciation();
            default:
                throw new IllegalArgumentException("Tipo de estratégia desconhecido: " + strategyType);
        }
    }
    
    
}
