import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<Conteudo> catalogo = new ArrayList <>();
		 
		 
		 
		Filme filme1 = new Filme();
		filme1.filme("Filme", "Os Vingadores", 143);
		catalogo.add(filme1);
		 
		Filme filme2 = new Filme();
		filme2.filme("Filme", "Jogos Vorazes", 142);
		catalogo.add(filme2);
					
		Filme filme3 = new Filme();
		filme3.filme("Filme", "10 coisas que eu odeio em você", 97);
		catalogo.add(filme3);
					
		Filme filme4 = new Filme();
		filme4.filme("Filme", "Mulher-Maravilha", 141);
		catalogo.add(filme4);	
					
		Filme filme5 = new Filme();
		filme5.filme("Filme", "Vermelho, branco e sangue azul", 118);
		catalogo.add(filme5);	
					
					
		//series
		Serie serie1 = new Serie();
		serie1.serie("Série", "The Vampire Diaries", 40, 171, 8);
		catalogo.add(serie1);
			
		Serie serie2 = new Serie();
		serie2.serie("Série", "De volta aos 15", 35, 18, 3);
		catalogo.add(serie2);
			
		Serie serie3 = new Serie();
		serie3.serie("Série", "Insatiable", 40, 22, 2);
		catalogo.add(serie3);
		
		Serie serie4 = new Serie();
		serie4.serie("Série", "The Originals", 40, 92, 5);
		catalogo.add(serie4);
			
		Serie serie5 = new Serie();
		serie5.serie("Série", "Arrow", 40, 170, 8);
		catalogo.add(serie5);	
		 
		
		//apresentação
		System.out.println("Seja bem-vindo a nossa plataforma de streaming!!");
		System.out.println("Confira abaixo o catálogo dos fimes e séries que estão bombando:");
		System.out.println();
		
		 
		 for(int i=0; i<10; i++) {
			 System.out.println(catalogo.get(i).descricao());
			 System.out.println();
		 }
		 
		 

	}

}
