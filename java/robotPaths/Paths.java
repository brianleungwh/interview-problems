public class Paths {

    public static int searchPaths(int x, int y) {
        Grid g = new Grid(x, y);

        // start search at upper left corner (0, 0)
        return search(g, 0, 0);
    }

    private static int search(Grid g, int x, int y) {
        int count = 0;
        if (x == g.X() - 1 && y == g.Y() - 1) {
            return 1;
        } else {
            if (x + 1 < g.X() && !g.hasBeenVisited(x + 1, y)) {
                g.togglePiece(x, y);
                count += search(g, x + 1, y);
                g.togglePiece(x, y);
            }
            if (y + 1 < g.Y() && !g.hasBeenVisited(x, y + 1)) {
                g.togglePiece(x, y);
                count += search(g, x, y + 1);
                g.togglePiece(x, y);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(searchPaths(12, 12));
    }
}
