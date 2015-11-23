public class Grid {

    private boolean[][] grid;

    public Grid(int x, int y) {
        this.grid = new boolean[x][y];
    }

    public int X() {
        return this.grid.length;
    }

    public int Y() {
        return this.grid[0].length;
    }

    public void togglePiece(int i, int j) {
        this.grid[i][j] = !this.grid[i][j];
    }

    public boolean hasBeenVisited(int i, int j) {
        return this.grid[i][j];
    }
}
