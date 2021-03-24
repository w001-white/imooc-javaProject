package com.imooc.Java.work.work1_4_3_3_20.Animal;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/22 15:00
 * @注释：
 */
public class Animal {
    private String kind;

    public Animal() {

    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Animal(String kind) {
        this.setKind(kind);
    }

    public void cry() {

    }

    public void cry(Animal[] animal) {
        for (int i = 0; i < animal.length; i++) {
            if (animal[i] instanceof Cat){
                Animal cat = (Cat) animal[i];
                cat.cry();
            }

            else if (animal[i] instanceof Dog){
                Animal dog = (Dog) animal[i];
                dog.cry();
            }
            else if (animal[i] instanceof Sheep){
                Animal sheep = (Sheep) animal[i];
                sheep.cry();
            }
        }
    }
}
