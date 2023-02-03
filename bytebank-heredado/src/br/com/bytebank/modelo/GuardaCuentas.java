package br.com.bytebank.modelo;


public class GuardaCuentas {
	//Crear un objeto para guardar muchas cuentas
	//Permitirnos  agregar cuentas con un metodo
	//guardaCuentas.adiciona();
	//obtener, remover, etc.
	
	Object[] objetos = new Object[10];
	int indice = 0;
	
	public void adicionar(Object object) {
		objetos[indice] = object;
		indice++;
	}
	public Object obtener(int indice) {
		return objetos[indice];
	}
}
