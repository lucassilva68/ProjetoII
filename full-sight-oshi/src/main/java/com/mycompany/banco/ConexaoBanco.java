/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Divino Covinhas
 */
public class ConexaoBanco {

    BasicDataSource dataSource;

    public ConexaoBanco() {
        dataSource = new BasicDataSource();

        dataSource​.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://testejdbc.database.windows."
                + "net:1433;databaseName=testejdbc;user=VGsP;"
                + "password=#Gf43651961893";

        dataSource​.setUrl(connectionUrl);
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
}
