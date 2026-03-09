import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        ListaSimples listaSimples = new ListaSimples(5);
        Scanner input = new Scanner(System.in);

        listaSimples.adicionarElemento("Kinder Bueno");
        listaSimples.exibirElementos();

        System.out.println("Deseja procurar por qual índice?");
        int indice = input.nextInt();
        System.out.println(listaSimples.obter(indice));
        listaSimples.adicionarElemento("Nuggets");
        listaSimples.adicionarElemento("Pepsi Black");
        listaSimples.exibirElementos();
        /* listaSimples.limpar(); */
        listaSimples.exibirElementos();
        System.out.println("A lista possui " + listaSimples.contar() + " elementos válidos!");
        System.out.println("Digite o índice de qual elemento deseja remover: ");
        int indice2 = input.nextInt();
        listaSimples.removerPorIndice(indice2);
        listaSimples.exibirElementos();

    }
}