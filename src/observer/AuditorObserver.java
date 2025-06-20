
package observer;


import model.Asset;

/**
 *
 * @author claudioalmeida
 */
public class AuditorObserver implements AssetObserver {
    @Override
    public void update(Asset asset) {
        System.out.println("[AUDITORIA] Ativo auditado: " + asset.getName() + " - Valor contábil: " + asset.getAccountingValue());
    }
}