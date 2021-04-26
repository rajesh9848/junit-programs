package com.tyss.junit.junitjupiter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JDBCCommandsMain {

	@Test
	void testAdd() {
		boolean expected=true;
		JDBCCommands comm=new JDBCCommands();
		boolean actual= comm.add("kartheek", "kartheek@");
		assertEquals(expected,actual);
	}
	@Test
	
	void testUpdate() {
		boolean expected=true;
		JDBCCommands comm=new JDBCCommands();
		boolean actual= comm.update("kartheek", "kar@");
		assertEquals(expected,actual);
	}
	@Test
	void testDelete() {
		boolean expected=true;
		JDBCCommands comm=new JDBCCommands();
		boolean actual= comm.delete("prasanna");
		assertEquals(expected,actual);
	}
	@Test
	void testSelect() {
		boolean expected=true;
		JDBCCommands comm=new JDBCCommands();
		boolean actual= comm.select("raj");
		assertEquals(expected,actual);
	
	}

}
