/**
 * Java 2 Homwork 2
 * 
 * @autor Irina 
 * @data 30.03.2022
 */
    
    class HomeWorkApp2 {
        public static void main(String[] args) {
        
        System.out.println(isWithinLimits(5, 8));
        System.out.println(isPositiveOrNegative(20));
        System.out.println(defineIfTrueNegative(24));
        printString("Hi, Java", 4);
        System.out.println(defineLeapYear(1979));
    }
    
    static boolean isWithinLimits(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    } 
        
    static String isPositiveOrNegative (int a) {
        return a >= 0? "Positive" : "Negative";
    }
    
    static boolean defineIfTrueNegative(int a) {
        return a < 0;
    }   
    
    static void printString(String string, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(string);
        }
    }
    
    static boolean defineLeapYear(int year) {
        if ((year % 4 != 0 && year % 4 != 100) || year % 400 !=0) return true;
        else {return false;
        }
    }
} 