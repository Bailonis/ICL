package AST;

import compile.CodeBlock;
import exceptions.ValueErrorException;

public class ASTNewArray implements ASTNode {
	ASTNode size;

	public void ASTNew(ASTNode size) {
	        this.size = size;
	    }

	@Override
	public IValue eval(Environment<IValue> env) throws ValueErrorException {
		IValue v = size.eval(env);

		if (v instanceof VInt) {
			return new VMCell[v];
		}

		throw new ValueErrorException("Not a Boolean or a Integer");
	}

	@Override
	public void compile(CodeBlock block, Environment<Pair<Integer, String>> e) {
		// TODO Auto-generated method stub
		
	}

}
