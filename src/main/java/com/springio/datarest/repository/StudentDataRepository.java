package com.springio.datarest.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.PathVariable;

import com.springio.datarest.model.Student;

@RepositoryRestResource(path="students", collectionResourceRel="students")
//@RestResource
public interface StudentDataRepository extends PagingAndSortingRepository<Student, Long>{

	public Student findByName(@PathVariable ("name") String name);
	public Student findByRank(@PathVariable ("rank") String rank);
	
}
