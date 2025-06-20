
package model;

/**
 *
 * @author claudioalmeida
 */
public class Asset {
    private String name;
    private double accountingValue;
    private int usefulLife;
    private String condition;
    private String location;
    private String acquisitionDate;
    private String assetCode;

    public Asset() {}

    public Asset(String name, double accountingValue, int usefulLife,
                 String condition, String location, String acquisitionDate, String assetCode) {
        this.name = name;
        this.accountingValue = accountingValue;
        this.usefulLife = usefulLife;
        this.condition = condition;
        this.location = location;
        this.acquisitionDate = acquisitionDate;
        this.assetCode = assetCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccountingValue() {
        return accountingValue;
    }

    public void setAccountingValue(double accountingValue) {
        this.accountingValue = accountingValue;
    }

    public int getUsefulLife() {
        return usefulLife;
    }

    public void setUsefulLife(int usefulLife) {
        this.usefulLife = usefulLife;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(String acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }


  
}
