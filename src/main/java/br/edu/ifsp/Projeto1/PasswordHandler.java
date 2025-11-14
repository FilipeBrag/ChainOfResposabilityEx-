package br.edu.ifsp.Projeto1;

public class PasswordHandler extends Handler{
    private boolean validateMaiscula = false;
    private boolean validateMinuscula = false;
    private boolean validateNumeros = false;

    @Override
    public Handler SelectNext(Handler next) {
        return super.SelectNext(next);
    }

    @Override
    public String handle(Request request) {
        if(request.getPassword() == null || request.getPassword().length() < 8){
            return "Senha deve ter no minimo 8 caracteres";
        }

        for(char c : request.getPassword().toCharArray()){
            if(Character.isUpperCase(c)){
                validateMaiscula = true;
            }
            if(Character.isLowerCase(c)){
                validateMinuscula = true;
            }
            if(Character.isDigit(c)){
                validateNumeros = true;
            }
        }

        if(!validateMaiscula || !validateMinuscula || !validateNumeros){
            return "Senha deve ter no minimo 1 letra maiuscula, 1 letra minuscula e 1 numero";
        }

        if(getNext() != null){
            return getNext().handle(request);
        }
        return null;
    }
}
