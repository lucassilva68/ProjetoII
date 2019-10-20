/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Divino Covinhas
 */
public class CodigoBanco {

    public static void main(String[] args) {
        ConexaoBanco conexaoBanco = new ConexaoBanco();
        JdbcTemplate jdbcTemplate = new JdbcTemplate(conexaoBanco.getDataSource());

        List lista = jdbcTemplate.queryForList(
                "SELECT * from usuario");

        System.out.println("Consulta: " + lista);

    }
}
