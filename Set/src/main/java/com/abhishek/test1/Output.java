package com.abhishek.test1;

public class Output 
{
	Gem outputGenerator;

	public void generateOutput()
	{
		outputGenerator.quality();
	}

	//DI via setter method
	public void setOutputGenerator(Gem outputGenerator)
	{
		this.outputGenerator = outputGenerator;
	}
}
