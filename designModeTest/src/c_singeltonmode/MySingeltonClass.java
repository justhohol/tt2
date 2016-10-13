package c_singeltonmode;

public class MySingeltonClass {
	private MySingeltonClass(){
		
	}

	private static class MySingeltonClassFactory {
		private static MySingeltonClass ins = null;
		private MySingeltonClassFactory() {
			ins = new MySingeltonClass();
		}
	}

	public MySingeltonClass getInstense() {
		return MySingeltonClassFactory.ins;
	}
}
