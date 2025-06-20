/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import model.Asset;
import java.util.List;

/**
 *
 * @author claudioalmeida
 */
public interface AssetDAOInterface {
    void save(Asset asset);
    void update(Asset asset);
    void delete(int id);
    Asset findById(int id);
    List<Asset> findAll();
    
    
}
