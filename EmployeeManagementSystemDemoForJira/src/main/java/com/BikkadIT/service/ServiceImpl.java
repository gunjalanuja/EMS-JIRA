package com.BikkadIT.service;

import com.BikkadIT.model.Entity;

public class ServiceImpl implements ServiceI{

	@Override
	public Entity saveEmployee(Entity entity) 
	{
		
		return null;
	}

	@Override
	public Entity getallEmployee() 
	{
		  System.out.println("Anuja");
		return null;
	}

	@Override
	public void delete(int empid)
	{
		System.out.println("Deleted");
		
	}

}
