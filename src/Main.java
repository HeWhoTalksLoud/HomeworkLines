public class Main {
    public static void main(String[] args) {

        // Первый отрезок
        int a1 = 9;
        int b1 = 23;

        // Второй отрезок
        int a2 = 12;
        int b2 = 25;

        if (a1 == b1 || a2 == b2)
        {
            System.out.println("Начальная и конечная точки отрезка не должны совпадать!");
            return;
        }

        // Пусть отрезок ab - тот из двух отрезков, чье начало (a1 или a2)
        // на числовой прямой ближе к нулю, а cd - другой отрезок.
        int a, b, c, d;
         if (a1 < a2)
         {
            a = a1; b = b1;
            c = a2; d = b2;
         }
         else
         {
            a = a2; b = b2;
            c = a1; d = b1;
         }

         if (b < c)
         {
             System.out.println("Пересечения нет");
         } else if (b == c)
            System.out.println(b);
            else // b > c, есть пересечение с правым отрезком или полное его перекрытие
            // (во втором случае искомым пересечением будет правый отрезок целиком)
            {
                System.out.println(c + ", " + Math.min(b, d));

            }
    }
}