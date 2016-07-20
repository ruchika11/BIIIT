package final_;

public class ChessAlgorithm {
	final int a =0;
	public enum ChessPlayer { WHITE, BLACK }
	
	final ChessPlayer getFirstPlayer() {
        return ChessPlayer.WHITE;
    }
}

class A extends ChessAlgorithm{
	A b = new A();
	int c = super.a;
	ChessPlayer getFirstPlayer(){
		return ChessPlayer.WHITE;
		System.out.println(super.a);
	}
	
}


//you can not inherit final class and can not override final methods in sub class
//but you can declare final to overridden method in sub class if it is not final in super class
//String is the final class
//you can access final fields using super keyword but you can change their values;