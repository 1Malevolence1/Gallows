package org.example;

public class Hangman {
    public static void printGallows(int life) {
        switch (life) {
            case 9:
                System.out.println("""
                                                
                         ------
                             |    |
                             |
                             |
                             |
                             |
                             |
                            ----------
                                                
                        """);
                break;
            case 8:
                System.out.println("""
                                                
                         ------
                             |    |
                             |    O
                             |
                             |
                             |
                             |
                            ----------
                                                
                        """);
                break;
            case 7:
                System.out.println("""
                                                
                         ------
                             |    |
                             |    O
                             |    |
                             |
                             |
                             |
                            ----------
                                                
                        """);
                break;
            case 6:
                System.out.println("""
                                                
                         ------
                             |    |
                             |    O
                             |   /|
                             |
                             |
                             |
                            ----------
                                                
                        """);
                break;
            case 5:
                System.out.println("""
                                                
                         ------
                             |    |
                             |    O
                             |   /|\\
                             |
                             |
                             |
                            ----------
                                                
                        """);
                break;
            case 4:
                System.out.println("""
                                                
                         ------
                             |    |
                             |    O
                             |   /|\\
                             |    |
                             |
                             |
                            ----------
                                                
                        """);
                break;
            case 3:
                System.out.println("""
                                                
                         ------
                             |    |
                             |    O
                             |   /|\\
                             |    |
                             |   /
                             |
                            ----------
                                                
                        """);
                break;
            case 2:
                System.out.println("""
                                                
                         ------
                             |    |
                             |    O
                             |   /|\\
                             |    |
                             |   / \\
                             |
                            ----------
                                                
                        """);
                break;
            case 1:
                System.out.println("""
                                                
                         ------
                             |    |
                             |    O
                             |   /|\\
                             |    |
                             |   / \\
                             |  /
                            ----------
                                                
                        """);
                break;
            case 0:
                System.out.println("""
                                                
                         ------
                             |    |
                             |    O
                             |   /|\\
                             |    |
                             |   / \\
                             |  /   \\
                            ----------
                                                
                        """);
                break;
        }
    }
}