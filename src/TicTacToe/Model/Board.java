package TicTacToe.Model;
public class Board {
    int size;
    Piece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new Piece[size][size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Piece[][] getBoard() {
        return board;
    }

    public void setBoard(Piece[][] board) {
        this.board = board;
    }

    public void printBoard()
    {
        for(int i=0;i<this.size;i++)
        {
            for(int j=0;j<this.size;j++)
            {
                if(board[i][j]==null)
                {
                    System.out.print(" _ ");
                }
                else
                {
                    System.out.print(" "+board[i][j].getPieceType().name()+" ");
                }
            }
            System.out.println();
        }
    }

    public boolean addPiece(int row, int col, Player player)
    {
        if(row<0 || row>=this.board.length || col<0 || col>=this.board[0].length)
        {
            System.out.println("please enter input row, col properly");
            return false;
        }
        if(this.board[row][col]==null)
        {
            this.board[row][col]=player.getPiece();
            return true;
        }
        else
        {
            return false;
        }
    }
    public  boolean isBoardFull()
    {
        for(int i=0;i<this.board.length;i++)
        {
            for(int j=0;j<this.board[i].length;j++)
            {
                if(board[i][j]==null)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isSuccess(int row , int col, Piece piece)
    {
        boolean rowMatch=true;
        boolean colMatch=true;
        boolean diagMatch=true;
        boolean antiDiagMatch=true;
        for(int i=0;i<this.board.length;i++)
        {
           if(this.board[i][col]==null || !this.board[i][col].getPieceType().name().equals(piece.getPieceType().name()))
           {
               rowMatch=false;
               break;
           }
        }
        for(int i=0;i<this.board[0].length;i++)
        {
            if(this.board[row][i]==null || !this.board[row][i].getPieceType().name().equals(piece.getPieceType().name()))
            {
                colMatch=false;
                break;
            }
        }
        for(int i=0;i<this.board.length;i++)
        {
            if(this.board[i][i]==null || !this.board[i][i].getPieceType().name().equals(piece.getPieceType().name())) {
                diagMatch = false;
                break;
            }
        }
        for(int i=0;i<this.board.length;i++)
        {
            if(this.board[i][this.board.length-i-1]==null || !this.board[i][this.board.length-i-1].getPieceType().name().equals(piece.getPieceType().name()) )
            {
                antiDiagMatch=false;
                break;
            }
        }
        return rowMatch || colMatch || diagMatch || antiDiagMatch;
    }
}
