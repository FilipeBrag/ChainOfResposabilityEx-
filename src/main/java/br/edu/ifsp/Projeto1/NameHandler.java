package br.edu.ifsp.Projeto1;

public class NameHandler extends Handler {
    @Override
    public Handler SelectNext(Handler next) {
        return super.SelectNext(next);
    }

    @Override
    public String handle(Request request) {
        if(request.getName() == null || request.getName().isBlank()){
            return "Nome é campo obrigatório";
        }
        if(getNext() != null){
            return getNext().handle(request);
        }
        return null;
    }
}
