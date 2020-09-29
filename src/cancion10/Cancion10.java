package Cancion10;

import java.util.Date;



public class Cancion10 {

    private String nombre;
    private int parrafos;
    private Date instrumentosMusicales;
    private String generos;
    private Boolean voces;
    
    
   
    public Cancion10(String nombre,
            int parrafos,
            Date instrumentosMusicales,
            String generos, Boolean voces) {
        this.nombre = nombre;
        this.parrafos = parrafos;
        this.instrumentosMusicales = instrumentosMusicales;
        this.generos = generos;
        this.voces = voces;
        
        
        
    }

    private Cancion10(String cancion_wap, int par, Date date, String pop_y_rap, int par1) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
    
   /**
    * El Método nos ayuda a definir los parrafos de la canción
    */
    public void NúmerodeParrafos(){
        this.parrafos +=9;
    }

    /** El método nos ayuda a verificar los tipos de instrumentos y voces
     * que existen en la canción
     */
        public void  Caracteristicas(
                String nuevosGeneros,
                String nuevoNombre){
            this.generos = nuevosGeneros;
            this.nombre = nuevoNombre;
     
        }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getParrafos() {
        return parrafos;
    }

    public void setParrafos(int parrafos) {
        this.parrafos = parrafos;
    }

    public Date getInstrumentosMusicales() {
        return instrumentosMusicales;
    }

    public void setInstrumentosMusicales(Date instrumentosMusicales) {
        this.instrumentosMusicales = instrumentosMusicales;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public Boolean getVoces() {
        return voces;
    }

    public void setVoces(Boolean voces) {
        this.voces = voces;
    }
    
    public static void main(String[] args) {
        Cancion10 cancionUno = new Cancion10(
                "Cancion wap",
                9, 
                new Date(),"pop y rap",
                 2);
        
        Cancion10 cancionDos  = new Cancion10(
                "Cancion Cafune",
                10, 
                new Date(),"reguetton y rap",
                3);
        
        System.out.println(cancionUno.getNombre());
        System.out.println(cancionUno.getParrafos());
        
        cancionUno.NúmerodeParrafos();
        
        System.out.println(cancionUno.getNombre());
        System.out.println(cancionUno.getParrafos());
    }
    
}

