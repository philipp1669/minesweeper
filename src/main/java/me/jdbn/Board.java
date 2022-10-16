package me.jdbn;

public class Board {
    private final int x;
    private final int y;

    public Board(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        for (int i = 0; i<y; i++) {
            if (i == 0) {
                System.out.print("-");
                System.out.println("-----".repeat(x));
            }
            for (int j = 0; j<x; j++) {
                System.out.print("|    ");
                if ((j+1) == x) System.out.print("|");
            }
            System.out.println();
            System.out.print("-");
            System.out.println("-----".repeat(x));
        }
    }
}
