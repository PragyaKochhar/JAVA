class BoxWeightDemo {
    public static void main(String[] args) {
        System.out.println("Pragya Kochhar, 24csu155");

        BoxWeight box1 = new BoxWeight();
        BoxWeight box2 = new BoxWeight(10, 20, 30, 50);
        BoxWeight box3 = new BoxWeight(box2);

        System.out.println("Box 1:");
        box1.displayVolume();
        box1.displayWeight();

        System.out.println("Box 2:");
        box2.displayVolume();
        box2.displayWeight();

        System.out.println("Box 3:");
        box3.displayVolume();
        box3.displayWeight();
    }
}
