package com.example.healthassistant.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class BadRequestException extends RuntimeException {
    private Long status;
    private String message;
}
