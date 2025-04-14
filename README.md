# Avito Tasks

| Dependencies      | Version |
|-------------------|---------|
| JUnit             | 5.11.0  |
| Allure            | 2.29.0  |
| JDK               | 17.0.6  |
| Maven             | 3.9.9   |
| Selenide          | 7.8.1   |
| Webdriver manager | 5.9.3   |

| Plugin         | Version | configuration |
| -------------- | ------- | ------------- |
| Maven-surefire | 3.5.0   |               |
| Allure-maven   | 2.15.2  |               |

# Running default tests

`mvn clean test`

# See results of tests in allure report in browser

`mvn allure:serve`

# Bug reports for 1 task

Bug-reports_First_Task.md

# Bug reports for 2 task

BUGS.md


# Instruction 
1. Скопировать репозиторий git clone https://github.com/RinekoKottori/Avito_tasks_try_2.git;
2. Убедитесь, что у вас установлена java/JDK версии 17.0.6, можно скачать с, например, сайта Oracle https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html, следуйте иструкции по установке;
3. Проверьте в терминале командой `java -version`, что версия 17.0.6 и что java установлена;
4. Убедитесь что у вас установлен Maven 3.9.9, можно скачать с, например, сайта Apache https://maven.apache.org/download.cgi, следуйте иструкции по установке;
5. Проверьте в терминале командой `mvn -v`, что версия 3.9.9 и Maven установлен;
6. Не забудьте добавить переменную среды в PATH путь к Maven и java/JDK;
7. Если у вас есть  IDE откройти в ней склонированный репозиторий, если нет используйте в терминале команду:  cd /здесь укажите путь до директории с проектом; 
8. Запустите команду `mvn clean test`;
9. Чтобы было удобно смотреть отчет по тестам запустите команду `mvn allure:serve`;