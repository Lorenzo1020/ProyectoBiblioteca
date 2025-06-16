package Dominio;

public class Libros {

	private String titulo;
	private int anioPubli;
	private String autor;
	private int numPag;
	private float precio;

	public Libros(String titulo, int anioPubli, String autor, int numPag, float precio) {
		this.titulo = titulo;
		this.anioPubli = anioPubli;
		this.autor = autor;
		this.numPag = numPag;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libros [titulo=" + titulo + ", anioPubli=" + anioPubli + ", autor=" + autor + ", numPag=" + numPag
				+ ", precio=" + precio + "]\n";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnioPubli() {
		return anioPubli;
	}

	public void setAnioPubli(int anioPubli) {
		this.anioPubli = anioPubli;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
