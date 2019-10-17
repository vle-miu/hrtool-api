package mti.vn.hrtool.service;

import mti.vn.hrtool.models.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAllEmployees();

    Employee findEmployeeById(String employeeNo);

    List<Employee> findAllEmployeesByDepartmentCd(String departmentCd);

}
