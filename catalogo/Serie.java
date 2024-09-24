
public class Serie extends Conteudo {
	private int duracao;
	private int quantEpisodios;
	private int quantTemps;
	
	//SET e GET 
	void setDuracao(int duracao) {
		this.duracao = duracao;
	}
			
	int getDuracao() {
		return this.duracao;
	}
	
	void setQuantEpisodios(int quantEpisodios) {
		this.quantEpisodios = quantEpisodios;
	}
			
	int getQuantEpisodios() {
		return this.quantEpisodios;
	}
	
	void setQuantTemps(int quantTemps) {
		this.quantTemps = quantTemps;
	}
			
	int getQuantTemps() {
		return this.quantTemps;
	}
	
	
	// Metodo
	

	void serie (String categoria, String titulo, int duracao, int quantEpisodios, int quantTemps) {
		super.setCategoria(categoria);
		super.setTitulo(titulo);
		this.duracao = duracao;
		this.quantEpisodios = quantEpisodios;
		this.quantTemps = quantTemps;
	}
	
	
	@Override
	String descricao() {
		System.out.println("Categoria: " + super.getCategoria());
		System.out.println("Titulo: " + super.getTitulo());
		System.out.println("Duração média dos episódios: " + getDuracao() + " minutos");
		System.out.println("Quantidade de episódios: " + getQuantEpisodios()+ " episódios no total");
		return "Quantidade de temporadas: " + getQuantTemps();
	}
	
	
}