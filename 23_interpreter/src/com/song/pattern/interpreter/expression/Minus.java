package com.song.pattern.interpreter.expression;

import com.song.pattern.interpreter.context.Context;

public class Minus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1() - context.getNum2();
	}

}
