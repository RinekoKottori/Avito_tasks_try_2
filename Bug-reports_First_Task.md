## ID 
    BUG-1
## Название 
    Мини-карта в верхней части экрана не отображает выбранную область/город
## Предусловия 
    Перейти по ссылке: https://www.avito.ru
## Шаги воспроизведения
    Выбрать фильтр Москва и МО
## Ожидаемый результат
    Отображается карта и территория Москвы и МО
## Фактический результат
    Отображается карта и территория Санкт-Петербурга и ЛО
## Приоритет 
medium


## ID 
    BUG-2
## Название 
    Объявления не отсортированы при выборе сортировки по дате
## Предусловия 
    Перейти по ссылке: https://www.avito.ru
## Шаги воспроизведения
    Выбрать фильтр По дате
## Ожидаемый результат
    Произошла фильтрация по дате опубликования
## Фактический результат
    Фильтрация не произошла
## Приоритет 
high

## ID 
    BUG-3
## Название 
    Объявляния не корректно отфильтрованы при введении в поле "Где искать": Москва и МО
## Предусловия 
    Перейти по ссылке: https://www.avito.ru
## Шаги воспроизведения
    Выбрать фильтр Москва и МО
## Ожидаемый результат
    Отображаются объявления по Москве и МО
## Фактический результат
    Отображаются объявления по Санкт-Петербургу и ЛО
## Приоритет 
high

## ID 
    BUG-4
## Название 
    Объявления не корректно отфильтрованы при выборе категории "Посуточно"
## Предусловия 
    Перейти по ссылке: https://www.avito.ru
## Шаги воспроизведения
    Выбрать фильтр Посуточно
## Ожидаемый результат
    Все объявления соответствуют фильтру посуточно
## Фактический результат
    Есть заявление соответсвующее фильтру На длительный срок
## Приоритет 
high

## ID 
    BUG-5
## Название 
    Объявления не корректно отфильтрованы при указании максимальной цены за сутки
## Предусловия 
    Перейти по ссылке: https://www.avito.ru
## Шаги воспроизведения
    Указать максимальную цену за сутки 50 000 руб.
## Ожидаемый результат
    Во всех отображенных объявленияъ цена за сутки не превышает 50 000 руб.
## Фактический результат
    В отображенных объявлениях цена за сутки превышает 50 000 руб.
## Приоритет 
high

## ID 
    BUG-6
## Название 
    Объявления не корректно отфильтрованы при выборе категории "Пшеком до метро, минут" - 5
## Предусловия 
    Перейти по ссылке: https://www.avito.ru
## Шаги воспроизведения
    Выбрать radio button "Пшеком до метро, минут" - 5
## Ожидаемый результат
    Все объявления отфлильтрованы с удалёностью от метро в 5 минут
## Фактический результат
    В отображаемых объявлениях удалённость от метро превышает 5 минутную дистанцию
## Приоритет 
high

## ID 
    BUG-7
## Название 
    Неверный текст в кнопке "Найти" около поисковой строки
## Предусловия 
    Перейти по ссылке: https://www.avito.ru
## Шаги воспроизведения
    Найти кнопку "Найти" около поисковой строки
## Ожидаемый результат
    Текст кнопки: "Найти"
## Фактический результат
    Текст кнопки: "Найт"
## Приоритет 
low, но может быть и high так как это грамматическая ошибка и может пострадать репутцаия компании

## ID 
    BUG-8
## Название 
    Хлебные крошки отображают неверную категорию
## Предусловия 
    Перейти по ссылке: https://www.avito.ru
## Шаги воспроизведения
    Выбрать фильтры:
     Недвижимость 
     Дома, дачи и коттеджы  
     Снять 
     Посуточно
## Ожидаемый результат
    Главная > Недвижимость > Дома, дачи, коттеджи > Снять > Посуточно
## Фактический результат
    лавная > Недвижимость > Дома, дачи, коттеджи > Снять > На длительный срок
## Приоритет 
low

## ID 
    BUG-9
## Название 
    Объявления не скрылись при настройке фильтров таким образом, чтобы не было подходящих объявлений
## Предусловия 
    Перейти по ссылке: https://www.avito.ru
## Шаги воспроизведения
    Выбрать категорию: Недвижимость > Дома, дачи и коттеджы 
    Выбрать в выпадающих списках "Снять", "Гости" - 3
    Кликнуть radio-buttons "Посуточно", "Пешком до метро" - 5, "Парковка" - Неважно
    Выбрать дату с 1 - 4 июня 2025
    Выбрать чек-боксы: "Условия бронирования" - Без залога, "Правила" - "Можно с животными"
    В правом поле "Цена за сутки, руб." ввести 50 000
    
## Ожидаемый результат
    Объявления пропадут, появится надпись "Ничего не найдено в выбранной области поиска"
## Фактический результат
    Объявления остались, надпись появилась под отображаемыми объявлениями
## Приоритет 
medium

### Приоритет выставлен относительно серьезности бага, основываясь ломается функция той или иной кнопки/чего-то ещё или нет. 