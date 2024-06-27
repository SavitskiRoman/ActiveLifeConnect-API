package com.example.activelifeconnect.weight;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

public record WeightRequestTo (
        @NotBlank
        @Schema(example = "100")
        Long weight,

        String dateTime
)
{
}
