package Main;

import java.util.Scanner;

import Dominio.Libros;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Reserva de espacio en memoria
		Scanner lectura = null;

		String titulo;
		int anioPubli;
		String autor;
		int numPag, menuPrin, indice;
		float precio;

		Libros libro;

		LogicaMetodos imp = new LogicaMetodos();

		do {
			System.out.println("Menu principal");
			System.out.println("1---Alta");
			System.out.println("2---Mostrar");
			System.out.println("3---Buscar");
			System.out.println("4---Editar");
			System.out.println("5---Eliminar");
			System.out.println("6---Buscar por titulo");
			System.out.println("7---Buscar por autor");
			System.out.println("8---Editar(precio) buscando por titulo");
			System.out.println("9---Eliminar buscando por titulo");
			System.out.println("10---Salir");

			lectura = new Scanner(System.in);
			menuPrin = lectura.nextInt();

			switch (menuPrin) {
			case 1:
				try {
					System.out.println("Ingrese el titulo");
					lectura = new Scanner(System.in);
					titulo = lectura.nextLine();

					System.out.println("Ingrese el año de publicacion");
					lectura = new Scanner(System.in);
					anioPubli = lectura.nextInt();

					System.out.println("Ingresa el autor");
					lectura = new Scanner(System.in);
					autor = lectura.nextLine();

					System.out.println("Ingrese numero de paginas");
					lectura = new Scanner(System.in);
					numPag = lectura.nextInt();

					System.out.println("Ingrese el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();

					// Crear el objeto
					libro = new Libros(titulo, anioPubli, autor, numPag, precio);

					// Agregar a la lista
					imp.guardar(libro);

				} catch (Exception e) {
					// TODO: handle exception

					System.out.println("Error al guardar " + e.getMessage());
				}
				break;
			case 2:
				if (imp.mostrar().size() > 0)
					System.out.println(imp.mostrar());
				else
					System.out.println("No hay reegistros");

				break;
			case 3:
				try {
					System.out.println("Ingrese el indice del registro a buscar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Buscar
					libro = imp.buscar(indice);
					System.out.println("Se encontro " + libro);

				} catch (Exception e) {
					// TODO: handle exception

					System.out.println("Ese indice no existe");
				}
				break;
			case 4:
				try {
					System.out.println("Ingrese el indice del registro a editar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Buscar
					libro = imp.buscar(indice);
					System.out.println("Se encontro " + libro.getTitulo());

					// Editar el autor
					System.out.println("Ingresa el nuevo nombre del autor");
					lectura = new Scanner(System.in);
					autor = lectura.nextLine();

					// Actualizar el objeto
					libro.setAutor(autor);

					// Actualizar en la lista
					imp.editar(indice, libro);
					System.out.println("Se edito con exito");

				} catch (Exception e) {
					// TODO: handle exception

					System.out.println("Ese indice del registro no existe");
				}
				break;
			case 5:
				try {
					System.out.println("Ingrese el indice del registro a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Eliminacion
					imp.eliminar(indice);
					System.out.println("Se elimino con exito");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Ese registro no existe");
				}
				break;
			case 6:
				System.out.println("Ingresa el titulo del libro a buscar");
				lectura = new Scanner(System.in);
				titulo = lectura.nextLine();

				// Buscar
				libro = imp.buscarXTitulo(titulo);

				if (libro != null)
					System.out.println(libro);
				else
					System.out.println("No existe ese libro");
				break;
			case 7:
				System.out.println("Ingrese el autor");
				lectura = new Scanner(System.in);
				autor = lectura.nextLine();

				// Buscar
				if (imp.buscarXAutor(autor).size() > 0)
					System.out.println(imp.buscarXAutor(autor));
				else
					System.out.println("No hay registros de ese autor");
				break;
			case 8:
				System.out.println("Ingresa el titulo del libro que deseas editar");
				lectura = new Scanner(System.in);
				titulo = lectura.nextLine();

				// Buscar
				libro = imp.buscarXTitulo(titulo);

				if (libro != null) {
					// Actualizar
					try {
						System.out.println("Ingrese el nuevo precio");
						lectura = new Scanner(System.in);
						precio = lectura.nextFloat();

						// Actualizar el objeto
						libro.setPrecio(precio);

						// Actualizar en la lista
						imp.editarBuscaXtitu(titulo, libro);

					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Error al editar");
					}

				} else
					System.out.println("Ese titulo de libro no existe para editar");

				break;
			case 9:

				System.out.println("Ingresa el titulo del libro que deseas eliminar");
				lectura = new Scanner(System.in);
				titulo = lectura.nextLine();

				// Eliminar
				imp.eliminarBuscXtitulo(titulo);

				break;
			case 10:
				break;
			}

		} while (menuPrin < 10);

	}

}
