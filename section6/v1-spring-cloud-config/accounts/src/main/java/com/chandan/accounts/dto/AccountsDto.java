package com.chandan.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(name = "Accounts", description = "Schema to hold Account information")
public class AccountsDto {

    @NotNull(message = "AccountNumber cannot be null")
    @Digits(integer = 10, fraction = 0, message = "AccountNumber must be a 10-digit number")
    @Schema(description = "Account Number of Eazy Bank account", example = "3454433243")
    private Long accountNumber;

    @NotEmpty(message = "AccountType can not be a null or empty")
    @Schema(description = "Account type of Eazy Bank account", example = "Savings")
    private String accountType;

    @NotEmpty(message = "BranchAddress can not be a null or empty")
    @Schema(description = "Eazy Bank branch address", example = "123 NewYork")
    private String branchAddress;
}
