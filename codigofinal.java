import java.util.Random;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("---------------------------------------------------------");
        System.out.println("BEM-VINDO AO SISTEMA DE SORTEIO DE FILMES ALEATÓRIOS!");
        System.out.println("---------------------------------------------------------");
        
        while (true) {
            System.out.println("\nEscolha o gênero de filme que deseja assistir:");
            System.out.println("[1] Terror");
            System.out.println("[2] Comédia");
            System.out.println("[3] Ação");
            System.out.println("[4] Sair");
            int opc = scan.nextInt();

            switch (opc) {
                case 1:
                String[] filmesTerror = {"Cuidado com Quem Chama", "A Entidade", "Sobrenatural", "Invocação do Mal", "Hereditário", "Aterrorizados", "Corrente do Mal", "Dashcam", "Um Lugar Silencioso Parte II", "Atividade Paranormal"};
                String[] sinopsesTerror = {"Grupo de amigos contrata um médium para fazer uma sessão por Zoom na quarentena. As coisas pareciam bem, até que um espírito maligno começa a invadir suas casas e eles percebem que podem não sobreviver à noite.", "Um autor de romances criminais encontra uma caixa com filmagens antigas de crimes horripilantes, que parecem ter sido cometidos por um assassino em série. Ao investigar, ele e sua família se tornam alvos de uma entidade sobrenatural maligna.", "Josh e Renai se mudam com a família para uma casa maior. Lá, o filho Dalton sofre um estranho acidente e entra em coma. Enquanto eles tentam salvar o menino, entidades malignas atormentam a família.", "Os investigadores paranormais Ed e Lorraine Warren trabalham para ajudar a família aterrorizada por uma entidade demoníaca em sua fazenda.", "Após a morte da reclusa avó, a família Graham começa a desvendar algumas coisas. Mesmo após a partida da matriarca, ela permanece como se fosse uma sombra sobre a família, especialmente sobre a solitária neta adolescente, Charlie, por quem ela sempre manteve uma fascinação não usual. Com um crescente terror tomando conta da casa, a família explora lugares mais escuros para escapar do infeliz destino que herdaram.", "Pesquisadores de paranormalidade investigam estranhos eventos em um bairro de Buenos Aires.", "A jovem e despreocupada Jay leva uma vida tranquila entre escola, paqueras e passeios no lago. No entanto, após uma transa, o garoto com quem passou a noite lhe explica que ele carregava no corpo uma força maligna, transmissível às pessoas apenas pelo sexo. Agora, enquanto vive o dilema de carregar a sina ou passá-la adiante, a jovem Jay começa a ser perseguida por figuras estranhas que tentam matá-la e que não são vistas por mais ninguém.", "Annie é uma influencer estadunidense negacionista cuja maneira favorita de ganhar engajamento nas redes é inflamando tópicos e ofendendo aos outros. Porém, durante uma viagem até Londres, seu comportamento a coloca numa posição perigosa que culmina numa noite aterrorizante registrada através de uma live.", "A família Abbott precisa enfrentar os terrores do mundo exterior enquanto luta pela sobrevivência em silêncio. Forçados a se aventurar no desconhecido, eles percebem que as criaturas que caçam pelo som não são as únicas ameaças no caminho da areia.", "Logo após se mudarem para uma nova casa, Katie e Micah ficam intrigados com o que parece ser uma presença sobrenatural que está agindo sobre o lugar. O casal decide capturar o possível fenômeno em vídeo, mas nenhum deles estava preparado para os acontecimentos que se seguem."};
                Random random1 = new Random();
                int index1 = random1.nextInt(filmesTerror.length);
                String tituloAleatorio1 = filmesTerror[index1];
                System.out.println("Filme aleatório gerado: " + tituloAleatorio1);
                System.out.println("Você deseja gerar a sinopse?");
                System.out.println("[1] - SIM");
                System.out.println("[2] - NÃO");
                int sinps = scan.nextInt();
                if (sinps == 1) {
                    System.out.println("SINOPSE: " + sinopsesTerror[index1]);
                }
                break;
                    

                case 2:
                    String[] filmesComedia = {"Superbad - É Hoje", "Debi & Lóide - Dois Idiotas em Apuros", "A Vida de Brian", "O Grande Lebowski", "Borat", "A Princesa Prometida", "As Branquelas", "Monty Python e o Cálice Sagrado", "Meu Malvado Favorito", "Feitiço do Tempo"};
                    String[] sinopseComedia = {"Os adolescentes Seth e Evan têm grandes esperanças para uma festa de formatura. Eles pretendem beber e conquistar as garotas para que eles possam se tornar parte da turma mais popular da escola, mas a ansiedade de separação e dois policiais entediados complicam missão dos amigos.","Dois amigos debilóides vão para Aspen, no estado do Colorado para tentar devolver uma maleta esquecida pela passageira da limusine que um deles estava dirigindo para o aeroporto. Sem saber que na mala havia uma quantia enorme de dinheiro, que serviria para pagar o resgate de um sequestro, os dois acabam sendo perseguidos pela polícia e por assassinos profissionais.","Brian Cohen é um judeu como outro qualquer, mas, em uma série de eventos ridículos, foi confundido com o Messias desde que nasceu, e, desde então, mantém essa fama e se torna lider de um movimento religioso. Um dia, ele é levado até Pôncio Pilatos e condenado à crucificação.","Jeff Lebowski é um boa vida que acaba se envolvendo com a história de um milionário com o mesmo nome. O ricaço pede ajuda a Jeff para entregar o dinheiro do resgate de sua esposa, que foi sequestrada por bandidos perigosos.","Um famoso repórter do Cazaquistão viaja aos Estados Unidos para fazer um documentário sobre os hábitos dos cidadãos norte-americanos, provocando situações absurdas por onde passa.","Uma aventura de conto de fadas sobre uma linda jovem, Buttercup, e seu amor verdadeiro. Um menino, Westley, vira pirata para salvar sua amada das garras de um príncipe terrível. Para se reencontrar, o casal deve lutar contra os demônios de um reino místico.","Dois irmãos agentes do FBI, Marcus e Kevin Copeland, acidentalmente evitam que bandidos sejam presos em uma apreensão de drogas. Como castigo, eles são forçados a escoltar um par de socialites nos Hamptons. Quando as meninas descobrem o plano da agência, elas se recusam a ir. Sem opções, Marcus e Kevin, dois homens negros, decidem fingir que são as irmãs e se transformam em um par de loiras.","O Rei Artur sai à procura de cavaleiros que o acompanhem em uma jornada histórica: a busca do Santo Graal. Aparecem então Sir Lancelot, o Bravo; Sir Robin, o Não-Tão-Bravo-Quanto-Sir-Lancelot; Sir Galahad, o Puro, entre outros personagens surreais. Escrita pelo genial grupo de comédia britânico Monty Python, a trama do longa satiriza diversos eventos históricos ocorridos na Idade Média.","Um homem que adora todas as coisas diabólicas, o supervilão Gru traça um plano para roubar a lua. Rodeado de um exército de pequenos ajudantes e seu arsenal de armas e máquinas de guerra, Gru se prepara para destruir quem atravessar seu caminho. Mas ele não esperava pelo seu maior desafio: três adoráveis órfãs que querem ter Gru como pai.","Phil, um arrogante meteorologista de um canal de televisão, fica preso em uma espécie de túnel do tempo, condenado a reviver indefinidamente o mesmo dia até que mude suas atitudes."};
                    Random random2 = new Random();
                    int index2 = random2.nextInt(filmesComedia.length);
                    String tituloAleatorio2 = filmesComedia[index2];
                    System.out.println("Filme aleatório gerado: " + tituloAleatorio2);
                    System.out.println("Você deseja gerar a sinopse?");
                    System.out.println("[1] - SIM");
                    System.out.println("[2] - NÃO");
                    int sinps2 = scan.nextInt();
                    if (sinps2 == 1) {
                    System.out.println("SINOPSE: " + sinopseComedia[index2]);
                    }
                    break;

                case 3:
                    String[] filmesAcao = {"A Mulher Rei", "Top Gun: Maverick", "Doutor Estranho no Multiverso da Loucura", "Bacurau", "Tenet", "Lucy", "Mad Max", "Pantera Negra", "John Wick 3", "Ameaça Profunda"};
                    String[] sinopseAçao = {"Em 1800, o general Nanisca treina um grupo de mulheres guerreiras para proteger o reino africano de Dahomey de um inimigo estrangeiro.","Depois de mais de 30 anos de serviço como um dos principais aviadores da Marinha, Pete Maverick Mitchell está de volta, rompendo os limites como um piloto de testes corajoso. No mundo contemporâneo das guerras tecnológicas, Maverick enfrenta drones e prova que o fator humano ainda é essencial.","O aguardado filme trata da jornada do Doutor Estranho rumo ao desconhecido. Além de receber ajuda de novos aliados místicos e outros já conhecidos do público, o personagem atravessa as realidades alternativas incompreensíveis e perigosas do Multiverso para enfrentar um novo e misterioso adversário.","Num futuro não muito longínquo, uma povoação de nome Bacurau, em pleno sertão brasileiro, some misteriosamente do mapa. Quando uma série de assassinatos inexplicáveis começam a acontecer, os moradores da cidade tentam reagir. Mas como se podem defender de um inimigo desconhecido e implacável?","Um agente secreto embarca em uma missão perigosa para evitar o início da Terceira Guerra Mundial.","Lucy é obrigada a contrabandear drogas dentro do estômago. Mas o corpo da jovem absorve as substâncias e ela passa a ter superpoderes, como telepatia, telecinesia, a ausência de dor e a capacidade de adquirir conhecimento instantaneamente.","Em um futuro distópico não muito distante, os recursos de óleo foram esgotados e o mundo está mergulhado em guerra, fome e caos financeiro. É quando o policial Mad Max, que não tem mais nada além de seus instintos de sobrevivência e retaliação, começa uma vingança contra a gangue que perseguiu e assassinou sua esposa e filhos.","Conheça a história de T'Challa, príncipe do reino de Wakanda, que perde o seu pai e viaja para os Estados Unidos, onde tem contato com os Vingadores. Entre as suas habilidades estão a velocidade, inteligência e os sentidos apurados.","O lendário John Wick luta para sair de Nova York quando um contrato de 14 milhões de dólares faz dele o alvo dos maiores assassinos do mundo.","Criaturas misteriosas aterrorizam os tripulantes de um laboratório subaquático a 11 mil metros de profundidade. Eles são obrigados a caminhar nas profundezas marítimas, com quantidade insuficiente de oxigênio, para tentar sobreviver."};
                    Random random3 = new Random();
                    int index3 = random3.nextInt(filmesAcao.length);
                    String tituloAleatorio3 = filmesAcao[index3];
                    System.out.println("Filme aleatório gerado: " + tituloAleatorio3);
                    System.out.println("Você deseja gerar a sinopse?");
                    System.out.println("[1] - SIM");
                    System.out.println("[2] - NÃO");
                    int sinps3 = scan.nextInt();
                    if (sinps3 == 1) {
                    System.out.println("SINOPSE: " + sinopseAçao[index3]);
                    }
                    break;

                case 4:
                    System.out.println("Obrigado por utilizar o sistema de sorteio de filmes! Até a próxima!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
            
            scan.nextLine(); // Limpa o buffer do teclado
            
            System.out.println("\nDeseja gerar outro filme? (S/N)");
            String resposta = scan.nextLine();
            if (resposta.equalsIgnoreCase("N")) {
                System.out.println("Obrigado por utilizar o sistema de sorteio de filmes! Até a próxima!");
                break;
            }
        }
    }
}
