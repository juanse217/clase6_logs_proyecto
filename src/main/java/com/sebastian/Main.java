package com.sebastian;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        
        logger.info("Starting app");
        Empleado empleado = new Empleado("juan", 10, 1000000);
        Gerente gerente = new Gerente("juan", 10, 1000000, "Sales");
        logger.info("Informacion del empleado " + empleado);
        logger.info("Informacion del gerente " + gerente);

        empleado.aumentarSalario(10000);
        gerente.aumentarSalario(10000);

        logger.info("Info: " + empleado);
        logger.info("Info: " + gerente);

        logger.info("Programa finalizado");
        logger.trace("Tracing message");
        logger.debug("Debugging");
        logger.error("Mensaje de error ");
        logger.fatal("Mensaje fatal");
     
    }
}