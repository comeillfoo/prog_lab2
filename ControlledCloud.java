public enum Actions { 
	IDLE, PRESS_WITH_ONE_LEG, PRESS_WITH_BOTH_LEG, SHAKE 
}

interface IOperatable {
	void Execute(Actions act)
	private void Rotate();
	private void JuiceUp();
	private void Ascend();
}

public class ControlledCloud extends Cloud implements IOperatable {
	public final Creation Operator; 
	public ControlledCloud(Creation c) {
		super();
		Operator = c;
	}

	@Override
	public void Execute(Actions act) {
		switch (a) {
			case (a == Actions.PRESS_WITH_ONE_LEG): Rotate(); break;
			case (a == Actions.PRESS_WITH_BOTH_LEG): JuiceUp(); break;
			case (a == Actions.SHAKE): Ascend(); break;
			default: Hover(); break;
		}
	}
	@Override
	private String Rotate() {
		return Operator.getTypeName() + " " + Operator.getName() + " развернул " + this.getTypeName();
	}
	@Override
	private String Ascend() {
		return Operator.getTypeName() + " " + Operator.getName() + ", сидя на " + this.getTypeName() + ", набирает высоту";
	}
	@Override
	private String JuiceUp() {
		return Operator.getTypeName() + " " + Operator.getName() + " нажал на " + this.getTypeName();
	}
}