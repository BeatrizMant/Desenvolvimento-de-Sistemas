
public class Filme extends Conteudo {
	private int duracao;
	
	//set e get
	void setDuracao(int duracao) {
		this.duracao = duracao;
	}
			
	int getDuracao() {
		return this.duracao;
	}
	
	void filme (String categoria, String titulo, int duracao) {
		super.setCategoria(categoria);
		super.setTitulo(titulo);
		this.duracao = duracao;
	}
	
	
	@Override
	String descricao() {
		System.out.println("Categoria: " + super.getCategoria());
		System.out.println("Titulo: " + super.getTitulo());
		return "Duração: " + getDuracao() + " minutos";
	}
	
	
}
