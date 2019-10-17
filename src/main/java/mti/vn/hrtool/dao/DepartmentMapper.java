package mti.vn.hrtool.dao;

import mti.vn.hrtool.models.Department;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    List<Department> findAllDepartments();

}