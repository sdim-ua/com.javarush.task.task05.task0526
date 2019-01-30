
/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
    Man man1 = new Man("Tom", 59, "keryy htyy");
    Man man2 = new Man("Tom1", 591, "keryy htyy999");
  
    
    Woman woman1 = new Woman("To55m", 5955, "keryghjhjy htyy");;
    Woman woman2 = new Woman("To6565m", 5999, "kejhjhjhryy htyy");;
  
    
    }
    
    public static class Man{
        String name;
        int age;
        String address;
        
        public Man(String name, int age, String address) {
           this.name =  name;
           this.age  =  age;
           this.address = address;
           System.out.println(name +" "+ age +" " + address);
        }
        
    }

   public static class Woman {
        String name;
        int age;
        String address;
        
        public Woman (String name, int age, String address) {
           this.name =  name;
           this.age  =  age;
           this.address = address;
           System.out.println(name +" "+ age +" " + address);
        }
    }
    //напишите тут ваш код
}
