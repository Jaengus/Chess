package game;

import javafx.scene.layout.GridPane;

import boardgame.Position;

public class Grid extends GridPane
{
	public Position[][] positions;
	
	public Grid(Position[][] positions) 
	{
		this.positions = positions;
	}
}
