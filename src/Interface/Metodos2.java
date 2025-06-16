package Interface;

import java.util.List;

import Dominio.Libros;

public interface Metodos2 {

	public Libros buscarXTitulo(String titulo);

	public List<Libros> buscarXAutor(String autor);

	public void editarBuscaXtitu(String titulo, Libros libro);
	
}
