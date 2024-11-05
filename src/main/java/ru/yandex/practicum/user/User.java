package ru.yandex.practicum.user;

import lombok.Data;
import lombok.NonNull;

@Data
public class User {
    // Детализированная информация о пользователе
    @NonNull
    private Details details;
    // Информация о покупках пользователя
    private PurchasesInformation purchasesInformation = new PurchasesInformation();
}