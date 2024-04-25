public class escolhaConverterPara {
        private String converterPara;


    public String converterPara(int opcao) {

        if (opcao == 0) {
            this.converterPara = "ARS";
            return "ARS";
        }

        if (opcao == 1) {
            this.converterPara = "BOB";
            return "BOB";
        }

        if (opcao == 2) {
            this.converterPara = "BRL";
            return "BRL";
        }

        if (opcao == 3) {
            this.converterPara = "CLP";
            return "CLP";
        }

        if (opcao == 4) {
            this.converterPara = "COP";
            return "COP";
        }

        if (opcao == 5) {
            this.converterPara = "USD";
            return "USD";
        }

        return "Nada Selecionado";
    }

    public String getConverterPara() {
        return converterPara;
    }
}
