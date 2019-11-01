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
        String connectionUrl = "jdbc:sqlserver://srvgrupo4b.database.windows."
                + "net:1433;databaseName=bdgrupo4;user=usergrupo4b;"
                + "password=#Gfgrupo4b";

        dataSource​.setUrl(connectionUrl);
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
}
