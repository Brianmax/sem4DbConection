package org.example;

import org.example.dao.AerolineaDao;
import org.example.entity.Aerolinea;

import java.sql.Connection;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/sem4";
        String username = "postgres";
        String password = "password";

        Connection db = DbConnection.connect(url, username, password);

        Scanner sc = new Scanner(System.in);

        AerolineaDao aerolineaDao = new AerolineaDao(db);

        Aerolinea aerolineaInsert = new Aerolinea();
        aerolineaInsert.setNombre("Latam");


        aerolineaDao.addAerolinea(aerolineaInsert);
    }
}