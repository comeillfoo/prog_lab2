interface IFinding {
	String getDescription();
}

public class Control implements IFinding {
	Entity e = null;
	public Control(Entity e) {this.e = e;}
	@Override
	String getDescription() {
		return "\"" + e.getTypeName + " можно управлять\"";
	}
}