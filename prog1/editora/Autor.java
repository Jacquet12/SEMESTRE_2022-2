public class Autor {
	private String nome;
	private Endereco end;
	
	public Autor(String nome){
		this.nome=nome;
		this.end = new Endereco(); // endereco eh criado e manipulado por Autor, ou seja, faz parte do autor (relacao todo-parte) e nao tem existencia fora do objeto autor (Composicao)
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setEndereco(String logradouro, String cidade, String uf){
		this.end.setLogradouro(logradouro);
		this.end.setCidade(cidade);
		this.end.setUf(uf);	
	}

	public String getEndereco() {
		return end.getLogradouro()+", "+end.getCidade()+" - "+end.getUf();
	}
	
	
}

