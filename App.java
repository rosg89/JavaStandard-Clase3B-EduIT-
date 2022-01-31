package edu.educacionit;

interface Playable{
    public void play();
}

interface Stopeable{
    public void stop();
}

interface Bucleable{
    public void bucle();
}

interface Videoclip extends Playable, Stopeable, Bucleable {
}

class Avi implements Videoclip{
    public void play(){
    System.out.println("Ejecutando interfaz Playable en Avi");
    }
    public void stop(){
    System.out.println("Ejecutando interfaz Stopeable en Avi");
    }
    public void bucle(){
    System.out.println("Ejecutando interfaz Bucleable en Avi");
    }
}

class Mp4 implements Videoclip{
    public void play(){
      System.out.println("Ejecutando interfaz Playable en Mp4");
    }
    public void stop(){
      System.out.println("Ejecutando interfaz Stopeable Mp4");
    }
    public void bucle(){
       System.out.println("Ejecutando interfaz Bucleable Mp4");
    }
}

class Mkv implements Videoclip {
    public void play(){
      System.out.println("Ejecutando interfaz Playable Mkv");
    }
    public void stop(){
      System.out.println("Ejecutando interfaz Stopeable Mkv");
    }
    public void bucle(){
      System.out.println("Ejecutando interfaz Bucleable Mkv");
    }
}

class AlimentacionAlterna implements Stopeable {
   public void stop(){
      System.out.println("Parar alimntacion x incendio");
   }
}


class App {
    private static void pararTodo(Stopeable[] arrVideoClip) {
        for (Stopeable v : arrVideoClip) {
            v.stop();
        }
    }
    public static void main(String... params){
        System.out.println("Hola");
        Mp4 videoClipMp4 = new Mp4();
        Avi videoClipAvi = new Avi();
        Mkv videoClipMkv = new Mkv();

        videoClipMp4.stop();

        Stopeable[] arrStop = {new Mp4(), new Mp4(), new Mp4(), new Mp4(),
                               new Mkv(), new Mkv(), new Mp4(), new Mp4(), new Mkv(),
                               new Mkv(), new Mkv(), new Mkv(), new Avi(), new Mkv(),
                               new Avi(), new AlimentacionAlterna()};

        pararTodo(arrStop);

    }
}

