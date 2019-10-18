/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.full.sight.oshi;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;

public class Teste{
	public static void main(String[] args) throws InterruptedException {
		OSProcess process;
		long currentTime,previousTime = 0,timeDifference;
		double cpu;
		int pid = 3080;
		SystemInfo si = new SystemInfo();
		OperatingSystem os = si.getOperatingSystem();
		CentralProcessor processor = si.getHardware().getProcessor();
		int cpuNumber = processor.getLogicalProcessorCount();
		boolean processExists = true;
		while (processExists) {
			process = os.getProcess(pid);
			if (process != null) {
				// CPU
				currentTime = process.getKernelTime() + process.getUserTime();
			
				if (previousTime != -1) {
					// If we have both a previous and a current time
					// we can calculate the CPU usage
					timeDifference = currentTime - previousTime;
					cpu = (100d * (timeDifference / ((double) 1000))) / cpuNumber;
					System.out.println(cpu);
				}     

				previousTime = currentTime;

				Thread.sleep(1000);
			} else {
				processExists = false;
			}
		}
	}
}
