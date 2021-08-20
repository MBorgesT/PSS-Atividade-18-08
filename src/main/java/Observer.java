import java.util.ArrayList;

abstract class Notificador {

    protected ArrayList<Departamento> listaDepartamentos;

    public Notificador() {
        this.listaDepartamentos = new ArrayList<>();
    }

    public void adicionarDepartamento(Departamento departamento) {
        listaDepartamentos.add(departamento);
    }

    public abstract void update(String mensagem);

}

class NotificadorPadrao extends Notificador {

    @Override
    public void update(String mensagem) {
        for (Departamento d: listaDepartamentos) {
            d.notificar(mensagem);
        }
    }
}

abstract class Departamento {

    public Notificador notificador;

    public Departamento(Notificador notificador) {
        this.notificador = notificador;
    }

    public abstract void receberNotificacao(String mensagem);

    public abstract void notificar(String mensagem);

}

class Juridico extends Departamento {

    public Juridico(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void receberNotificacao(String mensagem) {
        System.out.println("Juridico foi notificado: " + mensagem);
    }

    @Override
    public void notificar(String mensagem) {
        notificador.update("Juridico notifica: " + mensagem);
    }

}

class Marketing extends Departamento {

    public Marketing(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void receberNotificacao(String mensagem) {
        System.out.println("Marketing foi notificado: " + mensagem);
    }

    @Override
    public void notificar(String mensagem) {
        notificador.update("Marketing notifica: " + mensagem);
    }

}
