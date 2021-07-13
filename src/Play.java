import model.Grid;
//import util.File;

public class Play
{
    public static void main(String[] args)
    {
        Grid grid = new Grid();
        grid.createGrid();
        grid.display_Grid();
        grid.setDefinition();
        grid.display_Grid();
        System.out.print("\n");
        grid.setDefinition();
        grid.display_Grid();
        System.out.print("\n");
        grid.setDefinition();
        grid.display_Grid();
        System.out.print("\n");
    }
}