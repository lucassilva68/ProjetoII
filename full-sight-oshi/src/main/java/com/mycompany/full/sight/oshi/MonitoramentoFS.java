/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.full.sight.oshi;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import oshi.util.FormatUtil;

public class MonitoramentoFS {
       
    SystemInfo si = new SystemInfo();
    OperatingSystem os = si.getOperatingSystem();
    HardwareAbstractionLayer hal = si.getHardware();
    
    public String verMemoriaDisponivel(GlobalMemory memoria){
        
        long disponivel = memoria.getAvailable();
        
        String mostrarMemoria = String.format(
                "Memória Disponível: %s",
                FormatUtil.formatBytes(disponivel));
        
        return mostrarMemoria;
        
    }
    
    public String verMemoriaTotal(GlobalMemory memoria){
        
        long total = memoria.getTotal();
        
        String mostrarMemoria = String.format(
                "Memória total: %s",
                FormatUtil.formatBytes(total));
        
        return mostrarMemoria;
    }
    
    
    
    public String verMemoriaUsada(GlobalMemory memoria){
        
        long memoriaUsada = memoria.getTotal() - memoria.getAvailable();
        
        String mostrarMemoriaUsada = String.format("Memória Utilizada: %s",
                FormatUtil.formatBytes(memoriaUsada));
        
        return mostrarMemoriaUsada;
    }
    
    public String verUsoCPU(CentralProcessor processador){
        
        long cpu = hal.getProcessor().getVendorFreq();

        String mostrarFrequencia = String.format("Frequência Total da CPU: %s",
                FormatUtil.formatHertz(cpu));
        
        return mostrarFrequencia;
    }
}
