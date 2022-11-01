import java.util.ArrayList;

public class Catalogo {
	private ArrayList<Livro> books = new ArrayList<Livro>();
	// catalogo eh composto por livros (relacao todo-parte). Os objetos livro tem existencia independente do catalogo (Agregacao)
	
	public void adicionar(Livro livro){
		this.books.add(livro);
	}
	
	public void remover(Livro livro){
		this.books.remove(livro);
	}
	
	public int verQuantidade(){
		return this.books.size();
	}

	public void verCatalogo(){
		System.out.println("\n\n*** Catalogo de livros ***");
		for(Livro item: books){
			System.out.println(item.getTitulo());
		}
		System.out.println("Total de livros: "+this.verQuantidade());
	}
}
