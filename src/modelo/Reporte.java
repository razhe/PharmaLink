
package modelo;

public class Reporte {
    public String descripcion;
    public int id_usuario;

    public Reporte() {
    }
    
    public Reporte(String descripcion, int id_usuario) throws Exception {
        setDescripcion(descripcion);
        setId_usuario(id_usuario);
    }

    public String getDescripcion() {     
        return descripcion;
    }

    public void setDescripcion(String descripcion) throws Exception {
        if (descripcion.trim().length() > 500) {
            throw new Exception ("No puedes ingresar mas de 500 caracteres");
        }
        if (descripcion.trim().length() < 0) {
            throw new Exception("No dejes caracteres vacíos");
        }
        this.descripcion = descripcion;
    }

    public int getId_usuario() {
        return 2;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    
    
}
