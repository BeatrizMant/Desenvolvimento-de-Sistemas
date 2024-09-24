
public abstract class Conteudo {
	private String categoria;
	private String titulo;
	
	//SET e GET 
	void setCategoria(String categoria) {
		this.categoria = categoria;
	}
		
	String getCategoria() {
		return this.categoria;
	}
	
	void setTitulo(String titulo) {
		this.titulo = titulo;
	}
		
	String getTitulo() {
		return this.titulo;
	}
	
	String descricao() {
		System.out.println("Titulo: " + titulo);
		return "Categoria: " + categoria;
	}

}
