package com.example.password_generator_api.service;

import com.example.password_generator_api.model.PasswordRequest;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    public PasswordService() {
    }

    public String generatePassword(PasswordRequest request) {
        StringBuilder characters = new StringBuilder();
        if (request.isUseUppercase()) {
            characters.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        }

        if (request.isUseLowercase()) {
            characters.append("abcdefghijklmnopqrstuvwxyz");
        }

        if (request.isUseNumbers()) {
            characters.append("0123456789");
        }

        if (request.isUseSpecialChars()) {
            characters.append("!@#$%^&*()_+-=[]{}|;:,.<>?");
        }

        if (characters.length() == 0) {
            throw new IllegalArgumentException("Debes seleccionar al menos un tipo de carácter.");
        } else if (request.getLength() < 1) {
            throw new IllegalArgumentException("La longitud debe ser mayor a 0.");
        } else {
            Random random = new Random();
            StringBuilder password = new StringBuilder();

            for(int i = 0; i < request.getLength(); ++i) {
                int index = random.nextInt(characters.length());
                password.append(characters.charAt(index));
            }

            return password.toString();
        }
    }
}