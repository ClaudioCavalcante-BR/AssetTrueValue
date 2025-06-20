
package adapter;

import java.math.BigDecimal;

/**
 *
 * @author claudioalmeida
 */
public class ExternalMarketPriceAdapter implements MarketDataProvider {

    @Override
    public BigDecimal getMarketPrice(String assetCode) {
        // Aqui entraria a lógica de conexão HTTP com a API real
        // Simulação:
        return new BigDecimal("15000.00"); // valor fictício
    }
}