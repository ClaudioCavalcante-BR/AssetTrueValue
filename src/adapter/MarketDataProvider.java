
package adapter;

import java.math.BigDecimal;

/**
 *
 * @author claudioalmeida
 */
public interface MarketDataProvider {
    BigDecimal getMarketPrice(String assetCode);
}