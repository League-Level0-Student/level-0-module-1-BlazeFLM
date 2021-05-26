PImage mushroom;
PImage olive;
PImage pepperoni;
void setup() {
size(500,500);
noStroke();
fill(215,153,20);
ellipse(250,250,300,300);
mushroom = loadImage("mushroom.png");
olive = loadImage("olive.png");  
pepperoni = loadImage("pepperoni.png");
mushroom.resize(50,50);
olive.resize(30,30);
pepperoni.resize(120,120);
}
void draw() {
if(mousePressed&& (mouseButton == RIGHT)) {
  image(mushroom,mouseX, mouseY);
}
if(mousePressed&&(mouseButton == LEFT)){
image (olive,mouseX,mouseY);
}
if(mousePressed&&(mouseButton == CENTER)){
image (pepperoni, mouseX,mouseY);
}
}
