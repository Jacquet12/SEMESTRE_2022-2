public class Quadrado {
    private int lado;
    private static int erros = 0;

    public static int getErros() {
        return erros;
    }
    public static void setErros(int erros) {
        Quadrado.erros = erros;
    }
    public void setLado(int medidaDoLado){ 
		if (medidaDoLado > 0)
			lado = medidaDoLado;
		else
			erros++;
	} 
	public void exibeDados(){ 
		System.out.println("Lado: " + lado); 
	} 
	public static void msg(){
		System.out.println("Um quadrilátero");
	}
	public static void msg2(){
		System.out.println("Tentativas inválidas: "+erros);
	}
}
