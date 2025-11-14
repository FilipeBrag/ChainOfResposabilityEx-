package br.edu.ifsp.Projeto1;

public class EmailHandler extends Handler{
    @Override
    public Handler SelectNext(Handler next) {
        return super.SelectNext(next);
    }

    @Override
    public String handle(Request request) {
        if(request.getEmail() == null || request.getEmail().isBlank()){
            return "Email é campo obrigatório";
        }
        if(!request.getEmail().contains("@") || !request.getEmail().contains(".")){
            return "Email inválido";
        }
        if(getNext() != null){
            return getNext().handle(request);
        }
        return null;
    }
}

