package mti.vn.hrtool.service.impl;

import mti.vn.hrtool.dao.DepartmentMapper;
import mti.vn.hrtool.models.Department;
import mti.vn.hrtool.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> findAllDepartments() {
        return departmentMapper.findAllDepartments();
    }
}