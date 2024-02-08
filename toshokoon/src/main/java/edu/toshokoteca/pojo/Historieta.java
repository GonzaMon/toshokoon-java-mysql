package edu.toshokoteca.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="historieta")
public class Historieta {

    public Historieta() {
    }
    
    public Historieta(String nombre, String guionista, String artista, String editorial, int paginas,
            Date fecha_creacion, String region) {
        this.nombre = nombre;
        this.guionista = guionista;
        this.artista = artista;
        this.editorial = editorial;
        this.paginas = paginas;
        this.fecha_creacion = fecha_creacion;
        this.region = region;
    }
    @Id
    @Column(name="id")
    private int id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="guionista")
    private String guionista;

    @Column(name="artista")
    private String artista;

    @Column(name="editorial")
    private String editorial;

    @Column(name="paginas")
    private int paginas;

    @Column(name="fecha_creacion")
    private Date fecha_creacion;

    @Column(name="region")
    private String region;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getGuionista() {
        return guionista;
    }
    public void setGuionista(String guionista) {
        this.guionista = guionista;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public Integer getPaginas() {
        return paginas;
    }
    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }
    public Date getFecha_creacion() {
        return fecha_creacion;
    }
    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "historieta [nombre=" + nombre + ", guionista=" + guionista + ", artista=" + artista + ", editorial="
                + editorial + ", paginas=" + paginas + ", fecha_creacion=" + fecha_creacion + ", region=" + region
                + "]";
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    
}
