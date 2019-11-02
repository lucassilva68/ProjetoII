/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.full.sight.oshi;

//Bibliotecas do OSHI
import oshi.SystemInfo; //classe principal
import oshi.software.os.OperatingSystem; //classe de SO
import oshi.hardware.HardwareAbstractionLayer; //classe de hardware
import oshi.hardware.CentralProcessor; //classe de hardware para ver dados da cpu
import oshi.hardware.GlobalMemory; //classe de hardware para ver dados da RAM
import oshi.PlatformEnum; //classe para ver nome do SO
import oshi.util.FormatUtil; //classe para formatar valores para Bytes
//Biblioteca para ver espaço do disco
import java.io.File;
//Biblioteca para ver uso da CPU
import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;
import java.util.Arrays;
import java.util.List;
import org.springframework.jdbc.core.PreparedStatementSetter;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem.ProcessSort;

public class MonitoramentoFS {

    SystemInfo si = new SystemInfo();
    OperatingSystem os = si.getOperatingSystem();
    public HardwareAbstractionLayer hal = si.getHardware();
    
    String verMemoriaUsada;
    String verPorcentagem;
    String verDiscoUtilizado;

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

    public Integer verMemoriaUsada() {

        long memoriaUsada = hal.getMemory().getTotal()
                - hal.getMemory().getAvailable();

        Integer usada = (int) memoriaUsada;
        
        verMemoriaUsada = String.format("Memória usada: %s",
                FormatUtil.formatBytes(memoriaUsada));

        return usada;
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

    public Integer verPorcentagemCpu() {

        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(
                OperatingSystemMXBean.class);

        Double porcentagem = osBean.getSystemCpuLoad() * 100;
        
        Integer verUsoPorcentagem = porcentagem.intValue();

        verPorcentagem = String.format("Uso atual da CPU: %.0f",
                porcentagem);

        return verUsoPorcentagem;

    }

    public String printProcesses(OperatingSystem os, GlobalMemory memory) {

        List<OSProcess> procs = Arrays.asList(os.getProcesses(50, ProcessSort.CPU));
        String processos = "";
        for (int i = 0; i < procs.size() && i < 50; i++) {
            OSProcess p = procs.get(i);
            String listar = String.format(" %5d %5.1f %4.1f %s%n", p.getProcessID(),
                    100d * (p.getKernelTime() + p.getUserTime()) / p.getUpTime(),
                    100d * p.getResidentSetSize() / memory.getTotal(),
                    p.getName());

            for (OSProcess stringFinal : procs) {
                processos += stringFinal.toString() + "\r\n";

            }
        }
        return processos;
    }

    //CÓDIGO DISCO
    public String verEspacoLivre() {

        long livre = new File("C:").getFreeSpace();

        String mostrarEspacoLivre = String.format("Espaço livre: %s", livre
                / 1073741824 + " GB");

        return mostrarEspacoLivre;
    }

    public String verEspacoTotal() {

        long total = new File("C:").getTotalSpace();

        String mostrarDisco = String.format("Espaço total: %s", total
                / 1073741824 + " GB");

        return mostrarDisco;
    }

    public Integer verEspacoUtilizado() {

        long utilizado = new File("C:").getTotalSpace()
                - new File("C:").getFreeSpace();

        Integer verUtilizado = (int)utilizado;
        
        verDiscoUtilizado = String.format("Espaço utilizado: %s",
                utilizado / 1073741824 + " GB");

        return verUtilizado;
    }

    public PreparedStatementSetter verMemoriaUsada(GlobalMemory memory, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
