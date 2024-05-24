package org.example.dao;

import lombok.AllArgsConstructor;
import org.example.entity.Aerolinea;

import java.sql.Connection;
import java.sql.PreparedStatement;

@AllArgsConstructor
public class AerolineaDao {
    private Connection db;

    public void addAerolinea(Aerolinea aerolinea)
    {
        String query = "INSERT INTO aerolineas(nombre) VALUES(?)";

        try {
            PreparedStatement preparedStatement = db.prepareStatement(query);
            preparedStatement.setString(1, aerolinea.getNombre());

            preparedStatement.executeUpdate();
            System.out.printf("Insercion de aerolinea exitosa");
        }
        catch (Exception e){
            System.out.printf(e.getMessage());
        }
    }
}
