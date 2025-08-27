package com.sebastian;

public class Gerente extends Empleado {
    private String department;

    public Gerente(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department; 
    }

    @Override
    public String toString() {
        return "Gerente\ndepartment: " + department +   super.toString();
    }

    
}
