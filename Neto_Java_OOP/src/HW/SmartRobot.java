package HW;

class SmartRobot extends Robot {

    private int stepCount;

    @Override
    public void moveRight(){
        super.moveRight();
        stepCount++;
    }

    @Override
    public void moveLeft(){
        super.moveLeft();
        stepCount++;
    }

    @Override
    public void moveDown(){
        super.moveDown();
        stepCount++;
    }

    @Override
    public void moveUp(){
        super.moveUp();
        stepCount++;
    }

    public int getStepsCount() {
        return stepCount; // ваш код
    }
}