import java.sql.Array;
import java.util.ArrayList;
import java.util.ArrayList;

public class CarteiraPrime {
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void addCliente(Cliente client){
        this.clientes.add(client);
    }

    public void listar (){
        for(int i = 0; i < clientes.size(); i ++){
            System.out.println("****LISTA DOS CLIENTES PRIMES***");
            System.out.println("Nome: "+clientes.get(i).getNome());
            System.out.println("CPF: "+clientes.get(i).getCpf());
        }
    }

    

}
