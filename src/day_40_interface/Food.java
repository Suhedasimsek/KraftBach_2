package day_40_interface;

public interface Food extends Animal{
    void meal();
}

class Chicken implements Food{
    @Override
    public void hunt() {

    }

    @Override
    public void meal() {

    }
}