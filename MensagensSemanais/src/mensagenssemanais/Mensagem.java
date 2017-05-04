package mensagenssemanais;

public class Mensagem {
    private String dia;
    private String mensagem;
    
    public Mensagem(String dia, String mensagem){
        this.dia = dia;
        this.mensagem = mensagem;
    }
    
    public void setDia(String dia){
        this.dia = dia;
    }
    
    public String getDia(){
        return this.dia;
    }
    
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }
    
    public String getMensagem(){
        return this.mensagem;
    }
}
