package com.utbm.lo54.service;


import com.utbm.lo54.bean.Course;
import com.utbm.lo54.bean.CourseSession;
import org.springframework.stereotype.Service;


import java.text.ParseException;
import java.util.Date;
import java.util.List;
//import com.us.example.bean.User;

/**
 * The Interface StudentService.
 */
public interface CourseService {


	public List<Course> getCourseByWord(String word);

	public CourseSession getCourseById(int id);

//	public CourseSession getCourseByCourseId(long id);

	public List<CourseSession> getCourseByDate(String date) ;

	public List<CourseSession> getCourseByDateAndLocation(String date, String location);

//	public students saveone(students students);
//	@Transactional
//	public String deleteUser(String cas,String mdl);
//	@Transactional
//	public String deleteUser(Long id);
//
//	public students findChem(Long id);
//
//	public List<students> getAll();
//
//	students getUserByInchikey(String inchikey);
////
//	students getUserBySmiles(String smiles);
//
//	students getUserById(Long id);
//
//	String UpdateUser(students students);
}