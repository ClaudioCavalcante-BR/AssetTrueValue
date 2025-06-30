
package dto;

/**
 *
 * @author claudioalmeida
 */
public class AssetDTO {
    
    public String name;
    public double accountingValue;
    public int usefulLife;
    public String condition;
    public String location;
    public String acquisitionDate;
    public String assetCode;

    // Construtor
    public AssetDTO(String name, double accountingValue, int usefulLife, String condition,
                    String location, String acquisitionDate, String assetCode) {
        this.name = name;
        this.accountingValue = accountingValue;
        this.usefulLife = usefulLife;
        this.condition = condition;
        this.location = location;
        this.acquisitionDate = acquisitionDate;
        this.assetCode = assetCode;
    }
    
    
    
    
    
}
