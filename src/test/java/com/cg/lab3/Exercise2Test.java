
package com.cg.lab3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Exercise2Test {
	private  Exercise2 mirrorimage;
	@Before
	public void setup()
	{
		mirrorimage = new Exercise2();
	}
	@Test
	public void get_StringAsEmpty_AndreturnnullAsString() {
		String ar="";
		String arr=mirrorimage.getImage(ar);
		assertEquals("",arr);
	}
	@Test
	public void getStringsAs_morethan2_AndreturnMirrorimageAsString(){
		String ar= "4321";
		String arr=mirrorimage.getImage(ar);
		StringBuilder str=new StringBuilder(ar);
	    StringBuilder st=new StringBuilder(ar);
	    st=st.reverse();
	    StringBuilder res=str.append("|"+st);
		String ar1=res.toString();
		assertEquals(ar1,arr);
	}	
}