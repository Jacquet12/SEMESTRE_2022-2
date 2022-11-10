public class MateriaTeste {
    public static void main(String agrs[]){
        
        Material material = new Material(12, "Livro", 30);

        material.exibir();
        material.Abastecer(40);
        material.exibir();
        material.retirar(10);
        material.exibir();

        System.out.println("segunda parte");

        Material material2 = new Material(20, "radio");
        material2.exibir();
        material2.Abastecer(40);
        material2.exibir();
        material2.retirar(5);
        material2.exibir();
    }
}
