package com.example.activelifeconnect.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessage {
    private Long errorCode;
    private String errorMessage;
}
