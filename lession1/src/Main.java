public class Main {
    public static void main(String[] args) {
        final Animal cat = new Cat((short) 20);
        final Cat tiger = new Tiger((short) 187.4f);
        final Speaker mew = new Cat((short) 78);

        Integer mew1 = (Integer)(Object) mew;

        final Animal[] animals = {cat, tiger};
        for (Animal animal : animals) {
            animal.speak();
        }
    }

    private interface Speaker {
        void speak();
    }

    private static abstract class Animal implements Speaker {
        private final String name;
        private final short weight;

        /**
         * Абстактный класс для всех лучших животных
         * @param name название животного
         * @param weight вес животного
         * @param param вес животного
         */
        Animal(String name, short weight) {
            this.name = name;
            this.weight = weight;
        }
    }

    private static class Cat extends Animal {
        Cat(short weight) {
            this("cat", weight);
        }

        private Cat(String name, short weight) {
            super(name, weight);
        }

        @Override
        public void speak() {
            System.out.println("mew");
        }
    }

    private static class Tiger extends Cat implements TigerI {
        Tiger(short weight) {
            super(weight);
        }

        @Override
        public void speak() {
            System.out.println("rrrrrr-rrR");
        }

        @Override
        public void swim() {
            System.out.println("slash");
            final int speed = 42;
            final boolean isWater = true;
            final int result;
            result = getResult(speed, isWater);
            System.out.println("result = " + result);
        }

        private int getResult(int speed, boolean isWater) {
            int result;
            if (isWater) {
                result = speed * 4;
            } else {
                result = speed / 4;
            }
            return result;
        }
    }
}
