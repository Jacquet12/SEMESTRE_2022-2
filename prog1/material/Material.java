public class Material {
    private int codigo;
    private String nome;
    private int qdEmestoque; 

    public Material(int codigo, String nome, int qdEmestoque){
        this.codigo = codigo;
        this.nome = nome;
        this.qdEmestoque = qdEmestoque;
    }

    public Material(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.qdEmestoque = 0;
    }

    void setCodigo (int codigo){
        this.codigo = codigo;
    }

    public int getCodigo (){
        return this.codigo;
    }

    void setNome (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    void setQdEmestoque (int qdEmestoque){
        this.qdEmestoque = qdEmestoque;
    }

    public int getQdEmestoque(){
        return this.qdEmestoque;
    }

    public void retirar(int valor){
        this.qdEmestoque -= valor;
    }

    public void Abastecer (int qdvalor){
        this.qdEmestoque += qdvalor;
    }

    public void exibir(){
        System.out.print("Codigo: "+this.getCodigo()+"\t"+"Nome: "+this.getNome()+"\t"+"Quantidade: "+this.getQdEmestoque()+"\n");
    }

}