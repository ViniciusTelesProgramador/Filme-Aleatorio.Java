import java.util.Random;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
         
        
   
        
        System.out.println("--------------------------------------------------------------------");
        
        System.out.println("QUAL GENERO DE FILME VOCE DESEJA ASSISTIR ? O FILME SERA SORTEADO");
        
        System.out.println("[1]- TERROR [2]-AÇÃO [3]-COMÉDIA");
      
        System.out.println("--------------------------------------------------------------------");
        int opc = scan.nextInt();

        switch(opc){

            case 1:
                String[] filmesterror = {" Cuidado com Quem Chama", "A Entidade", "Sobrenatural","Invocação do Mal","Hereditário","Aterrorizados", "Corrente do Mal", "Dashcam", "Um Lugar Silencioso Parte II", "Atividade Paranormal"};
                Random random1 = new Random();
                int index1 = random1.nextInt(filmesterror.length);
                String tituloAleatorio1 = filmesterror[index1];
                System.out.println("Filmes aleatorio:" + tituloAleatorio1);
                break;
             
            case 2:
                String[] filmesaçao = {" A Mulher Rei", "Top Gun: Maverick", "Doutor Estranho no Multiverso da Loucura", "Bacurau", "Tenet" , "Lucy " , "Mad Max ", "Pantera Negra ", "John Wick 3", "Ameaça Profunda"};
                Random random2 = new Random();
                int index2 = random2.nextInt(filmesaçao.length);
                String tituloAleaotrio2 = filmesaçao[index2];
                System.out.println("Filme aleatorio gerado:" + tituloAleaotrio2);
                break;

            case 3:
                String[] filmescomedia = {"Superbad - É Hoje", "Debi & Lóide - Dois Idiotas em Apuros","A Vida de Brian" , "O Grande Lebowski", "Borat" ,"A Princesa Prometida"  , "As Branquelas" , "Monty Python e o Cálice Sagrado" , "Meu Malvado Favorito" , "Feitiço do Tempo" };
                Random random3 = new Random();
                int index3 = random3.nextInt(filmescomedia.length);
                String tituloAletorio3 = filmescomedia[index3];
                System.out.println("Filme aleatorio gerado: " + tituloAletorio3);
                break;

            default:
                System.out.println("Opção inválida!");
                break;
    
            }  
    }

}
