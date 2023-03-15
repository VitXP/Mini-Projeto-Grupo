package com.mycompany.projeto.individual;

public class Login {
    String devolverLogin(String usuario, Integer senha){
        if(usuario.equals("admin") && senha == 1234){
            return "Login realizado com sucesso!";
        } else{
            return "Usuário e/ou senha incorretos";
        }
    }
}
