import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        int parametroUm = entrarComNumeroParametroUm();
        int parametroDois = entrarComNumeroParametroDois();

        try {
            //chamando o método contendo a lógica de contagem

            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());

            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }

    }

    static int entrarComNumeroParametroUm() {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
          return terminal.nextInt();
    }

    static int entrarComNumeroParametroDois() {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o segundo parâmetro");
        return terminal.nextInt();
    }




    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
           throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }


        //realizar o for para imprimir os números com base na variável contagem
        for(int i = parametroUm; i <= parametroDois; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }



}
