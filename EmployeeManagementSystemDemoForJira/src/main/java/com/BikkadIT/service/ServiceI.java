package com.BikkadIT.service;

import com.BikkadIT.model.Entity;

public interface ServiceI 
{
 
	public Entity saveEmployee( Entity entity);
	public Entity getallEmployee();
	public void delete(int empid);
}
