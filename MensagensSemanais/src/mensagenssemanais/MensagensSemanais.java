package mensagenssemanais;
import mensagenssemanais.diasdasemana.*;
public class MensagensSemanais{
    
    public String exibirMensagem(Mensagem mensagem, Interface texto){
        String mensagemFinal = texto.anexarMensagem(mensagem);
        return mensagemFinal;
    }
    
    public static void main(String[] args) {
        
    }
    
}
