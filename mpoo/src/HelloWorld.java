import java.text.SimpleDateFormat;
import java.util.Date;


public class HelloWorld {
    private String nome;


    public String getNome() {
        return nome;
    }

    public String getHora() {
        SimpleDateFormat formatacao = new SimpleDateFormat("HH:mm:ss");  // Classe para formatação dos nossos futuros dados
        Date horas = new Date();                             //Aqui recebemos o dado no formato "sábado Agosto 17 11:49:22 BR 2019"
        return formatacao.format(horas);                    // Mas somente as horas, então usamos o método format da instancia
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir(){
        System.out.printf("%s - Olá %s. Você acabou de fazer o seu primeiro programa em Java. Parabéns.\n", this.getHora(), this.getNome());

    }

}
