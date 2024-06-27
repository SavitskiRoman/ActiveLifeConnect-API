package com.example.activelifeconnect.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class InternalServerException extends RuntimeException {
    private Long status;
    private String message;
}
