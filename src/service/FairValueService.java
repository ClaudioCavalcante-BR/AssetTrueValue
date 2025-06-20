
package service;

import adapter.MarketDataProvider;
import model.Asset;
import java.math.BigDecimal;
/**
 *
 * @author claudioalmeida
 */
public class FairValueService {

    private MarketDataProvider marketDataProvider;

    public FairValueService(MarketDataProvider marketDataProvider) {
        this.marketDataProvider = marketDataProvider;
    }

    public BigDecimal calculateFairValue(Asset asset) {
        return marketDataProvider.getMarketPrice(asset.getAssetCode());
    }
}
