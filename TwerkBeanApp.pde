/// SOCIAL LANTERN MEDIA 2014


///---------------------------------IMPORT LIBRARIES------------------------------///

import ketai.sensors.*;  //Accelerometer
KetaiSensor sensor;
float accelerometerX, accelerometerY;

import ddf.minim.*; // default minim audio
import apwidgets.*; // import audio for android.app hack

import android.content.Context;
import android.app.Notification; //vibrate
import android.app.NotificationManager;//vibrate 
import android.media.SoundPool; 
import android.content.res.AssetManager;
import android.media.AudioManager;

APMediaPlayer pickup; 
APMediaPlayer bounce;
APMediaPlayer intro;


int numFrames = 5;
int framef = 0;
PImage [] hats = new PImage [numFrames];

float slidey; // X and Y coordinates of buttshake

PImage  ball; //bean
PImage first; //titlepage

PImage racket; //booty
PImage racket1; 
PImage floor;  //backpage

PImage bonusitem1;  //bling
PImage bonusitem2;  //bling
PImage die;  //replay page - tutorial
PImage end; //winner
PImage butt1;
PImage butt2; 

PImage shake;
PImage rumble;
PImage hat;


float angle;
float jitter;
float rock;
float angles;
float slidex;

float x1=width/2, y1=height/2;// ball
float disx, disy; //ball anim
float posx, posy; //ball loc
int start=1, play, dead, clear, item; //stages
int score=0, bonus=0, r=30, a=3; //given
int i; 
int jm =0;
int highscore = 100; 
float counter;

int itemX[] = new int [10];  
int itemY[] = new int [10];

NotificationManager gNotificationManager;
Notification gNotification;
long[] gVibrate = {
  0, 250, 50, 125, 50, 62
};

boolean playtime = false;

void setup()
{
  
  size(360, 480);
  frameRate(40); 
  smooth();
  noStroke();

  counter = 0.0; 
for (int s=0; s<numFrames; s++) {
    String hatss = "ball" + nf(s, 6) + ".png";
    hats[s] = loadImage(hatss);
  }

  intro = new APMediaPlayer(this);
  intro.setMediaFile("soundtrack.mp3");
  bounce = new APMediaPlayer(this);
  bounce.setMediaFile("bounce.wav");
  pickup = new APMediaPlayer(this);
  pickup.setMediaFile("Shine.mp3");


  background(0);
  
  if (playtime == true) {


  reset();
  } 
  //images
  ball = loadImage("ball.png");
  first = loadImage("FIRST.png"); 
  racket = loadImage("racket.png"); 
  floor = loadImage("floor.png"); 
  bonusitem1 = loadImage("bonusitem1.png"); 
  bonusitem2 = loadImage("bonusitem2.png"); 
  die = loadImage("die.png"); 
  end = loadImage("clear.png");
  shake = loadImage("shake.png");
  rumble = loadImage("rumble.png"); 
  hat = loadImage("hat.png"); 
  butt1 = loadImage("butt1.png");
  butt2 = loadImage("butt2.png"); 
  textSize(30); 
  
  intro.setLooping(true); 
  intro.start();
}

/// ACCELEROMETER VOID ///
void onAccelerometerEvent(float x, float y, float z)
{
  accelerometerX = x;
  accelerometerY = y;

  if (!mousePressed) {
    mouseX =  (int) y *45;
    mouseY = (int) x *45 ;
  }
}

///Android OnDestroy/OnResume hack


void onResume() {
  super.onResume();
  sensor = new KetaiSensor(this); // init sensors
  sensor.start(); // start sensors
  // Create our Notification Manager:
  gNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
  // Create our Notification that will do the vibration:
  gNotification = new Notification();
  // Set the vibration:
  gNotification.vibrate = gVibrate;
}
public void onPause() {
  sensor.stop(); // stop sensors when skecht is paussed/quit
  super.onPause();
}

