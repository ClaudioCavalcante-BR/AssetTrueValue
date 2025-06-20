
package observer;


import model.Asset;
/**
 *
 * @author claudioalmeida
 */
public class LoggerObserver implements AssetObserver {
    @Override
    public void update(Asset asset) {
        System.out.println("[LOGGER] Novo ativo registrado: " + asset.getName() + " (Código: " + asset.getAssetCode() + ")");
    }
}