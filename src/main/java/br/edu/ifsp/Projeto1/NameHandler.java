package br.edu.ifsp.Projeto1;

public class NameHandler extends Handler {
    private Handler next;

    @Override
    public Handler SelectNext(Handler next) {
        return super.SelectNext(next);
    }

    @Override
    public String handle(Request request) {
        if(request.getName() == null || request.getName().isBlank()){
            return "Nome é campo obrigatório";
        }
        if(next != null){
            return next.handle(request);
        }
        return null;
    }
}
