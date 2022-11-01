public class Livro {
	private String titulo;
	private int ano;
	private Editora editora; // para fazer associacao com um objeto Editora. Cada Livro "tem" uma unica editora. 
	private Autor autorPrincipal; // para fazer associacao com um objeto Autor. Cada livro "tem" um unico autor. 
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo(){
		return this.titulo;
	}	
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno(){
		return this.ano;
	}	
	
	public void setEditora(Editora ed) {
		this.editora = ed; // efetiva a associacao com objeto da classe Editora já existente
	}
	
	public Editora getEditora(){
		return this.editora;			
	}
	
	public Autor getAutorPrincipal() {
		return autorPrincipal;
	}

	public void setAutorPrincipal(Autor autorPrincipal) {
		this.autorPrincipal = autorPrincipal; // efetiva a associacao com objeto da classe Autor já existente
	}
	
	public String toString(){
		return this.autorPrincipal.getNome().toUpperCase()+". "+this.titulo+". Editora "+editora.getNome()+", "+this.ano;
		// como estamos acessando getNome do objeto autor e tambem da editora, se tentarmos criar um livro sem autor e/ou sem editora, teremos uma NullPointer Exception no codigo acima
		// visto que estaremos tentando chamar getNome de uma variavel de referencia que não aponta para nenhum objeto (ou seja, cujo conteudo eh null)
	}
}
