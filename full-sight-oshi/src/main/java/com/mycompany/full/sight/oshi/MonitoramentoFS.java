/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.full.sight.oshi;

import oshi.PlatformEnum;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import oshi.util.FormatUtil;

public class MonitoramentoFS {

    SystemInfo si = new SystemInfo();
    OperatingSystem os = si.getOperatingSystem();
    HardwareAbstractionLayer hal = si.getHardware();
    
    public String verSO(PlatformEnum SO) {

        String mostrarSO = String.format("Sistema operacional: %s",
                si.getCurrentPlatformEnum());

        return mostrarSO;
    }
    
    //CÓDIGO DA MEMORIA
    /* MEMORIA PRA PROGRESS BAR
    public Integer verMemoriaPb() {
        long memoriaDisponivel = hal.getMemory().getAvailable();
        Integer teste = (int) memoriaDisponivel;

        return teste;
    }

    public Integer verMemoriaUsadaPb() {
        long memoriaUsada = hal.getMemory().getTotal() - hal.getMemory().getAvailable();
        Integer teste = (int) memoriaUsada;

        return teste;
    }
    */

    public String verMemoriaDisponivel(GlobalMemory memoria) {

        long disponivel = memoria.getAvailable();

        String mostrarMemoria = String.format(
                "Memória Disponível: %s",
                FormatUtil.formatBytes(disponivel));

        return mostrarMemoria;
    }

    public String verMemoriaUsada(GlobalMemory memoria) {

        long memoriaUsada = memoria.getTotal() - memoria.getAvailable();

        String mostrarMemoriaUsada = String.format("Memória Utilizada: %s",
                FormatUtil.formatBytes(memoriaUsada));

        return mostrarMemoriaUsada;
    }
    
    public String verMemoriaTotal(GlobalMemory memoria) {

        long total = memoria.getTotal();

        String mostrarMemoria = String.format(
                "Memória total: %s",
                FormatUtil.formatBytes(total));

        return mostrarMemoria;
    }

    //CÓDIGO DA CPU
    
    public String verUsoCPU(CentralProcessor processador) {

        long cpu = hal.getProcessor().getVendorFreq();

        String mostrarFrequencia = String.format("Frequência Total da CPU: %s",
                FormatUtil.formatHertz(cpu));

        return mostrarFrequencia;
    }

    public String verThreads() {

        String mostrarThreads = String.format("Quantidade de Threads: %s",
                os.getThreadCount());

        return mostrarThreads;
    }

    public String verProcessador() {

        String mostrarModelo = String.format("Modelo do Processador: %s",
                hal.getProcessor());

        return mostrarModelo;
    }

    public String verPortasLogicas() {

        String mostrarPortas = String.format("Quantidade de portas lógicas: %s",
                hal.getProcessor().getLogicalProcessorCount());

        return mostrarPortas;
    }

    public String verQtdProcessos() {

        String mostrarQtdProcessos = String.format("Quantidade de Processos: %s",
                os.getProcessCount());

        return mostrarQtdProcessos;
    }
    
    //CÓDIGO DISCO
    
    public String verUsoDisco(){
        
        HWDiskStore[] disco = hal.getDiskStores();
        
        String mostrarUsoDisco = String.format("Uso do Disco: %s",disco );
        
        return mostrarUsoDisco;
    }
    
    public String verDiscoTeste(){
        
        String mostrarDisco = String.format("teste disco: %s",os.getProcess(0)
                .getBytesRead());
        
        return mostrarDisco;
    }
}
