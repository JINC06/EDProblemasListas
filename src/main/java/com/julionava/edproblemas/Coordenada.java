/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julionava.edproblemas;

/**
 *
 * @author julio.nava
 */
public class Coordenada implements Comparable<Coordenada> {
    
    private String nombreUbicacion;
    
    private double latitud;
    private double longitud;
    
    private double distancia;

    public Coordenada(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Coordenada(String nombreUbicacion, double latitud, double longitud) {
        this.nombreUbicacion = nombreUbicacion;
        this.latitud = latitud;
        this.longitud = longitud;
    }
    

    /**
     * @return the latitud
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * @param latitud the latitud to set
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    /**
     * @return the longitud
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * @param longitud the longitud to set
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
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

    /**
     * @return the nombreUbicacion
     */
    public String getNombreUbicacion() {
        return nombreUbicacion;
    }

    /**
     * @param nombreUbicacion the nombreUbicacion to set
     */
    public void setNombreUbicacion(String nombreUbicacion) {
        this.nombreUbicacion = nombreUbicacion;
    }
    
    public void calcularDistancia(Coordenada miUbicacion) {
        double lat1rad = Math.toRadians(this.latitud);
        double lon1rad = Math.toRadians(this.longitud);
        double lat2rad = Math.toRadians(miUbicacion.getLatitud());
        double lon2rad = Math.toRadians(miUbicacion.getLongitud());

        double difLatitud = lat1rad - lat2rad;
        double difLongitud = lon1rad - lon2rad;

        double a = Math.pow(Math.sin(difLatitud/2), 2) +
                Math.cos(lat1rad) *
                Math.cos(lat2rad) *
                Math.pow(Math.sin(difLongitud/2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        double radioTierraKm = 6378.0;
        double distanciaKm = radioTierraKm * c;

        this.distancia = distanciaKm;
    }

    @Override
    public String toString() {
        String val = this.nombreUbicacion + " --> ["+this.latitud+","+this.longitud+"]";
        return val;
    }

    @Override
    public int compareTo(Coordenada o) {
        return Double.compare(this.distancia, o.getDistancia());
    }
    
    
    
}
