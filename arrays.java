import java.util.Scanner;
class arrays {
    public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
	int rows = 0;
	int columns = 0;
	String i = "O";
	
	int[][] array = new int[rows][columns];

	String [][] grid = new String [][]{
 		{i,i,i,i},
		{i,i,i,i},
		{i,i,i,i},
		{i,i,i,i}
		};

	for(int row = 0; row < grid.length; row++){
	for(int col = 0; col < grid[0].length; col++){
		System.out.print(grid[rows][columns] + " ");
		System.out.println();
}}