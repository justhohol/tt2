package w_mediatormode;

public abstract class User {
	
	private MediatorI mediator;

	public User(MediatorI mediator){
		this.mediator = mediator;
	}
	public abstract void work();

	public MediatorI getMediator() {
		return mediator;
	}

	public void setMediator(MediatorI mediator) {
		this.mediator = mediator;
	}
}
