import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        BaseMoedas baseMoedas = new BaseMoedas();
        escolhaConverterPara escolhaConverterPara = new escolhaConverterPara();
        escolhaQualMoeda escolhaQualMoeda = new escolhaQualMoeda();

        int opcao = 0;

        System.out.println("""
                ****************************************
                Seja bem vindo a conversões de moedas, para começar, selecione a 1 moeda que deseja converter. Para parar digite 9
                
                0. ARS - Peso argentino
                1. BOB - Boliviano boliviano
                2. BRL - Real brasileiro
                3. CLP - Peso chileno
                4. COP - Peso colombiano
                5. USD - Dólar americano
                ****************************************""");


        while (opcao != 9){
            opcao = leitura.nextInt();

            if (opcao == 9) {
                break;
            }

            if (opcao < -1 || opcao > 5) {
                System.out.println("ERRO: Você precisa selecionar uma opção de 0 a 6");
                break;
            }

            escolhaQualMoeda.escolhaConversao(opcao);


            System.out.println("""
                ****************************************
                Selecione a 2 moeda para conversão.
                
                0. ARS - Peso argentino
                1. BOB - Boliviano boliviano
                2. BRL - Real brasileiro
                3. CLP - Peso chileno
                4. COP - Peso colombiano
                5. USD - Dólar americano
                ****************************************""");

            opcao = leitura.nextInt();

            if (opcao == 9) {
                break;
            }

            if (opcao < -1 || opcao > 5) {
                System.out.println("ERRO: Você precisa selecionar uma opção de 0 a 6");
                break;
            }


            String moeda2 = escolhaConverterPara.converterPara(opcao);
            baseMoedas.converter(escolhaQualMoeda, moeda2);

            System.out.println(baseMoedas.getCotacaoMoeda());

            System.out.println("Qual a quantidade que deseja converter?");
            double valorConversao = leitura.nextDouble();

            System.out.println("""
                    De:                %s
                    Para:              %s
                    
                    Valor a converter: %.2f
                    Valor da cotação:  %.5f
                    Valor final:       %.2f""".formatted(escolhaQualMoeda, moeda2, valorConversao,baseMoedas.getCotacaoMoeda(), valorConversao*baseMoedas.getCotacaoMoeda()));
            break;

        }

        System.out.println("Sistemas finalizados com sucesso.");

    }
}