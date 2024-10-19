package respostas;

public class ContagemLetra {
    
    // Adaptado para contar qualquer letra passada por parâmetro e não só apenas a vogal "a"
    public static int contarLetra(String palavra, char letra){
        // Aqui inicia o contador
        int contador = 0;

        // Deixo a palavra passada por parâmetro em caixa b aixa e a transformo em um array do tipo "char"
        // Após isso percorro todo o array comparando a letra passada por parâmetro e cada letra da palavra
        for (char x : palavra.toLowerCase().toCharArray()) {
            // Se for igual adiciono 1 ao contador
            if (x == letra) {
                contador++;
            }
        }
        return contador;
    }

    
    public static void main(String[] args) {
        System.out.println(contarLetra("rgtdgdDD", 'd'));
    }
}
