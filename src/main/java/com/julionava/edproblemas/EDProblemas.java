/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.julionava.edproblemas;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author julio.nava
 */
public class EDProblemas {

    public static void main(String[] args) {
        
        //planoCartesiano();
        
        
        geolocalizacion();
    }
    
    
    public static void planoCartesiano() {
        
        /*int k = 1;
        ArrayList<PuntoCartesiano> listadoDePuntos = new ArrayList<>();
        listadoDePuntos.add(new PuntoCartesiano(1, 3));
        listadoDePuntos.add(new PuntoCartesiano(3, 4));
        listadoDePuntos.add(new PuntoCartesiano(5, 6));*/
        
        int k = 2;
        ArrayList<PuntoCartesiano> listadoDePuntos = new ArrayList<>();
        listadoDePuntos.add(new PuntoCartesiano(13, -8));
        listadoDePuntos.add(new PuntoCartesiano(1, 20));
        listadoDePuntos.add(new PuntoCartesiano(-5, 5));
        
        
        for (PuntoCartesiano punto : listadoDePuntos) {
            punto.calcularDistanciaACentro();
            System.out.println( punto.toString() + " --> Distancia: " + punto.getDistancia() );
        }
        
        Collections.sort(listadoDePuntos);
        
        System.out.println("---------- Lista Ordenada -------------");
        for (PuntoCartesiano punto : listadoDePuntos) {
            System.out.println( punto.toString() + " --> Distancia: " + punto.getDistancia() );
        }
        
        PuntoCartesiano[] respuesta = new PuntoCartesiano[k];
        for(int i = 0; i < k; i++){
            respuesta[i] = listadoDePuntos.get(i);
        }
        
        System.out.println("----------------------------------------");
        
        System.out.print("Respuesta: [");
        for (PuntoCartesiano puntoRespuesta : respuesta) {
            System.out.print(puntoRespuesta.toString());
        }
        System.out.print("]");
        System.out.println();
        
    }
    
    public static void geolocalizacion() {
        
        
        //CITEV
        Coordenada miUbicacion = new Coordenada("CITEV", 27.96763165093526, -110.91867989007632);
        
        //Cinemex
        //Coordenada miUbicacion = new Coordenada("Cinemex", 27.92922161285947, -110.92491267491029);
        
        //Coppel Ley Vigia
        //Coordenada miUbicacion = new Coordenada("Coppel El Vigia", 27.926399659574223, -110.91968208684614);
        
        ArrayList<Coordenada> listadoCaffenios = new ArrayList<>();
        listadoCaffenios.add(new Coordenada("Caffenio Delicias", 27.92528110, -110.90919100));
        listadoCaffenios.add(new Coordenada("Soriana Guaymas", 27.91841700, -110.91379600));
        listadoCaffenios.add(new Coordenada("Caffenio Mar de Cortes Guaymas", 27.94592100, -110.93350600));
        listadoCaffenios.add(new Coordenada("Caffenio Loma Linda", 27.93259400, -110.92604600));
        listadoCaffenios.add(new Coordenada("Caffenio Miramar", 27.92710000, -110.93040000));
        
        System.out.println("---------- Recorriendo cada punto y calculando la distancia -------------");   
        for (Coordenada caffenio : listadoCaffenios) {
            caffenio.calcularDistancia(miUbicacion);
            System.out.println(caffenio.toString() + "  Distancia: " +caffenio.getDistancia()+ " KM");
        }
        
        
        Collections.sort(listadoCaffenios);
        System.out.println();
        System.out.println("---------- Ubicaciones ordenadas por distancia -------------");        
        for (Coordenada caffenio : listadoCaffenios) {
            System.out.println(caffenio.toString() + "  Distancia: " +caffenio.getDistancia()+ " KM");
        }
        
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("La tienda mas cercana a " + miUbicacion.getNombreUbicacion() + ": ");
        System.out.println(listadoCaffenios.get(0).getNombreUbicacion());
        
    }
}
