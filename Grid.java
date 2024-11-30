import java.util.ArrayList;
import java.util.Random;

public class Grid extends ArrayList<ArrayList<Cell>> {
    private int length;
    private int width;

    Character character;
    Cell currentCell;

    private Grid(int length, int width, Character character, Cell currentCell) {
        this.length = length;
        this.width = width;
        this.character = character;
        this.currentCell = currentCell;
    }

    private Grid(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public static Grid generateMap(int length, int width) {
        Grid grid = new Grid(length, width);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            ArrayList<Cell> row = new ArrayList<>();
            for (int j = 0; j < width; j++) {
                row.add(new Cell(i, j, CellEntityType.VOID));
            }
            grid.add(row);
        }

        int numberOfSanctuaries = 2 + random.nextInt(3);
        grid.addEntity(CellEntityType.SANCTUARY, numberOfSanctuaries);

        int numberOfEnemies = 4 + random.nextInt(3);
        grid.addEntity(CellEntityType.ENEMY, numberOfEnemies);

        grid.addEntity(CellEntityType.PORTAL, 1);

        int playerRow = random.nextInt(length);
        int playerCol = random.nextInt(width);
        grid.currentCell = grid.getCell(playerRow, playerCol);

        return grid;
    }

    public void addEntity(CellEntityType type, int count) {
        Random rd = new Random();
        int i = 0;
        while(i < count) {
            int row = rd.nextInt(length);
            int col = rd.nextInt(width);

            Cell currentCell = getCell(row, col);
            if(currentCell.getCellType() == CellEntityType.VOID) {
                currentCell.cellType = type;
                i++;
            }
        }
    }

    public Cell getCell(int row, int col) {
        return this.get(row).get(col);
    }

    public void goNorth() throws Exception {
        int newRow = currentCell.getX() - 1;
        if (newRow < 0) {
            throw new Exception("Cannot move north, out of bounds.");
        }
        currentCell = getCell(newRow, currentCell.getY());
    }

    public void goSouth() throws Exception {
        int newRow = currentCell.getX() + 1;
        if (newRow >= length) {
            throw new Exception("Cannot move south, out of bounds.");
        }
        currentCell = getCell(newRow, currentCell.getY());
    }

    public void goWest() throws Exception {
        int newCol = currentCell.getY() - 1;
        if (newCol < 0) {
            throw new Exception("Cannot move west, out of bounds.");
        }
        currentCell = getCell(currentCell.getX(), newCol);
    }

    public void goEast() throws Exception {
        int newCol = currentCell.getY() + 1;
        if (newCol >= width) {
            throw new Exception("Cannot move east, out of bounds.");
        }
        currentCell = getCell(currentCell.getX(), newCol);
    }

    public void printGrid() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (getCell(i, j) == currentCell) {
                    System.out.print("P "); // P for Player
                } else {
                    switch (getCell(i, j).getCellType()) {
                        case VOID:
                            System.out.print(". ");
                            break;
                        case SANCTUARY:
                            System.out.print("S ");
                            break;
                        case ENEMY:
                            System.out.print("E ");
                            break;
                        case PORTAL:
                            System.out.print("O ");
                            break;
                        case PLAYER:
                            System.out.print("P ");
                            break;
                        default:
                            System.out.print("? ");
                            break;
                    }
                }
            }
            System.out.println();
        }
    }
}
