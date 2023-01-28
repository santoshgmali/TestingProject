package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Employee;
import com.velocity.service.EmployeeService;

@RestController
public class EmployeeController {

	// EmployeeService reference inject
	@Autowired
	private EmployeeService employeeService; //EmployeeService empServiec=new EmployeeService();

	// Design the Restful web services to save the employee data into database.
	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		Employee emp = employeeService.saveEmployee(employee); //call save Employee method
		return ResponseEntity.ok().body(emp); //emp object is returning to saveEmployee() method
	}
	
	@GetMapping("/getEmployee")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id){
		
		Employee employee = employeeService.getEmployee(id);
		
		return ResponseEntity.ok().body(employee);
	}

}
