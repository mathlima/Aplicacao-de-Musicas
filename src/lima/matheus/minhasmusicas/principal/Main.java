package lima.matheus.minhasmusicas.principal;
import lima.matheus.minhasmusicas.modelos.Podcasts;
import lima.matheus.minhasmusicas.modelos.Musicas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String menuCurteCompartilha = """
                            Você deseja curtir ou compartilhar está musica?
                            1 - Curtir
                            2 - Compartilhar
                            3 - Voltar ao menu anterior
                            """;

        //Instanciando podcast
        Podcasts podcasts1 = new Podcasts();
        podcasts1.setTitulo("Os sócios");
        podcasts1.setDuracao(120);
        podcasts1.setClassificacao(8);

        Podcasts podcasts2 = new Podcasts();
        podcasts2.setTitulo("Joel Jota - Ep1");
        podcasts2.setDuracao(60);
        podcasts2.setClassificacao(9);

        // Instanciando musica
        Musicas musica1 = new Musicas();
        musica1.setTitulo("A que saudades");
        musica1.setArtista("Felipe Rodrigues");
        musica1.setDuracao(4);
        musica1.setClassificacao(9);

        Musicas musica2 = new Musicas();
        musica2.setTitulo("Uma coisa peço ao Senhor");
        musica2.setArtista("Fernandinho");
        musica2.setDuracao(3);
        musica2.setClassificacao(10);



        String menuMusicas = """
                Esta é sua playlist de musicas, qual você deseja ouvir?
                1 - Nome da musica: %s, %s
                2 - Nome da musica: %s, %s
                0 - Voltar ao menu inicial
                """.formatted(musica1.getTitulo(), musica1.getArtista(), musica2.getTitulo(), musica2.getArtista());

        String menuPodcasts = """
                Esta é sua playlist de podcasts, qual você deseja ouvir?
                1 - Nome do Podcast: %s
                2 - Nome do Podcast: %s
                0 - Voltar ao menu inicial
                """.formatted(podcasts1.getTitulo(), podcasts2.getTitulo());

        String menuInicial = """
                Digite o que você deseja ouvir:
                1 - Musicas
                2 - Podcasts
                0 - Sair
                """;
        System.out.println(menuInicial);
        int opcao = 10;
        opcao = leitor.nextInt();

        while (opcao != 0) {
            if (opcao == 1) {
                System.out.println(menuMusicas);
                int opcaoMusicas = leitor.nextInt();

                if (opcaoMusicas == 1) {
                    musica1.reproduzir();
                    System.out.println(menuCurteCompartilha);
                    int opcaoMenuCurteCompartilhaMusicas = leitor.nextInt();

                    while (opcaoMenuCurteCompartilhaMusicas != 3)
                        if (opcaoMenuCurteCompartilhaMusicas == 1) {
                        musica1.curtir();
                        System.out.println(menuCurteCompartilha);
                        opcaoMenuCurteCompartilhaMusicas = leitor.nextInt();
                        } else if (opcaoMenuCurteCompartilhaMusicas == 2) {
                        musica1.compartilhar();
                        System.out.println(menuCurteCompartilha);
                        opcaoMenuCurteCompartilhaMusicas = leitor.nextInt();
                        }
                } else if (opcao == 0) {
                    System.out.println(menuInicial);
                    opcao = leitor.nextInt();
                } else if (opcaoMusicas == 2) {
                    musica2.reproduzir();
                    System.out.println(menuCurteCompartilha);
                    int opcaoMenuCurteCompartilhaMusicas = leitor.nextInt();

                    while (opcaoMenuCurteCompartilhaMusicas != 3)
                        if (opcaoMenuCurteCompartilhaMusicas == 1) {
                            musica2.curtir();
                            System.out.println(menuCurteCompartilha);
                            opcaoMenuCurteCompartilhaMusicas = leitor.nextInt();
                        } else if (opcaoMenuCurteCompartilhaMusicas == 2) {
                            musica2.compartilhar();
                            System.out.println(menuCurteCompartilha);
                            opcaoMenuCurteCompartilhaMusicas = leitor.nextInt();
                        }
                }
                else {
                    System.out.println("Retornando ao menu inicial.");
                    System.out.println(menuInicial);
                    opcao = leitor.nextInt();
                }

                // Aqui começa se a escolha for Podcasts
            } else if (opcao == 2) {
                System.out.println(menuPodcasts);
                int opcaoPodcasts = leitor.nextInt();
                if (opcaoPodcasts == 1) {
                    podcasts1.reproduzir();
                    System.out.println(menuCurteCompartilha);
                    int opcaoMenuCurteCompartilhaPodcasts = leitor.nextInt();

                    while (opcaoMenuCurteCompartilhaPodcasts != 3)
                        if (opcaoMenuCurteCompartilhaPodcasts == 1) {
                            podcasts1.curtir();
                            System.out.println(menuCurteCompartilha);
                            opcaoMenuCurteCompartilhaPodcasts = leitor.nextInt();
                        } else if (opcaoMenuCurteCompartilhaPodcasts == 2) {
                            podcasts1.compartilhar();
                            System.out.println(menuCurteCompartilha);
                            opcaoMenuCurteCompartilhaPodcasts = leitor.nextInt();
                        }
                } else if (opcao == 0) {
                    System.out.println(menuInicial);
                    opcao = leitor.nextInt();
                } else if (opcaoPodcasts == 2) {
                    podcasts2.reproduzir();
                    System.out.println(menuCurteCompartilha);
                    int opcaoMenuCurteCompartilhaPodcasts = leitor.nextInt();

                    while (opcaoMenuCurteCompartilhaPodcasts != 3)
                        if (opcaoMenuCurteCompartilhaPodcasts == 1) {
                            podcasts2.curtir();
                            System.out.println(menuCurteCompartilha);
                            opcaoMenuCurteCompartilhaPodcasts = leitor.nextInt();
                        } else if (opcaoMenuCurteCompartilhaPodcasts == 2) {
                            podcasts2.compartilhar();
                            System.out.println(menuCurteCompartilha);
                            opcaoMenuCurteCompartilhaPodcasts = leitor.nextInt();
                        }
                }
                else {
                    System.out.println("Retornando ao menu inicial.");
                    System.out.println(menuInicial);
                    opcao = leitor.nextInt();
                }
            }
        }

        leitor.close();
        System.out.println("Programa encerrado.");
    }
}