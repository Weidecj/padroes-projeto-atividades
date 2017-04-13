package javaapp;

import javax.swing.JOptionPane;

public class JavaApp {

    private String mensagem;
    
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }
    
    public String getMensagem(){
        return this.mensagem;
    }
            
    public static void main(String[] args) {
        JavaApp mensagem = new JavaApp();
        mensagem.setMensagem("Hello world!");
        JOptionPane.showMessageDialog(null, mensagem.getMensagem());
    }
    
}
