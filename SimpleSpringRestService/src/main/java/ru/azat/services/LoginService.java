package ru.azat.services;

import ru.azat.forms.LoginForm;
import ru.azat.transfer.TokenDto;

public interface LoginService {
    TokenDto login(LoginForm loginForm);
}
