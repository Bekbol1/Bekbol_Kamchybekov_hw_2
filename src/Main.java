public class Main {
    public static void main(String[] args) {
        info(18, 15);
        info(generateRandomAge(), 10);
        info(15, -22);
        info(50, -5);
        info(generateRandomAge(),35);
    }

    public static void info(int age, int temperature) {
        String result = canWalk(age, temperature);
        System.out.println("Возраст: " + age + " Температура: " + temperature + " Вывод: " + result);
    }

    public static String canWalk(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        return (int) (Math.random() * 55);
    }
}

//тооитолотловаыаыв