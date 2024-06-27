package com.example.activelifeconnect.advice;

public record AdviceResponseTo(
        String title,
        String text,
        AdviceCategory category
) {
}
