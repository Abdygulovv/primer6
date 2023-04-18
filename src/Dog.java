public class Dog {
    private String  nickname;
    private String  breed;
    private int speed;

    public void run() {
        for (int i = 0; i < speed; i++) {
            System.out.print("бегу, ");
        }
        System.out.println("бегу...");
    }

    public String info() {
        return  "Кличка: " + nickname + " Порода: " + breed + " Скорость: " + speed + "км/ч";
    }

    public Dog(String nickname, String breed, int speed) {
        this.nickname = nickname;
        this.breed = breed;
        this.speed = speed;
    }
}

