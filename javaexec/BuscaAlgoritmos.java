public class BuscaAlgoritmos {

    // Busca Linear em vetor não ordenado
    public static int buscaLinearNaoOrdenado(int[] array, int alvo) {
        // Percorre cada elemento do vetor
        for (int i = 0; i < array.length; i++) {
            // Se encontrar o alvo, retorna o índice
            if (array[i] == alvo) {
                return i;
            }
        }
        // Retorna -1 se não encontrar
        return -1;
    }

    // Busca Linear em vetor ordenado
    public static int buscaLinearOrdenado(int[] array, int alvo) {
        // Percorre o vetor ordenado
        for (int i = 0; i < array.length; i++) {
            if (array[i] == alvo) {
                return i;
            }
            // Se o elemento atual for maior que o alvo, interrompe a busca (vetor está ordenado)
            if (array[i] > alvo) {
                break;
            }
        }
        return -1;
    }

    // Busca Binária em vetor ordenado
    public static int buscaBinaria(int[] array, int alvo) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calcula o meio para evitar overflow

            if (array[mid] == alvo) {
                return mid; // Retorna o índice se encontrar
            } else if (array[mid] < alvo) {
                left = mid + 1; // Busca na metade direita
            } else {
                right = mid - 1; // Busca na metade esquerda
            }
        }
        return -1; // Alvo não encontrado
    }
}
