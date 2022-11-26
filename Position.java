package boardgame;

import javafx.scene.Node;
import javafx.scene.image.*;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import game.Monad;

public class Position
{
	public Node icon;
	public String name;
	public double value;
	public Monad ruler;
	public int row, col;
	public double x, y;
	
	public Position(Node icon, String name, double value, Monad ruler)
	{
		this.icon = icon;
		this.name = name;
		this.value = value;
		this.ruler = ruler;
	}
	
	public Arc getArc() 
	{
		return (Arc)icon;
	}
	
	public Circle getCircle() 
	{
		return (Circle)icon;
	}
	
	public CubicCurve getCubicCurve() 
	{
		return (CubicCurve)icon;
	}
	
	public Ellipse getEllipse()
	{
		return (Ellipse)icon;
	}
	
	public Line getLine()
	{
		return (Line)icon;
	}
	
	public Path getPath() 
	{
		return (Path)icon;
	}
	
	public Polygon getPolygon() 
	{
		return (Polygon)icon;
	}
	
	public Polyline getPolyline()
	{
		return (Polyline)icon;
	}
	
	public QuadCurve getQuadCurve()
	{
		return (QuadCurve)icon;
	}
	
	public Rectangle getRectangle() 
	{
		return (Rectangle)icon;
	}
	
	public SVGPath getSVGPath()
	{
		return (SVGPath)icon;
	}
	
	public Text getText() 
	{
		return (Text)icon;
	}
	
	public ImageView getImageView() 
	{
		return (ImageView)icon;
	}
}
