package kr.co.shortenurlservice.presentation;

import javax.validation.constraints.NotNull;

public class ShortenUrlCreateRequestDto {
    @NotNull
    private String originalUrl;

    public ShortenUrlCreateRequestDto() {
    }

    public ShortenUrlCreateRequestDto(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }
}
