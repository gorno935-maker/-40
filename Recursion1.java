import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recursion1 {

    // 1. Вывод чисел от 1 до N
    static void printUp(int n) {
        if (n < 1) return;
        printUp(n - 1);
        System.out.print(n + " ");
    }

    // 2. Вывод чисел от N до 1
    static void printDown(int n) {
        if (n < 1) return;
        System.out.print(n + " ");
        printDown(n - 1);
    }

    // 3. Сумма чисел от 1 до N
    static long sum(int n) {
        if (n <= 0) return 0;
        return n + sum(n - 1);
    }

    // 4. Факториал
    static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // 5. Возведение в степень (n >= 0)
    static long power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // 6. Сумма цифр
    static int digitSum(int n) {
        if (n == 0) return 0;
        return n % 10 + digitSum(n / 10);
    }

    // 7. Количество цифр
    static int digitCount(int n) {
        if (n < 10) return 1;
        return 1 + digitCount(n / 10);
    }

    // 8. Произведение цифр
    static int digitProduct(int n) {
        if (n < 10) return n;
        return (n % 10) * digitProduct(n / 10);
    }

    // 9. Максимальная цифра
    static int maxDigit(int n) {
        if (n < 10) return n;
        return Math.max(n % 10, maxDigit(n / 10));
    }

    // 10. Минимальная цифра
    static int minDigit(int n) {
        if (n < 10) return n;
        return Math.min(n % 10, minDigit(n / 10));
    }

    // 11. N-е число Фибоначчи
    static long fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    // 12. Сумма элементов массива
    static int sumArray(int[] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i] + sumArray(arr, i + 1);
    }

    // 13. Максимум массива
    static int maxArray(int[] arr, int i) {
        if (i == arr.length - 1) return arr[i];
        return Math.max(arr[i], maxArray(arr, i + 1));
    }

    // 14. Минимум массива
    static int minArray(int[] arr, int i) {
        if (i == arr.length - 1) return arr[i];
        return Math.min(arr[i], minArray(arr, i + 1));
    }

    // 15. Количество чётных элементов
    static int countEven(int[] arr, int i) {
        if (i == arr.length) return 0;
        return (arr[i] % 2 == 0 ? 1 : 0) + countEven(arr, i + 1);
    }

    // 16. Проверка на возрастание
    static boolean isSorted(int[] arr, int i) {
        if (i >= arr.length - 1) return true;
        return arr[i] <= arr[i + 1] && isSorted(arr, i + 1);
    }

    // 17. НОД
    static int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }

    // 18. НОК
    static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a / gcd(a, b) * b);
    }

    // 19. Перевод в двоичную систему
    static String toBinary(int n) {
        if (n < 0) return "-" + toBinaryPositive(-(long) n);
        return toBinaryPositive(n);
    }

    static String toBinaryPositive(long n) {
        if (n < 2) return Long.toString(n);
        return toBinaryPositive(n / 2) + (n % 2);
    }

    // 20. Сумма квадратов от 1 до N
    static long sumSquares(int n) {
        if (n <= 0) return 0;
        return (long) n * n + sumSquares(n - 1);
    }

    // 21. Переворот строки
    static String reverseString(String s) {
        if (s.length() <= 1) return s;
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    // 22. Проверка на палиндром
    static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) return true;
        return s.charAt(left) == s.charAt(right) && isPalindrome(s, left + 1, right - 1);
    }

    // 23. Количество вхождений символа
    static int countChar(String s, char c, int i) {
        if (i == s.length()) return 0;
        return (s.charAt(i) == c ? 1 : 0) + countChar(s, c, i + 1);
    }

    // 24. Количество русских и английских гласных
    static int countVowels(String s, int i) {
        if (i == s.length()) return 0;
        String vowels = "aeiouаеёиоуыэюя";
        int current = vowels.indexOf(Character.toLowerCase(s.charAt(i))) >= 0 ? 1 : 0;
        return current + countVowels(s, i + 1);
    }

    // 25. Удаление символа
    static String removeChar(String s, char c) {
        return removeChar(s, c, 0, new StringBuilder());
    }

    static String removeChar(String s, char c, int i, StringBuilder result) {
        if (i == s.length()) return result.toString();
        if (s.charAt(i) != c) result.append(s.charAt(i));
        return removeChar(s, c, i + 1, result);
    }

    // 26. Замена символа
    static String replaceChar(String s, char oldChar, char newChar) {
        return replaceChar(s, oldChar, newChar, 0, new StringBuilder());
    }

    static String replaceChar(String s, char oldChar, char newChar, int i, StringBuilder result) {
        if (i == s.length()) return result.toString();
        result.append(s.charAt(i) == oldChar ? newChar : s.charAt(i));
        return replaceChar(s, oldChar, newChar, i + 1, result);
    }

    // 27. Все символы одинаковые
    static boolean allSame(String s, int i) {
        if (i >= s.length() - 1) return true;
        return s.charAt(i) == s.charAt(i + 1) && allSame(s, i + 1);
    }

    // 28. Количество слов, разделённых пробелами
    static int countWords(String s, int i) {
        if (i >= s.length()) return 0;
        boolean startsWord = s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ');
        return (startsWord ? 1 : 0) + countWords(s, i + 1);
    }

    // 29. Частоты символов и проверка анаграммы
    static Map<Character, Integer> charFrequency(String s, int i, Map<Character, Integer> frequency) {
        if (i == s.length()) return frequency;
        char current = s.charAt(i);
        frequency.put(current, frequency.getOrDefault(current, 0) + 1);
        return charFrequency(s, i + 1, frequency);
    }

    static boolean isAnagram(String a, String b) {
        return charFrequency(a, 0, new HashMap<>()).equals(charFrequency(b, 0, new HashMap<>()));
    }

    // 30. Сравнение строк без equals
    static boolean compareStrings(String a, String b, int i) {
        if (i == a.length() && i == b.length()) return true;
        if (i >= a.length() || i >= b.length() || a.charAt(i) != b.charAt(i)) return false;
        return compareStrings(a, b, i + 1);
    }

    // 31. Быстрое возведение в степень
    static long fastPower(long a, int n) {
        if (n == 0) return 1;
        long half = fastPower(a, n / 2);
        return n % 2 == 0 ? half * half : half * half * a;
    }

    // 32. Бинарный поиск в отсортированном массиве
    static int binarySearch(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    static int binarySearch(int[] arr, int target, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target) return binarySearch(arr, target, mid + 1, hi);
        return binarySearch(arr, target, lo, mid - 1);
    }

    // 33. Сортировка слиянием
    static List<Integer> mergeSort(List<Integer> arr) {
        if (arr.size() <= 1) return new ArrayList<>(arr);
        int mid = arr.size() / 2;
        return merge(mergeSort(arr.subList(0, mid)), mergeSort(arr.subList(mid, arr.size())));
    }

    static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) result.add(left.get(i++));
            else result.add(right.get(j++));
        }
        result.addAll(left.subList(i, left.size()));
        result.addAll(right.subList(j, right.size()));
        return result;
    }

    // 34. Быстрая сортировка
    static List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() <= 1) return new ArrayList<>(arr);
        int pivot = arr.get(arr.size() / 2);
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        for (int value : arr) {
            if (value < pivot) less.add(value);
            else if (value > pivot) greater.add(value);
            else equal.add(value);
        }
        List<Integer> result = quickSort(less);
        result.addAll(equal);
        result.addAll(quickSort(greater));
        return result;
    }

    // 35. Ханойская башня
    static void hanoi(int n, String source, String target, String helper) {
        if (n == 0) return;
        hanoi(n - 1, source, helper, target);
        System.out.println("Переместить диск " + n + " со стержня " + source + " на " + target);
        hanoi(n - 1, helper, target, source);
    }

    // 36. Все подмножества
    static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        buildSubsets(arr, 0, new ArrayList<>(), result);
        return result;
    }

    static void buildSubsets(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        buildSubsets(arr, index + 1, current, result);
        current.add(arr[index]);
        buildSubsets(arr, index + 1, current, result);
        current.remove(current.size() - 1);
    }

    // 37. Уникальные перестановки строки
    static List<String> permutations(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        List<String> result = new ArrayList<>();
        buildPermutations(chars, new boolean[chars.length], new StringBuilder(), result);
        return result;
    }

    static void buildPermutations(char[] chars, boolean[] used, StringBuilder current, List<String> result) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (used[i] || (i > 0 && chars[i] == chars[i - 1] && !used[i - 1])) continue;
            used[i] = true;
            current.append(chars[i]);
            buildPermutations(chars, used, current, result);
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }

    // 38. Поиск пути в лабиринте
    static List<String> solveMaze(int[][] maze, int startRow, int startCol, int endRow, int endCol) {
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        List<String> path = new ArrayList<>();
        return findMazePath(maze, startRow, startCol, endRow, endCol, visited, path) ? path : null;
    }

    static boolean findMazePath(int[][] maze, int row, int col, int endRow, int endCol,
                                boolean[][] visited, List<String> path) {
        if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length
                || maze[row][col] == 1 || visited[row][col]) return false;
        visited[row][col] = true;
        path.add("(" + row + ", " + col + ")");
        if (row == endRow && col == endCol) return true;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int[] direction : directions) {
            if (findMazePath(maze, row + direction[0], col + direction[1],
                    endRow, endCol, visited, path)) return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    // 39. N ферзей
    static List<int[]> nQueens(int n) {
        List<int[]> solutions = new ArrayList<>();
        placeQueens(0, n, new int[n], new boolean[n], new boolean[2 * n - 1],
                new boolean[2 * n - 1], solutions);
        return solutions;
    }

    static void placeQueens(int row, int n, int[] board, boolean[] cols,
                            boolean[] diag1, boolean[] diag2, List<int[]> solutions) {
        if (row == n) {
            solutions.add(board.clone());
            return;
        }
        for (int col = 0; col < n; col++) {
            int d1 = row - col + n - 1;
            int d2 = row + col;
            if (cols[col] || diag1[d1] || diag2[d2]) continue;
            cols[col] = true;
            diag1[d1] = true;
            diag2[d2] = true;
            board[row] = col;
            placeQueens(row + 1, n, board, cols, diag1, diag2, solutions);
            cols[col] = false;
            diag1[d1] = false;
            diag2[d2] = false;
        }
    }

    static void printBoard(int[] solution) {
        for (int col : solution) {
            for (int j = 0; j < solution.length; j++) {
                System.out.print(j == col ? "Q " : ". ");
            }
            System.out.println();
        }
    }

    // 40. Генератор выражений с +, - и *
    static List<String> expressions(String digits, long target) {
        List<String> result = new ArrayList<>();
        buildExpressions(digits, target, 0, "", 0, 0, result);
        return result;
    }

    static void buildExpressions(String digits, long target, int pos, String expression,
                                 long value, long last, List<String> result) {
        if (pos == digits.length()) {
            if (value == target) result.add(expression);
            return;
        }
        for (int end = pos + 1; end <= digits.length(); end++) {
            String part = digits.substring(pos, end);
            if (part.length() > 1 && part.charAt(0) == '0') break;
            long number = Long.parseLong(part);
            if (pos == 0) {
                buildExpressions(digits, target, end, part, number, number, result);
            } else {
                buildExpressions(digits, target, end, expression + "+" + part,
                        value + number, number, result);
                buildExpressions(digits, target, end, expression + "-" + part,
                        value - number, -number, result);
                buildExpressions(digits, target, end, expression + "*" + part,
                        value - last + last * number, last * number, result);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Задания 1-11:");
        printUp(5);
        System.out.println();
        printDown(5);
        System.out.println();
        System.out.println(sum(10));            // 55
        System.out.println(factorial(5));       // 120
        System.out.println(power(2, 10));       // 1024
        System.out.println(digitSum(583));      // 16
        System.out.println(digitCount(12345));  // 5
        System.out.println(digitProduct(234));  // 24
        System.out.println(maxDigit(48251));    // 8
        System.out.println(minDigit(48251));    // 1
        System.out.println(fib(10));            // 55

        int[] values = {5, 2, 9, 1, 5, 6, -3};
        int[] sortedValues = {1, 2, 3, 4, 5, 6};
        System.out.println("\nЗадания 12-20:");
        System.out.println("12. Сумма массива: " + sumArray(values, 0));
        System.out.println("13. Максимум массива: " + maxArray(values, 0));
        System.out.println("14. Минимум массива: " + minArray(values, 0));
        System.out.println("15. Чётных элементов: " + countEven(values, 0));
        System.out.println("16. Массив отсортирован: " + isSorted(sortedValues, 0));
        System.out.println("17. НОД(48, 18): " + gcd(48, 18));
        System.out.println("18. НОК(12, 18): " + lcm(12, 18));
        System.out.println("19. 42 в двоичной системе: " + toBinary(42));
        System.out.println("20. Сумма квадратов до 5: " + sumSquares(5));

        String text = "А роза упала на лапу Азора";
        System.out.println("\nЗадания 21-30:");
        System.out.println("21. Переворот строки: " + reverseString("hello"));
        System.out.println("22. Палиндром: " + isPalindrome("level"));
        System.out.println("23. Букв 'a' в banana: " + countChar("banana", 'a', 0));
        System.out.println("24. Гласных в строке: " + countVowels(text, 0));
        System.out.println("25. Удалить 'l' из hello: " + removeChar("hello", 'l'));
        System.out.println("26. Заменить 'o' на 'a': " + replaceChar("hello", 'o', 'a'));
        System.out.println("27. Все символы одинаковые в 'aaa': " + allSame("aaa", 0));
        System.out.println("28. Слов в строке: " + countWords("hello  world again", 0));
        System.out.println("29. Анаграмма listen/silent: " + isAnagram("listen", "silent"));
        System.out.println("30. Строки равны: " + compareStrings("hello", "hello", 0));

        System.out.println("\nЗадания 31-40:");
        System.out.println("31. 2 в степени 10: " + fastPower(2, 10));
        System.out.println("32. Индекс числа 5: " + binarySearch(sortedValues, 5));
        System.out.println("33. Сортировка слиянием: " + mergeSort(Arrays.asList(5, 2, 9, 1, 5, 6, -3)));
        System.out.println("34. Быстрая сортировка: " + quickSort(Arrays.asList(5, 2, 9, 1, 5, 6, -3)));
        System.out.println("35. Ханойская башня (3 диска):");
        hanoi(3, "A", "C", "B");
        System.out.println("36. Подмножества [1, 2, 3]: " + subsets(new int[]{1, 2, 3}));
        System.out.println("37. Перестановки AAB: " + permutations("AAB"));

        int[][] maze = {
                {0, 1, 0, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0}
        };
        System.out.println("38. Путь в лабиринте: " + solveMaze(maze, 0, 0, 4, 4));
        List<int[]> queenSolutions = nQueens(6);
        System.out.println("39. N ферзей (N=6): решений " + queenSolutions.size() + ", первое решение:");
        printBoard(queenSolutions.get(0));
        System.out.println("40. Выражения для 123 -> 6: " + expressions("123", 6));
    }
}