/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.modelo;

/**
 *
 * @author Usuario
 */
public abstract class Pregunta {

    private int numeroPregunta;  //Dice número de ubicación de la pregunta
    private String enunciadoPregunta; //Dice enunciado de la pregunta
    private int puntajeObtenidoPregunta; //Puntaje de 0-100, -1 si no está calificada aún
    private int pesoPregunta;    //Peso de pregunta para ponderar en prueba
    //
    public int getNumeroPregunta() {
        return numeroPregunta;
    }

    public String getDescripcionPregunta() {
        return enunciadoPregunta;
    }

    public int getPuntajeObtenidoPregunta() {
        return puntajeObtenidoPregunta;
    }

    public int getPesoPregunta() {
        return pesoPregunta;
    }

    public void setNumeroPregunta(int numeroPregunta) {
        this.numeroPregunta = numeroPregunta;
    }

    public void setDescripcionPregunta(String descripcionPregunta) {
        this.enunciadoPregunta = descripcionPregunta;
    }

    public void setPuntajeObtenidoPregunta(int puntajeObtenidoPregunta) {
        this.puntajeObtenidoPregunta = puntajeObtenidoPregunta;
    }

    public void setPesoPregunta(int pesoPregunta) {
        this.pesoPregunta = pesoPregunta;
    }

    
}
