import javax.swing.JOptionPane;

public class VerificadorIdade {

    public static void main(String[] args) {
        
        String entrada = JOptionPane.showInputDialog(null, "Digite sua idade: ","Verificador de idade",1);
        int idade = Integer.parseInt(entrada);

      String texto = mensagem(idade);

      JOptionPane.showMessageDialog(null,texto,"Verificador de idade",1);
     
    }
    public static String mensagem(int idade){

        String msg;
        if(idade >= 16){
            msg = "Voce já pode votar. Bem vindo a democracia. ";
        } else {
           msg = "Infelizmente você não pode votar. Mas não seja impaciente. ";
        }
        return msg;
    } 
}
