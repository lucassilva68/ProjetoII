/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import com.mycompany.full.sight.oshi.MonitoramentoFS;

/**
 *
 * @author Divino Covinhas
 */
public class CodigoBanco {

    public static void main(String[] args) {

        MonitoramentoFS monitoramento = new MonitoramentoFS();
        ConexaoBanco conexaoBanco = new ConexaoBanco();
        JdbcTemplate jdbcTemplate = new JdbcTemplate(conexaoBanco.getDataSource());

        jdbcTemplate.update("insert into computadores (memoria,CPU,disco) "
                + "values (?,?,?)", monitoramento.verMemoriaUsada(),
                monitoramento.verPorcentagemCpu(),
                monitoramento.verEspacoUtilizado());

        List lista = jdbcTemplate.queryForList(
                "SELECT * from computadores");

        System.out.println("Consulta: " + lista);

    }
}
