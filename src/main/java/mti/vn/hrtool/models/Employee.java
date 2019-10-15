package mti.vn.hrtool.models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Setter
@Getter
public class Employee {

    @NotNull(message = "Please provide an employee number")
    @Max(value = 20, message = "Employee number must be 20 characters")
    @Min(value = 20, message = "Employee number must be 20 characters")
    private String employeeNo;

    private String userLogin;

    private String password;

    private String userRole;

    private String firstName;

    private String lastName;

    private String email;

    private Integer gender;

    private String phoneNumber;

    private Boolean status;

    private String dateOfBirth;

    private String joiningDate;

    private String officialDate;

    private String resignDate;

    private String departmentCd;

    private String avatarLink;

    private Integer numberOfLoginFail;

    private String createdUser;

    private String updatedUser;

    private String createdDate;

    private String updatedDate;

    private Department department;

    private Position position;

    private Level level;

}
