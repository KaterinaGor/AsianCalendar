package calendar;
import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {
        System.out.println("Программа определяет по номеру года его символ по восточному календарю");
        int year;
        String result1 ="";
        String result2 ="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        year = scanner.nextInt();
        int color = year%10;
        int animal = year%12;
        switch (color){
            case 0: result1 = "Металл";
                     break;
            case 1: result1 = "Металл";
                     break;  
            case 2: result1 = "Вода";
                     break;  
            case 3: result1 = "Вода";
                     break;  
            case 4: result1 = "Дерево";
                     break;  
            case 5: result1 = "Дерево";
                     break;  
            case 6: result1 = "Огонь";
                     break; 
            case 7: result1 = "Огонь";
                     break;  
            case 8: result1 = "Земля";
                     break;  
            case 9: result1 = "Земля";
                     break;           
         }
        switch (animal){
            case 0 : result2 = "Обезьяна";
                     break;
            case 1: result2 = "Петух";
                     break;  
            case 2: result2 = "Собака";
                     break;  
            case 3: result2 = "Свинья";
                     break;  
            case 4: result2 = "Крыса";
                     break;  
            case 5: result2 = "Бык";
                     break;  
            case 6: result2 = "Тигр";
                     break; 
            case 7: result2 = "Заяц";
                     break;  
            case 8: result2 = "Дракон";
                     break;  
            case 9: result2 = "Змея";
                     break;
            case 10: result2 = "Лошадь";
                     break; 
            case 11: result2 = "Овца";
                     break;    
         }
              System.out.println("Стихия года: "+result1+"\nТотемное животное: "+result2);
    }
    
}
