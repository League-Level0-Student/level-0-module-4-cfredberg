import ddf.minim.*;          //at the very top of your sketch
AudioSample correctSound;
AudioSample wrongSound;
Minim minim = new Minim(this);
Minim minim1 = new Minim(this);

PImage donkey;
PImage tail;
boolean playSound = true;
boolean playSound1 = true;
void setup() {
  size(500, 500);
  donkey = loadImage("download.jpg");
  tail = loadImage("tail.png");
  donkey.resize(500,500);
  tail.resize(50, 50);
  correctSound = minim.loadSample("correct.wav");
  wrongSound = minim1.loadSample("wrong.wav");
}

int x;
int y;
boolean hasWon = false;
void draw() {
  background (255, 0, 0);
  rect(0, 0, 30, 30);
  rect(430, 250, 40, 40);
  if (mousePressed){
    x = mouseX;
    y = mouseY;
    if (dist(430, 250, mouseX, mouseY) < 40){
      hasWon = true;
    }else{
      hasWon = false;
      if (playSound1) {
       wrongSound.trigger();
       playSound = false;
      }
    }
  }
  if (hasWon == true){
    if (playSound) {
       correctSound.trigger();
       playSound = false;
      }
    background (donkey);
  }
  image(tail, x, y);
}
