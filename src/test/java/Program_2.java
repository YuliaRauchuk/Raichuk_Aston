//2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
// В результате сравнения в консоль должно быть выведено одно из сообщений:
// "Строки неидентичны" или "Строки идентичны"
public class Program_2 {
    public static void main (String[] args)   {
        String str1 = "A";
        String str2 = "B";

        if(str1.equals(str2)){
            System.out.println("Строки идентичны");
        }else{
            System.out.println("Строки неидентичны");
        }
    }
}
