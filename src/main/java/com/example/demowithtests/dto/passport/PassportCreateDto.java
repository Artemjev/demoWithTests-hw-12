package com.example.demowithtests.dto.passport;

import com.example.demowithtests.domain.Employee;
import com.example.demowithtests.dto.employee.EmployeeReadDto;
import com.example.demowithtests.dto.photo.PhotoReadDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Set;


@Data
@Builder
public class PassportCreateDto {

//    public Integer id;

//    private String serialNumber;

    @NotNull(message = "Name may not be null")
    @Size(min = 2, max = 32, message = "Name must be between 2 and 32 characters long")
    @Schema(description = "First name of the passport holder.", example = "Billy", required = true)
    public String firstName;

    @NotNull(message = "Second name may not be null")
    @Size(min = 2, max = 32, message = "Second name must be between 2 and 32 characters long")
    @Schema(description = "Second name of the passport holder.", example = "Bones", required = true)
    public String secondName;

    @Schema(description = "Birth date  of the passport holder.")
    private LocalDateTime birthDate;

    @Schema(description = "Passport expiration date.")
    private LocalDateTime expirationDate;


    // Паспорта создаются без владельца.
    //    @Schema(description = "The employee who is the passport holder.", required = false)
    //    public EmployeeReadDto employee;

//    //todo !!! Технических полей, вроде, в дто быть не должно !!!
//    @Schema(description = "The field indicates whether the passport is deleted.", example = "false",
//            required = true)
//    public Boolean isDeleted;
//
//    //todo !!! Технических полей, вроде, в дто быть не должно !!!
//    @Schema(description = "The field indicates whether the passport was issued to somebody.",
//            example = "false", required = true)
//    public Boolean isIssued;
//
//    //todo !!! Технических полей, вроде, в дто быть не должно !!!
//    @Schema(description = "The field indicates whether the passport is expired.",
//            example = "false", required = true)
//    private Boolean isExpired;

}
