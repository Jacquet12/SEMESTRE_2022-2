class LivroTeste {
	public static void main(String[] args) {
		//criando editora
		Editora ed1 = new Editora();
		ed1.setNome("Pearson");
		ed1.setCnpj("123456");

		//criando autores
		Autor a1 = new Autor("Andressa Sebben");
		Autor a2 = new Autor("Bill Gates");
		a2.setEndereco("Rua Z, 123", "São paulo", "SP");
		
		//criando livros
		Livro l1  = new Livro();
		l1.setTitulo("Java: Como Programar");
		l1.setAno(2011);
		l1.setEditora(ed1);	
		l1.setAutorPrincipal(a1);
		System.out.println(l1);
				
		Livro l2 = new Livro();
		l2.setTitulo("Banco de dados");
		l2.setAno(2006);
		l2.setEditora(ed1);
		l2.setAutorPrincipal(a2);
		System.out.println(l2);
		
		Livro l3 = new Livro();
		l3.setTitulo("Mac OS");
		l3.setAno(2015);
		l3.setEditora(ed1);
		l3.setAutorPrincipal(new Autor("Steve Jobs")); // tambem eh possivel criar o autor dentro de outro metodo. Mas neste caso, nao teriamos como associar Steve Jobs a outro livro, pois nao guardamos sua referencia em uma variavel!
		System.out.println(l3);
		
		//criando catalogo e adicionando os livros
		Catalogo cat = new Catalogo();
		cat.adicionar(l1);
		cat.adicionar(l2);
		cat.adicionar(l3);
		cat.verCatalogo();
	}
}
