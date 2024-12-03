package com.chandan.Loans.service;

import com.chandan.Loans.dto.LoansDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;

public interface iLoansService {
    /**
     *
     * @param mobileNumber - Mobile Number of the Customer
     */
    void createLoan(String mobileNumber);

    /**
     *
     * @param mobileNumber - Input mobile Number
     *  @return Loan Details based on a given mobileNumber
     */
    LoansDto fetchLoan(String mobileNumber);

    boolean updateLons(@Valid LoansDto loansDto);

    boolean deleteLoan(String mobileNumber);
}
