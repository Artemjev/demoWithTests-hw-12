package com.example.demowithtests.dto.employee;

import com.example.demowithtests.domain.Gender;
import com.example.demowithtests.dto.address.AddressDto;
import com.example.demowithtests.dto.photo.PhotoReadDto;
import com.example.demowithtests.util.validation.annotation.constraints.IsBooleanFieldValidConstraint;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Data
public class EmployeePatchDto {

    @NotNull(message = "Name may not be null")
    @Size(min = 2, max = 32, message = "Name must be between 2 and 32 characters long")
    @Schema(description = "Name of an employee.", example = "Billy", required = true)
    public String name;

    @Schema(description = "Name of the country.", example = "England", required = true)
    public String country;

    @Email
    @NotNull
    @Schema(description = "Email address of an employee.", example = "billys@mail.com",
            required = true)
    public String email;

    @Enumerated(EnumType.STRING)
    @Schema(description = "Gender of an employee. Valid values: M, F.", example = "M",
            required = true)
    public Gender gender;

    @Schema(description = "Employee address list.")
    public Set<AddressDto> addresses = new HashSet<>();

    @Schema(description = "The time when employee was added. The value is assigned automatically.")
    public LocalDateTime datetime = LocalDateTime.now();

    //todo !!! Технических полей, вроде, в дто быть не должно !!!
    @Schema(description = "The field indicates whether the employee is deleted.", example = "false",
            required = true)
    public Boolean isDeleted;

    @Schema(description = "The field indicates whether the employee is private.", example = "false",
            required = true)
    public Boolean isPrivate;

    @IsBooleanFieldValidConstraint(value = false,
            message = "@IsBooleanFieldValid validation: the status isConfirmed=true can only " +
                    "be set by employee himself via confirmation email!")
    @Schema(description = "The field indicates whether the employee's data has been confirmed.",
            example = "false",
            required = true)
    public Boolean isConfirmed;

    @Schema(description = "Employee photos set.", required = false)
    public Set<PhotoReadDto> photos;
}
