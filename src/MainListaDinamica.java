public class MainListaDinamica {
    public static void main(String[] args) {
        ListaDinamica listaDinamica = new ListaDinamica();
        listaDinamica.adicionarElemento("Arroz");
        listaDinamica.adicionarElemento("Feijão");
        listaDinamica.adicionarElemento("Batata");
        listaDinamica.adicionarElemento("Alho");
        listaDinamica.adicionarElemento("Cebola");
        listaDinamica.removerElemento("Alho");
        listaDinamica.exibir();
        listaDinamica.limpar();
        listaDinamica.exibir();
        listaDinamica.adicionarElemento("Tomate");
        listaDinamica.adicionarElemento("Pepino");
        listaDinamica.adicionarElemento("Macarrão");
        listaDinamica.adicionarElemento("Pepino");
        listaDinamica.exibir();
        System.out.println("A lista possui " + listaDinamica.contar() + " elementos.");
        listaDinamica.adicionarElemento("Pepino");
        listaDinamica.adicionarElemento("Alface");
        System.out.println(listaDinamica.ultimoIndiceDe("Pepino")); //tem que retornar 4
        System.out.println(listaDinamica.obter(2)); //tem que retornar Macarrão
        System.out.println("O elemento aparece: " + listaDinamica.contarOcorrencias("Pepino") + " vezes"); // tem que retornar 3
        System.out.println("O elemento " + listaDinamica.removerPorIndice(1) + " foi removido.");
        listaDinamica.substituir("Pepino", "Abóbora");
        listaDinamica.exibir();
        String[] alimentos = {"Farinha", "Caqui", "Banana"};
        listaDinamica.adicionarVarios(alimentos);
        listaDinamica.exibir();
        listaDinamica.removerElemento("Alface");
        listaDinamica.exibir();

        listaDinamica.removerTodas("Abóbora");
        listaDinamica.exibir();
    }
}