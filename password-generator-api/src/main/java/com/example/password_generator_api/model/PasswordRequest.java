package com.example.password_generator_api.model;

public class PasswordRequest {
    private int length = 12;
    private boolean useUppercase = true;
    private boolean useLowercase = true;
    private boolean useNumbers = true;
    private boolean useSpecialChars = true;

    public PasswordRequest() {
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isUseUppercase() {
        return this.useUppercase;
    }

    public void setUseUppercase(boolean useUppercase) {
        this.useUppercase = useUppercase;
    }

    public boolean isUseLowercase() {
        return this.useLowercase;
    }

    public void setUseLowercase(boolean useLowercase) {
        this.useLowercase = useLowercase;
    }

    public boolean isUseNumbers() {
        return this.useNumbers;
    }

    public void setUseNumbers(boolean useNumbers) {
        this.useNumbers = useNumbers;
    }

    public boolean isUseSpecialChars() {
        return this.useSpecialChars;
    }

    public void setUseSpecialChars(boolean useSpecialChars) {
        this.useSpecialChars = useSpecialChars;
    }
}
