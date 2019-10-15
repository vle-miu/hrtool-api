package mti.vn.hrtool.service.impl;

import mti.vn.hrtool.dao.EmployeeMapper;
import mti.vn.hrtool.models.Employee;
import mti.vn.hrtool.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAllEmployees() {
        return employeeMapper.findAllEmployees();
    }

    @Override
    public Employee findEmployeeById(String employeeNo) {
        return employeeMapper.findEmployeeById(employeeNo);
    }
}
