package TicTacToe;

import TicTacToe.Model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    Board board;
    Deque<Player> playersList;
    public Game(int size)
    {
        this.board=new Board(size);
        this.playersList=new LinkedList<Player>();
        intiliaze();
    }
    public void intiliaze()
    {
        Piece pieceX=new PieceX();
        Player p1=new Player("Haritha", pieceX);
        Piece pieceO=new PieceO();
        Player p2=new Player("Haran", pieceO);
        playersList.add(p1);
        playersList.add(p2);

    }
    public void startGame()
    {
        boolean gameContd=true;
        while(gameContd)
        {
            Player currPlayer=this.playersList.removeFirst();
            if(this.board.isBoardFull())
            {
                gameContd=false;
                System.out.println("tie");
                continue;
            }
            Scanner sc=new Scanner(System.in);
            System.out.println(" Chose row number to place  piece ");
            int row=sc.nextInt();
            System.out.println(" Chose col number to place  piece ");
            int col=sc.nextInt();
            boolean resultAdd=this.board.addPiece(row, col, currPlayer);
            this.board.printBoard();
            if(resultAdd)
            {
                boolean isWinner= this.board.isSuccess(row, col, currPlayer.getPiece());
                if(isWinner)
                {
                    gameContd=false;
                    System.out.println(" winner is "+ currPlayer.getPlayerName());

                }
                playersList.addLast(currPlayer);
            }
            else
            {
                playersList.addFirst(currPlayer);
            }
        }

    }
}
