PImage minecraft;
PImage creeper;     //at the top of your program
int CX = 157;
int CY = 267;

void setup() {
  size(1000, 800); //in setup method
  minecraft = loadImage("minecraft.png");     //in setup method
  minecraft.resize(width, height);          //in setup method
  creeper=loadImage("creeper.png");     //in setup method
  creeper.resize(50,50);
}

void draw() {
  background(minecraft);
  image(creeper, CX, CY);     //in draw method
  if (mousePressed){
    if (mouseX > CX && mouseX < CX + 50 && mouseY > CY && mouseY < CY + 50){
      fill(0, 255, 0);
      ellipse(mouseX, mouseY, 10, 10);
      CX = (int) random (0, 950);
      CY = (int) random (0, 750);
    }else {
      fill(255, 0, 0);
      ellipse(mouseX, mouseY, 10, 10);
    }
  }
}
