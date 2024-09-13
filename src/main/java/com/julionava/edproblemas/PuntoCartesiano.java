/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julionava.edproblemas;

/**
 *
 * @author julio.nava
 */
public class PuntoCartesiano implements Comparable<PuntoCartesiano> {
    
    private int x;
    private int y;
    
    private double distancia;

    public PuntoCartesiano(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the distancia
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    public void calcularDistanciaACentro() {
        
        // declare the variables
        int x1 = this.x;
        int x2 =  0;
        int y1 = this.y;
        int y2 = 0;
        int x;
        int y;
        
        // Implement pythagorean theorem
        x = x2 - x1;
        y = y2 - y1;
        
        this.distancia = Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        String value = "["+this.x+","+this.y+"]";
        return value;
    }

    /*
    -1  1  0
    */
    @Override
    public int compareTo(PuntoCartesiano o) {
        return Double.compare(this.distancia, o.getDistancia());
    }

    
    
    
}
