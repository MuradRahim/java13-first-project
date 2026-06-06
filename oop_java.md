# ООП для начинающих
## Объектно-ориентированное программирование на простых примерах Java

---

# Что такое ООП?

**ООП (Объектно-ориентированное программирование)** — это подход к разработке программ, где всё строится вокруг объектов.

Объект = сущность с:
- состоянием (данные)
- поведением (действия)

Примеры объектов из жизни:
- Машина
- Телефон
- Пользователь
- Банковская карта

В Java программы часто состоят из множества объектов.

---

# Пример из жизни

## Объект: Машина

### Состояние:
- цвет
- скорость
- марка

### Поведение:
- ехать
- тормозить
- сигналить

В Java это выглядит как класс.

---

# Что такое класс?

Класс — это шаблон для создания объектов.

## Пример класса Car

```java
public class Car {

    String brand;
    String color;
    int speed;

    void drive() {
        System.out.println("Машина едет");
    }
}
```

---

# Что такое объект?

Объект — это экземпляр класса.

## Создание объекта

```java
public class условныеОператоры.While {
    public static void main(String[] args) {

        Car car = new Car();

        car.brand = "Toyota";
        car.color = "Черный";
        car.speed = 120;

        car.drive();
    }
}
```

---

# Поля класса

Поля хранят состояние объекта.

```java
String brand;
String color;
int speed;
```

## Поля отвечают за данные

Например:
- имя пользователя
- возраст
- баланс
- цена товара

---

# Методы класса

Методы описывают поведение объекта.

```java
void drive() {
    System.out.println("Машина едет");
}
```

## Метод может:
- что-то выводить
- изменять данные
- возвращать результат

---

# Конструктор

Конструктор помогает удобно создавать объект.

## Пример

```java
public class Car {

    String brand;
    String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
}
```

## Создание объекта

```java
Car car = new Car("BMW", "Белый");
```

---

# Ключевое слово this

`this` — ссылка на текущий объект.

```java
this.brand = brand;
```

Слева:
- поле класса

Справа:
- параметр конструктора

---

# Инкапсуляция

## Что это?

Сокрытие данных и управление доступом к ним.

Для этого используют:
- private
- getter
- setter

---

# Пример инкапсуляции

```java
public class User {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

---

# Почему private полезен?

Без `private` любой код может изменить данные напрямую.

```java
user.name = "";
```

Это может привести к ошибкам.

Инкапсуляция помогает:
- защищать данные
- проверять значения
- контролировать доступ

---

# Наследование

## Что это?

Один класс может наследовать другой.

### Родитель:
- общие свойства

### Потомок:
- добавляет своё поведение

---

# Пример наследования

```java
public class Animal {

    void sound() {
        System.out.println("Животное издает звук");
    }
}
```

```java
public class Dog extends Animal {

    void bark() {
        System.out.println("Гав-гав");
    }
}
```

---

# Использование наследования

```java
public class условныеОператоры.While {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
        dog.bark();
    }
}
```

---

# Полиморфизм

## Что это?

Один метод может работать по-разному.

---

# Пример полиморфизма

```java
public class Animal {

    void sound() {
        System.out.println("Какой-то звук");
    }
}
```

```java
public class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Мяу");
    }
}
```

```java
public class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Гав");
    }
}
```

---

# Использование полиморфизма

```java
Animal animal1 = new Cat();
Animal animal2 = new Dog();

animal1.sound();
animal2.sound();
```

## Результат:

```text
Мяу
Гав
```

---

# Абстракция

## Что это?

Мы показываем только важное, скрывая сложную реализацию.

Пример:
- водитель нажимает педаль газа
- но не думает как работает двигатель внутри

---

# Абстрактный класс

```java
abstract class Animal {

    abstract void sound();
}
```

```java
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Гав");
    }
}
```

---

# Интерфейсы

Интерфейс описывает возможности класса.

## Пример

```java
interface Flyable {

    void fly();
}
```

```java
class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}
```

---

# Отличие класса и интерфейса

## Класс
- описывает объект
- хранит состояние
- содержит реализацию

## Интерфейс
- описывает возможности
- определяет контракт

---

# Пример из реального проекта

## UserService

```java
public class UserService {

    public void registerUser(String email) {
        System.out.println("Пользователь зарегистрирован: " + email);
    }
}
```

## Использование

```java
UserService userService = new UserService();
userService.registerUser("test@gmail.com");
```

---

# Где используется ООП?

ООП используется:
- Spring Boot
- Android
- Игры
- Банковские системы
- Интернет-магазины
- Микросервисы

Практически весь backend на Java строится на ООП.

---

# Основные принципы ООП

## 1. Инкапсуляция
Скрываем данные

## 2. Наследование
Переиспользуем код

## 3. Полиморфизм
Одинаковый интерфейс — разное поведение

## 4. Абстракция
Скрываем сложность

---

# Частые ошибки новичков

- делать все поля public
- создавать слишком большие классы
- дублировать код
- не разделять ответственность
- путать класс и объект

---

# Хорошая практика

## Один класс = одна ответственность

Например:
- UserService → работа с пользователями
- OrderService → работа с заказами
- PaymentService → работа с оплатой

---

# Мини-проект

## Задача

Создать класс:

### Product
Поля:
- name
- price

Методы:
- printInfo()

---

# Решение

```java
public class Product {

    String name;
    double price;

    void printInfo() {
        System.out.println(name + " : " + price);
    }
}
```

```java
public class условныеОператоры.While {
    public static void main(String[] args) {

        Product product = new Product();

        product.name = "Ноутбук";
        product.price = 450000;

        product.printInfo();
    }
}
```

---

# Итоги

После изучения ООП нужно понимать:

- что такое класс
- что такое объект
- как создавать методы
- зачем нужны конструкторы
- как работает наследование
- что такое полиморфизм
- зачем нужны интерфейсы

---

# Практика для закрепления

Попробуйте создать:

1. Класс Student
2. Класс Phone
3. Класс BankCard
4. Класс Animal
5. Класс Employee

Добавьте:
- поля
- методы
- конструкторы

---

# Спасибо за внимание

## Вопросы?

