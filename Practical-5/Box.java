class Box {
    private float width;
    private float height;
    private float depth;

    Box() {
        this.width = this.height = this.depth = 0;
    }

    Box(float w, float h, float d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    Box(Box b) {
        this.width = b.width;
        this.height = b.height;
        this.depth = b.depth;
    }

    public float getWidth() { return width; }
    public void setWidth(float width) { this.width = width; }

    public float getHeight() { return height; }
    public void setHeight(float height) { this.height = height; }

    public float getDepth() { return depth; }
    public void setDepth(float depth) { this.depth = depth; }

    public void displayVolume() {
        System.out.println("Volume = " + (width * height * depth));
    }
}