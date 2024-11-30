public class Cell {
    private int x;
    private int y;

    public CellEntityType cellType;
    private boolean isVisited;

    public Cell(int x, int y, CellEntityType cellType) {
        this.x = x;
        this.y = y;
        this.cellType = cellType;
        this.isVisited = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public CellEntityType getCellType() {
        return cellType;
    }

    public void setCellType(CellEntityType cellType) {
        this.cellType = cellType;
    }

    public void setIsVisited() {
        this.isVisited = true;
    }

    public boolean getIsVisited() {
        return isVisited;
    }
}
