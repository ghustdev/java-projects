import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input: ");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] split = input.split(" ");
        int soma = 0;
        int numeroAtual = 0;
        int ultimaCentena = 0;
        boolean ultimoNumeroFoiEscala = false;
        for (int i = 0; i < split.length; i++) {
            NumberEnum numeroEnum = NumberEnum.forString(split[i]);
            if (numeroEnum.isNumeroEscala()) {
                numeroAtual += ultimaCentena;
                ultimaCentena = 0;
                numeroAtual = multiplicarNumAtualPorEscala(numeroAtual, numeroEnum);
                ultimoNumeroFoiEscala = true;
            } else {
                if (ultimoNumeroFoiEscala == true) {
                    if (numeroAtual < 1000) {
                        ultimaCentena = numeroAtual;
                        numeroAtual = 0;
                    } else {
                        soma += numeroAtual;
                        numeroAtual = 0;
                    }
                }
                numeroAtual += numeroEnum.getNumber();
                ultimoNumeroFoiEscala = false;
            }

            if (i == split.length - 1) {
                soma += ultimaCentena;
                soma += numeroAtual;
            }
        }
        System.out.println("Output: " + soma);
    }

    private static int multiplicarNumAtualPorEscala(int num, NumberEnum numeroEnum) {
        if (num == 0) {
            num = 1;
        }

        return  num * numeroEnum.getNumber();
    }

    private enum NumberEnum {
        ONE(1, "one"),
        TWO(2, "two"),
        THREE(3, "three"),
        FOUR(4, "four"),
        FIVE(5, "five"),
        SIX(6, "six"),
        SEVEN(7, "seven"),
        EIGHT(8, "eight"),
        NINE(9, "nine"),
        TEN(10, "ten"),
        ELEVEN(11, "eleven"),
        TWELVE(12, "twelve"),
        THIRTEEN(13, "thirteen"),
        FOURTEEN(14, "fourteen"),
        FIVETEEN(15, "fiveteen"),
        SIXTEEN(16, "sixteen"),
        SEVENTEEN(17, "seventeen"),
        EIGHTEEN(18, "eighteen"),
        NINETEEN(19, "nineteen"),
        TWENTY(20, "twenty"),
        THIRTY(30, "thirty"),
        FOURTY(40, "fourty"),
        FIFTY(50, "fifty"),
        SIXTY(60, "sixty"),
        SEVENTY(70, "seventy"),
        EIGHTY(80, "eighty"),
        NINETY(90, "ninety"),
        HUNDRED(100, "hundred"),
        THOUSAND(1000, "thousand"),
        MILLION(1000000, "million");

        private int number;
        private String text;

        NumberEnum(int number, String text) {
            this.number = number;
            this.text = text;
        }

        public static NumberEnum forString(String number) {
            if (number.equalsIgnoreCase("a"))
                return NumberEnum.ONE;

            for (NumberEnum num : NumberEnum.values() ) {
                if (number.equalsIgnoreCase(num.toString()))
                    return num;
            }
            throw new IllegalArgumentException("Not a valid number: " + number);
        }

        public boolean isNumeroEscala() {
            return this == HUNDRED || this == THOUSAND || this == MILLION;
        }

        public int getNumber() {
            return number;
        }

        public String getText() {
            return text;
        }
    }
}