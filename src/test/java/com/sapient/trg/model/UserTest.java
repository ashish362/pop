package com.sapient.trg.model;

import static org.junit.Assert.*;

import org.junit.Test;



public class UserTest {

	@Test
	public void testSetUsername() {
        User user = new User();
        user.setUsername("test");
        assertTrue(user.getUsername() == "test");
    }
	
	@Test
	public void testSetEmail() {
        User user = new User();
        user.setEmail("test");
        assertTrue(user.getEmail() == "test");
    }
	
}
