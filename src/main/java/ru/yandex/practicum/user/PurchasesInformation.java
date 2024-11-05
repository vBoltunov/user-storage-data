package ru.yandex.practicum.user;

import lombok.Data;

import java.util.Date;

// Информация о покупках пользователя
@Data
public class PurchasesInformation {
    // Дата последней покупки
    private Date lastPurchase;
    // Общее количество покупок
    private long purchaseCounts = 0;
}