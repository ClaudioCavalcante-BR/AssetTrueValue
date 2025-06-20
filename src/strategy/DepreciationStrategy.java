
package strategy;

/**
 *
 * @author claudioalmeida
 */
public abstract class DepreciationStrategy {
    private String description; // ex: "Linear", "Declining Balance"

    public DepreciationStrategy() {}

    public DepreciationStrategy(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Calcula a depreciação baseada em uma estratégia definida.
     *
     * @param accountingValue valor contábil atual do ativo
     * @param usefulLife vida útil restante
     * @return valor depreciado segundo a estratégia adotada
     */

    // Método que será implementado pelas estratégias concretas
    public abstract double calculate(double accountingValue, int usefulLife);
    
    
}
