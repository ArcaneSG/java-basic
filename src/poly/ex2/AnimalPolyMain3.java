package poly.ex2;

import java.util.Arrays;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        Animal[] animalArr = {new Dog(), new Cat(), new Cow(), new Duck()
                , new Pig() // 동물소리;;
        };

        Arrays.stream(animalArr)
                .forEach(AnimalPolyMain3::soundAnimal);
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
