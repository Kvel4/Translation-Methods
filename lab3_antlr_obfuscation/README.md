# Лабораторная работа №3. Использование автоматических генераторов анализаторов Bison и ANTLR

### Введение
Цель данной лабораторной работы — научиться пользоваться
автоматическими генераторами анализаторов Bison и ANTLR.
Форма отчетности: программа и текстовый отчет. Средство
автоматической генерации вы можете выбрать самостоятельно.
Рекомендуемые источники:

[http://www.gnu.org/software/bison](http://www.gnu.org/software/bison) — Bison

[http://www.antlr.org](http://www.antlr.org) — ANTLR

### Вариант 6. Обфускация
Выберите подмножества языка C++, Java или Python и напишите
обфускатор для программ данного подмножества. Обфускатор должен
заменять имена переменных на случайные строки из символов I, 1, O и
0, которые являются корректными идентификаторами и в случае одинаково выглядящих символов I – 1 и O – 0, соответственно, выглядеть
одинаково. Также обфускатор должен вставлять в различные места программы незначащие действия с переменными, которые затрудняют понимание программы, в том числе добавлять новые переменные.

**Пример**:
```
int main() {
  int a, b;
  scanf("%d%d", &a, &b);
  printf("%d\n", a + b);
  return 0;
}
```
**Вывод**:
```
int main() {
  int I010I, IO1O1;
  scanf("%d%d", &I010I, &IO1O1);
  printf("%d\n", I010I + IO1O1);
  return 0;
}
```

### Решение:
Реализован обфускатор подмножества языка Java.
 
Main классом является [Main](lab3_antlr_obfuscation/src/main/kotlin/Main.kt). В коде указывается путь до файла с java кодом, на выход в консоль выводится обфусцированная версия.

[Грамматика ANTLR](lab3_antlr_obfuscation/src/main/antlr4/MyJava.g4)

#### Пример файла
```
class Main {
    public static void main(String[] args) throws Exception
    {
        String s = "";
        int a = 1, b = 0;
        double d = 123.0;

        do {
            int asd = 1;
        } while (a == 1)

        while (b < 10) {
            if (a == 1) {
                s = s + "asd";
            }
            d = d * 10;
        }

        System.out.println(s + a + b + d);
    }
}
```

#### Пример файла после трансляции   
```
class Main {
    public static void main(String[] O1O10I0) throws Exception
    {
        String O1010I0 = "";
        int I0IO1OI = 1, IO1OIOI = 0;
        double IOIOIO1 = 0.19563752435257886d + 0.9736076615735626d + 0.16947956066067682d * 0.046891602735804616d;
        double IOIO101 = 123.0;
        int IO10101 = I0IO1OI + 941249233 - -972769629 / IO1OIOI - IO1OIOI;

        do {
            int I0I0IO1 = 1;
        } while (I0IO1OI == 1)

        float O1OI0IO = 0.5361157f - 0.19684201f - 0.5146383f - 0.15821505f * 0.7360056f;

        while (IO1OIOI < 10) {
            if (I0IO1OI == 1) {
                O1010I0 = O1010I0 + "asd";
            }
            IOIO101 = IOIO101 * 10;
        }

        boolean OI0I0I0 = false && false && true || false || false;

        System.out.println(O1010I0 + I0IO1OI + IO1OIOI + IOIO101);

        double O10I01O = IOIO101 * IOIO101 - 0.03340329732724645d * IOIO101;
    }
}
```
