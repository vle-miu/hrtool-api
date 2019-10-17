package mti.vn.hrtool.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import mti.vn.hrtool.models.Employee;
import mti.vn.hrtool.service.EmployeeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    private static final Logger logger = LogManager.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "Find all employees")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list")
    })
    @GetMapping(value = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> findAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @ApiOperation(value = "Find employee by employee no")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list")
    })
    @GetMapping(value = "/employee/{employeeNo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee findEmployeeById(
            @ApiParam(value = "Employee Number from which employee object will retrieve", required = true) @PathVariable("employeeNo") String employeeNo) {
        return employeeService.findEmployeeById(employeeNo);
    }

    @ApiOperation(value = "Find all employees of department")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list")
    })
    @GetMapping(value = "/employees/{departmentCd}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> findAllEmployeeByDepartmentCd(
            @ApiParam(value = "Department Code use to find all employees in this department", required = true) @PathVariable("departmentCd") String departmentCd) {
        return employeeService.findAllEmployeesByDepartmentCd(departmentCd);
    }

}
