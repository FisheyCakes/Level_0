import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World duck = new World();
		duck.show();
		Random w = new Random();
		Random e = new Random();
		int t = w.nextInt(9);
		int y = e.nextInt(9);
		int b = y-1;
		int n = y+1;
Location m = new Location(t, b);
Location v = new Location(t, n);	
		Location z = new Location(t, y);
Bug Stewart = new Bug();
Stewart.setColor(Color.magenta);
duck.add(z, Stewart);
Stewart.turn();
Stewart.turn();
Flower Flowey = new Flower();
Flowey.setColor(Color.YELLOW);
duck.add(m, Flowey);
duck.add(v, Flowey);	
	}
}
