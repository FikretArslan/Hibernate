package com.hb.services;

import com.hb.domain.Teacher;

public interface ITeacherService {
	
	public void createTeacher(Teacher teacher);
	public void removeTeacher(Teacher teacher);
	public Teacher findByIdTeacher(int id);
	public Teacher UpdateTeacher(int id, String name);

}
