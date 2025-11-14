package br.edu.ifsp.Projeto1;

public abstract class Handler {
    private Handler next;

    public Handler SelectNext(Handler next) {
        this.next = next;
        return next;
    }

    public abstract String handle(Request request);

    public Handler getNext() {
        return next;
    }
}
