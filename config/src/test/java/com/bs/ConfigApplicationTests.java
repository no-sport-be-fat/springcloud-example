package com.bs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ConfigApplicationTests {

	@Test
	public void contextLoads() {
		Double e =Math.pow(2,64);
		long c = 0l;
		for(int i=0;i<10000;i++){
			Double d = Math.pow(2,i);
			c+=d.longValue();
			System.out.println(c);
			if(c<0){
				System.out.print(i);
				break;
			}
		}
	}

}
