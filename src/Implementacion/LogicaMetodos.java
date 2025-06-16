package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.Libros;
import Interface.Metodos;
import Interface.Metodos2;

public class LogicaMetodos implements Metodos, Metodos2 {

	private List<Libros> lista = new ArrayList<Libros>();

	// Validar: Que el titulo no se repita
	@Override
	public void guardar(Libros libro) {
		// TODO Auto-generated method stub

		boolean bandera = false;
		for (Libros l : lista) {
			if (l.getTitulo().equals(libro.getTitulo())) {
				System.out.println("Ese libro ya existe");
				bandera = true;
				break;
			}
		}

		if (!bandera) {
			lista.add(libro);
			System.out.println("Guardado correctamente");
		}

	}

	@Override
	public List<Libros> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Libros buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, Libros libro) {
		// TODO Auto-generated method stub
		lista.set(indice, libro);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

	@Override
	public Libros buscarXTitulo(String titulo) {
		// TODO Auto-generated method stub

		for (Libros l : lista) {
			if (l.getTitulo().equals(titulo)) {
				return l;
			}
		}

		return null;
	}

	@Override
	public List<Libros> buscarXAutor(String autor) {
		// TODO Auto-generated method stub

		List<Libros> listaNueva = new ArrayList<Libros>();

		for (Libros l : lista) {
			if (l.getAutor().equals(autor)) {
				listaNueva.add(l);
			}
		}

		return listaNueva;
	}

	@Override
	public void editarBuscaXtitu(String titulo, Libros libro) {
		// TODO Auto-generated method stub

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getTitulo().equals(titulo)) {
				lista.set(i, libro);
				System.out.println("Se edito");
				break;
			}
		}

	}

	public void eliminarBuscXtitulo(String titulo) {

		for (Libros l : lista) {
			if (l.getTitulo().equalsIgnoreCase(titulo)) {
				lista.remove(l);
				System.out.println("Se elimino");
				break;
			}
		}

	}

}
