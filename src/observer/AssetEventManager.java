
package observer;


import java.util.ArrayList;
import java.util.List;
import model.Asset;
/**
 *
 * @author claudioalmeida
 */
public class AssetEventManager {
    
    private List<AssetObserver> observers = new ArrayList<>();

    public void addObserver(AssetObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(AssetObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Asset asset) {
        for (AssetObserver observer : observers) {
            observer.update(asset);
        }
    }

    
}
