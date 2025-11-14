package br.edu.ifsp.Projeto1;

import javax.xml.validation.Validator;
import java.util.Objects;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {

        Handler handler = new NameHandler();
        handler.SelectNext(new EmailHandler()).SelectNext(new PasswordHandler());


        System.out.println("Formulario 1, nome vazio: ");
        Request formulario1 = new Request("","filipe.braga@ifsp.alun.edu","Filipe123");
        resultProcess(handler.handle(formulario1));

        System.out.println("Formulario 2, nome com espaços em branco: ");
        Request formulario2 = new Request(" ", "filipe.braga@ifsp.alun.edu", "Filipe123");
        resultProcess(handler.handle(formulario2));

        System.out.println("Formulario 3, email inválido: ");
        Request formulario3 = new Request("Filipe", "filipe.braga", "Filipe123");
        resultProcess(handler.handle(formulario3));

        System.out.println("Formulario 4, email vazio: ");
        Request formulario4 = new Request("Filipe", "", "Filipe123");
        resultProcess(handler.handle(formulario4));

        System.out.println("Formulario 5, senha inválida: ");
        Request formulario5 = new Request("Filipe", "filipe.braga@ifsp.alun.edu","filipe");
        resultProcess(handler.handle(formulario5));

        System.out.println("Formulario 6, Formulário completo: ");
        Request formulario6 = new Request("Filipe", "filipe.braga@ifsp.alun.edu", "Filipe123");
        resultProcess(handler.handle(formulario6));
    }
    public static void resultProcess(String string){
        System.out.println(Objects.requireNonNullElse(string, "Formulario válido."));
    }
}
