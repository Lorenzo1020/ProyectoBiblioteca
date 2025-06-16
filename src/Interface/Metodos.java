package Interface;

import java.util.List;

import Dominio.Libros;

public interface Metodos {

	public void guardar(Libros libro);

	public List<Libros> mostrar();

	public Libros buscar(int indice);

	public void editar(int indice, Libros libro);

	public void eliminar(int indice);

}
