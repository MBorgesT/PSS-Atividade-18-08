
abstract class ImpostoHandler {

    protected ImpostoHandler proximo;

    public void setSucessor(ImpostoHandler handler) {
        this.proximo = handler;
    }

    public abstract double calcularImposto(double valor);

}

class ImpostoSimples extends ImpostoHandler {

    @Override
    public double calcularImposto(double valor) {
        double novoValor = valor * 1.1;
        if (proximo == null) {
            return novoValor;
        } else {
            return proximo.calcularImposto(novoValor);
        }
    }
}

class ImpostoComplexo extends ImpostoHandler {

    @Override
    public double calcularImposto(double valor) {
        if (valor > 1000) {
            valor *= 1.2;
        } else {
            valor *= 1.8;
        }

        if (proximo == null) {
            return valor;
        } else {
            return proximo.calcularImposto(valor);
        }
    }
}