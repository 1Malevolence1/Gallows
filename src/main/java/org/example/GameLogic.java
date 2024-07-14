package org.example;

public class GameLogic {
    private Player player;

    private RandomWord randomWord;

    private WordRevealer wordRevealer;
    private ListIncorrectlyLetters listIncorrectlyLetters;

    public GameLogic() {
        this.player = new Player();
        this.randomWord = new RandomWord();
        this.listIncorrectlyLetters = new ListIncorrectlyLetters();
        this.wordRevealer = new WordRevealer(randomWord, listIncorrectlyLetters);

    }


    public void start() throws Error {
        startGame();
        endGame();
        clearData();
    }

    private void startGame() throws Error {

        while (true) {
            printCurrentState();

            char userLetter = player.sayLetter();

            if (!wordRevealer.revealLetter((userLetter))) {
                player.decrementLife();
                Hangman.printGallows(player.getLife());
                if (!checkLifePlayer(player.getLife())) return;
            }

            if (victory()) {
                TextInfo.victory();
                return;
            }
            printIncorrectlyGuessedLetters();
        }

    }

    private void printCurrentState() {
        System.out.println("Загаданное слово: " + wordRevealer.printHiddenWord());
        System.out.println("Введите букву: ");
    }

    private void printIncorrectlyGuessedLetters() {
        listIncorrectlyLetters.printListIncorrectlyLetters();
    }


    private void endGame() {
        TextInfo.endGame();
        System.out.println("Загаданное слово: " + wordRevealer.getHiddenWord());
    }

    private boolean checkLifePlayer(int life) {
        if (life == 0) {
            TextInfo.defeat();
            endGame();
            return false;
        } else return true;
    }

    private boolean victory() {
        return wordRevealer.comparison();
    }

    private void clearData() {
        player.setLife(9);
        listIncorrectlyLetters.clear();
    }


}
