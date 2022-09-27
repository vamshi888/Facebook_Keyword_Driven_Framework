package com.bridzelabz.keyword.test;

import org.testng.annotations.Test;

import com.bridzelabz.keyword.engine.KeyWordEngine;



public class LoginTest {
	 public KeyWordEngine keyWordEngine;

	    @Test
	    public void loginTest(){
	        keyWordEngine = new KeyWordEngine();
	        keyWordEngine.startExecution("login");
	    }

	    @Test
	    public void signUpTest(){
	        keyWordEngine = new KeyWordEngine();
	        keyWordEngine.startExecution("signup");
	        
	    }
	

}
