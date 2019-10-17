package mti.vn.hrtool.dao;

import mti.vn.hrtool.models.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    List<Employee> findAllEmployees();

    Employee findEmployeeById(String employeeNo);

    List<Employee> findAllEmployeesByDepartmentCd(String departmentCd);

}
