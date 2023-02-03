
public class TestConexion {
	public static void main(String[] args) throws Exception {
		
		/*
		 * Con try con recursos, abre, inicializa y/o instancia un objeto pero éste debe implementar la interface AutoCloseable y ésta última te obliga a implementar un método close();, ¿Porque? al finalizar la ejecución de las tareas, va a llamar al método de la interface llamado close(); y en éste nosotros le establecimos que llamé al método cerrar(); de la clase conexion. Es decir, con ésto establecemos un funcionamiento por defecto en todas las operaciones sin importar de su resultado parecido al bloque finally pero sin tanto código spaguetti.
		 */
		try(Conexion con = new Conexion()){//Ésto es un recurso, luego de las operaciones voy a cerrar
			con.leerDatos();
		}catch(IllegalStateException ex) {
			System.out.println("Ejecutando catch");
			ex.printStackTrace();
		}
		
		/*
		Conexion con = null;
		try {
			con = new Conexion();
			con.leerDatos();
		} catch (IllegalStateException ex) {
			ex.printStackTrace();
		}finally {
			con.cerrar();
		}
		*/
	}
}
