package homework_java_introduction_04.task4;

public enum Breeds {

    HUSKY("Хаскі"),
    DOBERMAN("Доберман"),
    GOLDEN_RETRIEVER("Золотий ретрівер"),
    BULLDOG("Бульдог"),
    POODLE("Пудель"),
    ROTTWEILER("Ротвейлер"),
    CHIHUAHUA("Чіхуахуа"),
    LABRADOR("Лабрадор"),
    GERMAN_SHEPHERD("Німецька вівчарка");

    private final String KIND_OF_BREED;

    Breeds(String KIND_OF_BREED) {
        this.KIND_OF_BREED = KIND_OF_BREED;
    }

    public String getKIND_OF_BREED() {
        return KIND_OF_BREED;
    }

}
