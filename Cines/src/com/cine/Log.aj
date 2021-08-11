package com.cine;

import java.io.File;
import java.util.Calendar;
import java.io.BufferedWriter;
import java.io.FileWriter;

import java.util.Date;


public aspect Log {
			File file = new File("users.txt");
			Calendar cal = Calendar.getInstance();
			java.util.Date fecha = new Date();
			BufferedWriter bw;
	    pointcut success() : call(* create*(..) );
	    after() : success() {
	    	System.out.println("**** Usuario Creado con Exito ****");
	    	try {
	            if (!file.exists()) {
	                file.createNewFile();
	            }
	            FileWriter fw = new FileWriter(file,true);
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.write("Reserva Creada para usuario con Nombre: " +Cine.nombre1 +", ID: "+Cine.id1+
	            		", Asiento: "+Cine.asiento1+ ", Funcion: "+Cine.funcion1 +", En la fecha: "+fecha + " \n");
	            bw.close();
	           
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
}
