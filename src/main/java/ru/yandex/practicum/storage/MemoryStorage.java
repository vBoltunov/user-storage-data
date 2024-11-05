package ru.yandex.practicum.storage;

import ru.yandex.practicum.user.User;

import java.util.HashMap;
import java.util.Map;
// Реализация интерфейса, которая сохраняет данные в хеш-таблице в памяти
public class MemoryStorage implements Storage {
    private Map<String, User> users = new HashMap<>();

    @Override
    public void put(final User user) {
        if (user.getDetails() == null || user.getDetails().getEmail() == null) {
            throw new IllegalStateException("Email should be passed");
        }
        final String email = user.getDetails().getEmail().toLowerCase();
        if (users.containsKey(email)) {
            throw new IllegalStateException("User already exists");
        }
        users.put(email, user);
    }

    @Override
    public User get(final String email) {
        if (email == null) {
            return null;
        }
        return users.get(email.toLowerCase());
    }
}