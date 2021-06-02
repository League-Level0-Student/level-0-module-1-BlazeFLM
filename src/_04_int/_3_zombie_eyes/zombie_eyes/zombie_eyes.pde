
void setup() {
PImage face = loadImage("index.jpg");
size(500,500);
face.resize(width,height);
background(face);
}
void draw() {
fill(mouseX - 255, mouseY, 125);

ellipse(154, 233, 60, 60);
ellipse(344, 233, 60, 60);
fill(0);
ellipse(154,233,20,20);
ellipse(344,233,20,20);
  if(mousePressed){
  
println(mouseX+", "+mouseY); 
}
}
