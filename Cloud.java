public class Cloud extends Entity {
	public String Hover() {
		return this.getTypeName() + " парит";
	}
	public String Hover(String like) {
		return Hover() + ", словно " + like;
	}
}