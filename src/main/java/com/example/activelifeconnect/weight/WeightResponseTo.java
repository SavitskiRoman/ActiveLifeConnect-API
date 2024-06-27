package com.example.activelifeconnect.weight;

import lombok.Builder;

@Builder
public record WeightResponseTo (
        Long weight,

        String dateTime
)
{
}
