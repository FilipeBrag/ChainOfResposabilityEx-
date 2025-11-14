package br.edu.ifsp.Projeto1;

public class EmailHandler extends Handler{
    private Handler next;

    @Override
    public Handler SelectNext(Handler next) {
        return super.SelectNext(next);
    }

    @Override
    public String handle(Request request) {
        System.out.println("EmailHandler");
        if(request.getEmail() == null || request.getEmail().isBlank()){
            return "Email é campo obrigatório";
        }
        if(request.getEmail().contains("@") || request.getEmail().contains(".")){
            return "Email inválido";
        }
        if(next != null){
            return next.handle(request);
        }
        return null;
    }
}

