
package Entidades;

import InterfacesAlimentar.AlimentarCaballo;
import InterfacesAlimentar.AlimentarGato;
import InterfacesAlimentar.AlimentarPerro;



public class Animal<T> implements AlimentarPerro, AlimentarGato, AlimentarCaballo{
    
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void Alimentar(){}

    @Override
    public void AlimentarPerro(int kilos) {
        System.out.println("el perro se alimento"+ kilos + "kg" );
    }

    @Override
    public void AlimentarGato(int kl) {
        System.out.println("el gato alimento" + kl + "algo");
    }

    @Override
    public void AlimentarCaballo(int pasto) {
        if (pasto==0){
        System.out.println("el caballo no tiene hambre");
        } else {
            System.out.println("comio " + pasto + "pasto");
        }
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + '}';
    }

  
   

 
    
}
