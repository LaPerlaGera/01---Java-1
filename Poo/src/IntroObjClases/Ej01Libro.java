package IntroObjClases;

public class Ej01Libro {
    /*Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
*/
    //atributos//
    private int ISBN;
    private String titulo;
    private String autor;
    private int numpag;

    //contructor//
    public Ej01Libro(int ISBN, String titulo, String autor, int numpag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numpag = numpag;
    }

    public Ej01Libro() {
    }
    
    //métodos//

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumpag() {
        return numpag;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }
    
    public String toString(){
        return "El libro "+titulo+" con ISBN "+ISBN+""
                + " creado por el autor "+autor
                +" tiene "+numpag+" páginas";
    }
    
}
