package asteroids;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Renderable;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;

public class Entity 
{
	
	protected Vector2f pos = new Vector2f(0,0);
	protected Vector2f vel = new Vector2f(0,0);
	protected Image image = null;
	protected float rotation = 0;
	protected float scale = 1.0f;
	private   int layer = 0;
	
	public Entity() throws SlickException
	{
	}

	public void update(GameContainer container, int delta) throws SlickException 
	{
		 
	}
	
	}