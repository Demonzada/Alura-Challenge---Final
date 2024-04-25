public class escolhaQualMoeda {
        private String moedaParaConversao;


    public String escolhaConversao(int opcao) {

        if (opcao == 0) {
            this.moedaParaConversao = "ARS";
            return "ARS";
        }

        if (opcao == 1) {
            this.moedaParaConversao = "BOB";
            return "BOB";
        }

        if (opcao == 2) {
            this.moedaParaConversao = "BRL";
            return "BRL";
        }

        if (opcao == 3) {
            this.moedaParaConversao = "CLP";
            return "CLP";
        }

        if (opcao == 4) {
            this.moedaParaConversao = "COP";
            return "COP";
        }

        if (opcao == 5) {
            this.moedaParaConversao = "USD";
            return "USD";
        }

        return "Nada Selecionado";
    }

    public String getEscolhaConversao() {
        return moedaParaConversao;
    }

    @Override
    public String toString() {
        return moedaParaConversao;
    }
}
