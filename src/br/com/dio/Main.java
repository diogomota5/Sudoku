package br.com.dio;

import br.com.dio.Model.Board;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private static Board board;

    private final static int BOARD_LIMIT = 9;

    public static void main(String[] args) {
        final var positions = Stream.of(args)
                .collect(Collectors.toMap(
                        k -> k.split(";")[0],
                        v -> v.split(";")[1]
                ));
        var option = -1;
        while (true){
            System.out.println(("Selecione uma das opções a seguir"));
            System.out.println(("1 - Iniciar um novo jogo"));
            System.out.println(("2 - Colocar um novo número"));
            System.out.println(("3 - Remover um número"));
            System.out.println(("4 - Visualizar jogo atual"));
            System.out.println(("5 - Verificar status do jogo"));
            System.out.println(("6 - Limpar jogo"));
            System.out.println(("7 - Finalizar o jogo"));
            System.out.println(("8 - Sair"));

            option = scanner.nextInt();

            switch (option){
                case 1 -> startGame(positions);
                case 2 -> inputNumber();
                case 3 -> removeNumber();
                case 4 -> showCurrentGame();
                case 5 -> showGameStatus();
                case 6 -> clearGame();
                case 7 -> finishGame();
                case 8 -> System.exit(0);
                default -> System.out.println("Opção inválida, seleciona uma das opções do menu");
            }
        }

    }

    private static void startGame(Map<String, String> positions) {
    }

    private static void inputNumber() {
    }

    private static void removeNumber() {
    }

    private static void showCurrentGame() {
    }

    private static void showGameStatus() {
    }

    private static void clearGame() {
    }

    private static void finishGame() {
    }

}