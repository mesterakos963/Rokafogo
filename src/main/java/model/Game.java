package model;

public class Game {
    int[][] table = new int[8][8] ;
    public void initTable()
    {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 != 0)
                {
                    if(j % 2 == 0) {
                        table[i][j] = 1; //black field
                    }
                }
                else if (i % 2 == 0)
                {
                    if(j % 2 != 0)
                    {
                        table[i][j] = 1;
                    }
                }
            }
        }
    }

    public void placeFigures()
    {
        //2 -> fox
        //3,4,5,6 -> dog
        table[0][2] = 2;
        table[7][1] = 3;
        table[7][3] = 4;
        table[7][5] = 5;
        table[7][7] = 6;
    }

    public void moveFox(int x, int y) {
        int oldY = 9, oldX = 9;
        for ( int i = 0; i < 8; i++) {
            for ( int j = 0; j < 8; j++ ) {
                if ( table[i][j] == 2 ) {
                    oldX = i;
                    oldY = j;
                    table[i][j] = 0;
                }
            }
        }
        if(table[x][y] == 1) {
            throw new IllegalArgumentException();
        }
        if(x > 7 || y > 7)
        {
            throw new IllegalArgumentException();
        }
        if(y != oldY + 1 || y != oldY - 1) {
            throw new IllegalArgumentException();
        }
        if(x != oldX + 1) {
            throw new IllegalArgumentException();
        }
        else {
            table[x][y] = 2;
        }
    }

    public void moveDog(int dog, int x, int y) {
        int oldX = 9, oldY = 9;
        for ( int i = 0; i < 8; i++) {
            for ( int j = 0; j < 8; j++ ) {
                if ( table[i][j] == dog ) {
                    oldX = i;
                    oldY = j;
                    table[i][j] = 0;
                }
            }
        }
        if(table[x][y] == 1) {
            throw new IllegalArgumentException();
        }
        if(x > 7 || y > 7) {
            throw new IllegalArgumentException();
        }
        if(oldX > x) {
            throw new IllegalArgumentException();
        }
        if(y != oldY + 1 || y != oldY - 1) {
            throw new IllegalArgumentException();
        }
        if(x != oldX - 1) {
            throw new IllegalArgumentException();
        }
        else {
            table[x][y] = dog;
        }
    }
}
