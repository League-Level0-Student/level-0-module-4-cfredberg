PImage face;
void setup() {
  face = loadImage("images.jpg");
  size(258, 195);
}

void draw() {
  int x = mouseX;
  int y = mouseY;
  background(face);
  fill(255, 255, 255);
  if (x > 137){
    x = 137;
  }else if (x < 128){
    x = 128;
  }
  
  if (y > 46){
    y = 46;
  }else if (y < 36){
    y = 36;
  }
  ellipse(133, 41, 15, 15);
  ellipse(158, 41, 15, 15);
  fill(0);
  ellipse(x, y, 5, 5);
  ellipse(x+25, y, 5, 5);
}

void mousePressed(){
  println(mouseX, mouseY);
}
