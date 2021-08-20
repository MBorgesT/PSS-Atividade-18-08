
class Persistencia {

    public void salvar(String jsonStr) {
        System.out.println("JSON salvo: " + jsonStr);
    }

}

class JSONString {

    String valor;

    public JSONString(String valor) {
        this.valor = valor;
    }

    public float getValorNoIndice(int index) {
        float valorNoIndice = 0;
        // faz mágica
        return valorNoIndice;
    }

}

class XMLString {

    String valor;

    public XMLString(String valor) {
        this.valor = valor;
    }

    public void adicionarValor(int index) {
        // faz mágica
    }

}

class JSONAdapter {

    private XMLString xml;

    public JSONAdapter(XMLString xml) {
        this.xml = xml;
    }

    public JSONString getJSON() {
        String str = "";
        // faz mágica
        return new JSONString(str);
    }

}