public class Main {

    public Main() {
        Tortoise tortoise = new Tortoise();
        Turtle turtle = new Turtle();
        Snake snake = new Snake();
        Otter otter = new Otter();
        Gorilla gorilla = new Gorilla();
        Bat bat = new Bat();

        tortoise.getInfo();
        turtle.getInfo();
        snake.getInfo();
        otter.getInfo();
        gorilla.getInfo();
        bat.getInfo();
        Console.readLine();
    }

    public static void main(String[] args) {
        new Main();
    }
}