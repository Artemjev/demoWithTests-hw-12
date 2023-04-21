package com.example.demowithtests.dto.passport;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;


@Data
@Builder
public class PassportPatchDto {

//    серийный номер документа не меняется.
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

}
