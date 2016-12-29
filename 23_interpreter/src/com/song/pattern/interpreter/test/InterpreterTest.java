package com.song.pattern.interpreter.test;

import org.junit.Test;

import com.song.pattern.interpreter.context.Context;
import com.song.pattern.interpreter.expression.Minus;
import com.song.pattern.interpreter.expression.Plus;

public class InterpreterTest {

	@Test
	public void test(){
		//9+2-8
		int result = new Minus().interpret(new Context(new Plus().interpret(new Context(9, 2)), 8));
		System.out.println(result);	//3
		result = new Plus().interpret(new Context(9, new Minus().interpret(new Context(2, 8))));
		System.out.println(result);	//3
	}
}
