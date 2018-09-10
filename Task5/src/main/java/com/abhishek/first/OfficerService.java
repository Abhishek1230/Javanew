package com.abhishek.first;
import java.util.ArrayList;
import java.util.List;

public class OfficerService 

{
	List<Officer> o = new ArrayList<Officer>();
	
	public void save(Officer of)
	{
		o.add(of);
		System.out.println("Adding Officer name");
		for(Officer of1: o)
		{
			
		}
	}
	public List<Officer> display() 
	{
		for(Officer of1 : o) 
		{
			
			System.out.println(of1);
		}
		return o;
	}	


}
