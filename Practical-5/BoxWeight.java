class BoxWeight extends Box {
    private float weight;

    BoxWeight() {
        super();
        this.weight = 0;
    }

    BoxWeight(float w, float h, float d, float weight) {
        super(w, h, d);
        this.weight = weight;
    }

    BoxWeight(BoxWeight bw) {
        super(bw);
        this.weight = bw.weight;
    }

    public float getWeight() { 
	return weight; 
    }
    public void setWeight(float weight) {
	this.weight = weight; 
    }

    public void displayWeight() {
        System.out.println("Weight = " + weight);
    }
}


