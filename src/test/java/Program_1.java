//1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
//- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов:
// "a > b", "a < b" или "a = b";
//- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
public class Program_1 {
    public static void main(String[] args) {
    int a = 10;
    int b = 7;

    boolean c1 = (a>b);
    boolean c2 = (a<b);
    boolean c3 = (a==b);
        {
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        int c4 = a+b;
        int c5 = a-b;
        int c6 = a*b;
        int c7 = a/b;
        {
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
    }}
}}
