    public class Main {
        public static void main(String[] args) {
            // Arrays para teste
            int[] arrayNaoOrdenado = {5, 3, 8, 1};
            int[] arrayOrdenado = {1, 3, 5, 8};

            // Testes para Busca Linear (não ordenado)
            System.out.println("--- Busca Linear (NÃO ORDENADO) ---");
            testarBusca(arrayNaoOrdenado, 5, BuscaAlgoritmos::buscaLinearNaoOrdenado); // Alvo no início
            testarBusca(arrayNaoOrdenado, 8, BuscaAlgoritmos::buscaLinearNaoOrdenado); // Alvo no meio
            testarBusca(arrayNaoOrdenado, 1, BuscaAlgoritmos::buscaLinearNaoOrdenado); // Alvo no fim
            testarBusca(arrayNaoOrdenado, 2, BuscaAlgoritmos::buscaLinearNaoOrdenado); // Alvo ausente

            // Testes para Busca Linear (ordenado)
            System.out.println("\n--- Busca Linear (ORDENADO) ---");
            testarBusca(arrayOrdenado, 1, BuscaAlgoritmos::buscaLinearOrdenado); // Alvo no início
            testarBusca(arrayOrdenado, 5, BuscaAlgoritmos::buscaLinearOrdenado); // Alvo no meio
            testarBusca(arrayOrdenado, 8, BuscaAlgoritmos::buscaLinearOrdenado); // Alvo no fim
            testarBusca(arrayOrdenado, 4, BuscaAlgoritmos::buscaLinearOrdenado); // Alvo ausente (entre elementos)
            testarBusca(arrayOrdenado, 0, BuscaAlgoritmos::buscaLinearOrdenado); // Alvo menor que todos
            testarBusca(arrayOrdenado, 9, BuscaAlgoritmos::buscaLinearOrdenado); // Alvo maior que todos

            // Testes para Busca Binária
            System.out.println("\n--- Busca Binária (ORDENADO) ---");
            testarBusca(arrayOrdenado, 3, BuscaAlgoritmos::buscaBinaria); // Alvo no meio
            testarBusca(arrayOrdenado, 1, BuscaAlgoritmos::buscaBinaria); // Alvo no início
            testarBusca(arrayOrdenado, 8, BuscaAlgoritmos::buscaBinaria); // Alvo no fim
            testarBusca(arrayOrdenado, 4, BuscaAlgoritmos::buscaBinaria); // Alvo ausente
        }

        // Método auxiliar para executar os testes
        private static void testarBusca(int[] array, int alvo, BuscaMetodo metodo) {
            int resultado = metodo.buscar(array, alvo);
            if (resultado != -1) {
                System.out.println("Alvo " + alvo + " encontrado no índice: " + resultado);
            } else {
                System.out.println("Alvo " + alvo + " não encontrado.");
            }
        }

        // Interface funcional para generalizar os métodos de busca
        interface BuscaMetodo {
            int buscar(int[] array, int alvo);
        }
    }