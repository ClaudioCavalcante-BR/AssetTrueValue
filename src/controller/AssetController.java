
package controller;

import adapter.ExternalMarketPriceAdapter;
import dao.AssetDAO;
import dto.AssetDTO;
import model.Asset;
import observer.AssetEventManager;
import observer.LoggerObserver;
import observer.AuditorObserver;
import service.FairValueService;



/**
 *
 * @author claudioalmeida
 */
public class AssetController {

    private AssetDAO dao = new AssetDAO();
    private FairValueService fairValueService = new FairValueService(new ExternalMarketPriceAdapter());

    // Gerenciador de eventos do padrão Observer
    private AssetEventManager eventManager = new AssetEventManager();

    public AssetController() {
        // Registra observadores
        eventManager.addObserver(new LoggerObserver());
        eventManager.addObserver(new AuditorObserver());
    }

    public void save(AssetDTO dto) {
        Asset asset = new Asset(
        dto.name, dto.accountingValue, dto.usefulLife,
        dto.condition, dto.location, dto.acquisitionDate, dto.assetCode
    );

    double fairValue = fairValueService.calculateFairValue(asset).doubleValue();
    System.out.println("Fair value calculated: " + fairValue);

        System.out.println("Fair value calculated: " + fairValue);

        dao.save(asset); // Persiste o ativo

        eventManager.notifyObservers(asset); // Notifica os observers registrados
    }
    
    
}