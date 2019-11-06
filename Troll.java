default abstract class Entity {
	public String getTypeName() {return this.getClass().getName();}
}
default abstract class Creation extends Entity {}

interface IEinstenable {
	void MaketheDiscovery(IFinding d);
}

public class Troll extends Creation implements IEinsteinable {
	private String name;
	private IFinding d = null;
	private Entity e = null;
	public void Shout(String text) {System.out.println(this.getTypeName() + " " + name + " закричал: \"" + text + "\"");}
	public String getName() {return this.name;}

	public Troll(String name){this.name = name;}

	public String Board(Entity e) {
		this.e = e;
		return this.getTypeName() + " " + name + " взобрался на " + this.e.getTypeName(); 
	}
	public Do(Actions act) {
		if (d != null && e != null)
			e.Execute(act);
	}

	@Override
	public String MaketheDiscovery(IFinding d) {
		this.d = d;
		return this.getTypeName() + " " + name + " совершил открытие: " + d.getDescription();
	}
}