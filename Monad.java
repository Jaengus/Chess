package game;

import javafx.scene.Node;
import javafx.scene.image.*;
import javafx.scene.shape.*;
import javafx.scene.text.Text;

public abstract class Monad 
{
	public Node icon;
	public String name;
	public double value;
	public int row, col;
	public double x, y;
	
	public Monad(Node icon, String name, double value) 
	{
		this.icon = icon;
		this.name = name;
		this.value = value;
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
	
	public abstract boolean move();
}
