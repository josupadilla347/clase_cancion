package com.example;

public class Cancion {
    //definir atributos privados
private String titulo;
private String artista;
private int duracion;
private String genero;
private String album;
}
 // Constante estática
 private static final int SEGUNDOS_POR_MINUTO = 60;

 // Constructor por defecto
 public Cancion() {
     this.titulo = "Desconocido";
     this.artista = "Desconocido";
     this.duracion = 0;
     this.genero = "Desconocido";
     this.album = "Desconocido";
 }

 // Constructor con parámetros
 public Cancion(String titulo, String artista, int duracion) {
     this.titulo = titulo;
     this.artista = artista;
     this.duracion = duracion;
     this.genero = "Desconocido";
     this.album = "Desconocido";
 }

 // Métodos setter y getter
 public void setTitulo(String titulo) {
     this.titulo = titulo;
 }

 public String getTitulo() {
     return titulo;
 }

 public void setArtista(String artista) {
     this.artista = artista;
 }

 public String getArtista() {
     return artista;
 }

 public void setDuracion(int duracion) {
     this.duracion = duracion;
 }

 public int getDuracion() {
     return duracion;
 }

 public void setGenero(String genero) {
     this.genero = genero;
 }

 public String getGenero() {
     return genero;
 }

 public void setAlbum(String album) {
     this.album = album;
 }

 public String getAlbum() {
     return album;
 }

 // Método privado para calcular duración en minutos
 private int calcularDuracionMinutos() {
     return duracion / SEGUNDOS_POR_MINUTO;
 }

 // Método para mostrar información sin parámetros
 public void mostrarInformacion() {
     System.out.println("Título: " + titulo);
     System.out.println("Artista: " + artista);
     System.out.println("Duración: " + duracion + " segundos (" + calcularDuracionMinutos() + " minutos)");
     System.out.println("Género: " + genero);
     System.out.println("Álbum: " + album);
 }

 // Sobrecarga del método mostrarInformacion con parámetro
 public void mostrarInformacion(String usuario) {
     mostrarInformacion(); // Llama al método sin parámetros
     System.out.println("Escuchado por: " + usuario);
 }