public void onDestroy() {

  super.onDestroy(); //call onDestroy on super class

  if (intro!=null) { //must be checked because or else crash when return from landscape mode

    intro.release(); //release the player
  }
  
   if (bounce!=null) { //must be checked because or else crash when return from landscape mode

    bounce.release(); //release the player
  }
  
   if (pickup!=null) { //must be checked because or else crash when return from landscape mode

    pickup.release(); //release the player
  }
  
   
}
void draw() {

 framef = (framef+1)%numFrames;
  
  if (start==1) {
    image(first, 0, 0);
    if (second() % 2 == 0) {  
      jitter = random( -0.9, 0.9);
    }
    angle = angle + jitter;
    float c = cos(angle)/35;
    float d = cos(angle)/95;



    pushMatrix();
    translate(50, 50);
    rotate(d);

    image(rumble, -50, -50);
    popMatrix();

    pushMatrix();
    translate(48, 48);
    rotate(c);

    image(shake, -48, -49);

    popMatrix();

if (second() % 1 == 0) {  
    pushMatrix();
    translate(0, random(-6,6));
    image(hat, 0, 0);

    popMatrix();
}
if (mousePressed && playtime == true) {
      if (dist (mouseX, mouseY, width/2, height/2)<75) {
        gNotificationManager.notify(1, gNotification);
          play=1;
        start=0;
        reset();
      }
    }
  }
  if (play==1) {  //play stage
    image(floor, 0, 0); 
    for (i=0; i<itemX.length; i++) {//erase reps//

      //scores//
      if (score==(i+1)*50 || score ==(i+1)*100+1) {
        item+=i;
        int select = (int)random(1, 2); 
        if (item>=0) {

          if (select == 0) {
            image(bonusitem2, itemX[i]-25, itemY[i]-25);
            item=+i;
          } else if (select == 1) {
            image(bonusitem1, itemX[i]-25, itemY[i]-25);
            item=+i;
          } else if (select == 2) {
            image(bonusitem2, itemX[i]-25, itemY[i]-25);
            item=+i;
          }
        }
        if (dist(x1, y1, itemX[i], itemY[i])<125) { 
          gNotificationManager.notify(1, gNotification);

          item=-(i+i);
          bonus+=25; 
          score+=1; 
          pickup.seekTo(0);
          pickup.start(); 
          gNotificationManager.notify(1, gNotification);
        }
      }
    }
    text (score+bonus, width-160, 85);//actual score
    text (highscore, 105, 40);//highscore
    text(bonus, 210, 460);//bonus scores

    //ball scores//
    bouncyball(); 
    if (r==30) { //score moment
      score+=15;
      bounce.seekTo(0);
      bounce.start();
    }
  }
  if (dead==1) { //dead stage

    image(die, 0, 0);

    if (score >= highscore) {
      highscore = score;
    }
     if (score>=highscore) { //winning//
      play=0;
      clear=1;
    }
    if (mousePressed==true && playtime == true) {
      if (dist (mouseX, mouseY, width/2, height/2)<75) {//button thingy//
        gNotificationManager.notify(1, gNotification);
        dead=0;
        play=1;
        reset();
      }
    }
  }
  if (clear==1) { 
    image(end, 0, 0); 

    if (second() % 1 == 0) { 
      pushMatrix();
      translate(0, random(-1.5, 1.5));
      image(butt1, 0, 0);
      popMatrix();
    }

    if (second() % 1 == 0) {    
      pushMatrix();
      translate(0, random(-3, 3)); 
      image(butt2, 0, 0);
      popMatrix();
    }
      pickup.start(); 
      text (highscore, CENTER+225, 295);//highscore
      if (mousePressed==true && playtime == true) { 
      if (dist (mouseX, mouseY, width/2, height/2)<75) { //button again//
        gNotificationManager.notify(1, gNotification);
         clear=0;
        play=1;
        reset();
      }
    }
  }
}

void bouncyball() { 
  disx=x1-mouseX;//stup
  disy=y1-mouseY; //stupy

  
      pushMatrix();
      translate( 0, random(-6, 6)); 
      
      image(racket, mouseX-100, mouseY-100); 
      popMatrix();
    
   if (r>95 || r<30) { //constrain
    a*=-1; 
    r+=a;
  }
  r+=a; 
  
   if (r==30) {
    x1+=disx*0.177;
    y1+=disy*0.177;
    posx=disx; 
    posy=disy;
    if (dist(x1, y1, mouseX, mouseY)>120) {
      score-=10;      
      play=0;
      dead=1;
    }
  } else { //ball animation2//
    x1+=posx*0.06; 
    y1+=posy*0.06;
  }
  
  imageMode(CENTER);
  image(hats[framef], x1, y1, r, r);
  imageMode(CORNER);
  }
  
  void reset() {//gobackloop
  x1=width/2;
  y1=height/2;
  score=0;
  posx=0;
  posy=0;
  item=0;
  bonus=0;


  for (i=0; i < itemX.length; i++) {
    itemX[i]=(int)random(25, width-25); 
    itemY[i]=(int)random(25, height-25);
  }
}

void mouseReleased() {
  playtime = true;
}

void mouseClicked() {
  
    playtime = true;
}

