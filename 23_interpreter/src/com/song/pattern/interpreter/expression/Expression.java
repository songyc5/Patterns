package com.song.pattern.interpreter.expression;

import com.song.pattern.interpreter.context.Context;

public interface Expression {
	
	public int interpret(Context context);
}
