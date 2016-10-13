package r_chainofresponsibilitymode;

public abstract class AbstractHandler implements HandlerI {
	private HandlerI myhander;

	public HandlerI getMyhander() {
		return myhander;
	}

	public void setMyhander(HandlerI myhander) {
		this.myhander = myhander;
	}

}
