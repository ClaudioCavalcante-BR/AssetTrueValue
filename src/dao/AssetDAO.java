
package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Asset;

/**
 *
 * @author claudioalmeida
 */
public class AssetDAO {
    
    private Connection connection;

    public AssetDAO() {
        this.connection = ConnectionFactory.getInstance().getConnection();
    }
public void save(Asset asset) {
        String sql = "INSERT INTO assets (name, accounting_value, useful_life, condition, location, acquisition_date, asset_code) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, asset.getName());
            stmt.setDouble(2, asset.getAccountingValue());
            stmt.setInt(3, asset.getUsefulLife());
            stmt.setString(4, asset.getCondition());
            stmt.setString(5, asset.getLocation());
            stmt.setString(6, asset.getAcquisitionDate());
            stmt.setString(7, asset.getAssetCode());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao salvar o ativo", e);
        }
    }

    // Você pode adicionar aqui outros métodos como update, delete, findAll...

}
