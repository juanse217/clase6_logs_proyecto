package com.sebastian;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Empleado {
    private String name;
    private int age; 
    private double salary;
    private static Logger logger = LogManager.getLogger(Empleado.class);

    public Empleado(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        if(age < 18)
            logger.warn("El Empleado es menor de edad");
    } 


    public void aumentarSalario(double quantity){
        salary += quantity; 
    }

    @Override
    public String toString() {
        return "Empleado \n nombre: " + name + "\nage: " + age + "\nsalary:" + salary;
    }
    
}
