package com.example.demo;

class TVControl{
    public static void main(String[] args) {
        TV lgTV = new TV("lgTV");
        TV sTV = new TV("samsungTV");
        TV hTV = new TV("HP", 2048);

        System.out.println(hTV.getCurrent());
        hTV.setCurrent(11);
        System.out.println(hTV.getCurrent());

        System.out.println(hTV.resolution);
    }
}

public class TV {
    // 속성
    String modelName;
    int[] ch;
    int vol, resolution;
    private int current;
    Boolean power;

    
    // tvName을 매개 변수로 받는 생성자
    TV(String tvName){
        modelName = tvName;
        resolution = 1024;
        power = false;
        vol = 0;
        current = 0;
        ch = new int[100];
        for(int i = 0; i<ch.length; i++){
            ch[i] = i+1;
        }
    }
    // tvName과 resolution을 매개변수로 받는 생성자 (오버로딩)
    TV(String tvName, int resolution){
        modelName = tvName;
        this.resolution = resolution;
        power = false;
        vol = 0;
        current = 0;
        ch = new int[100];
        for(int i = 0; i<ch.length; i++){
            ch[i] = i+1;
        }
    }

    // TV클래스 타입의 객체를 반환하는 메소드
    public TV getTV(){
        return this;
    }

    // 기능
    public void onOff(Boolean power){
        if(power){
            System.out.println("TV on~~~");
        } else{
            System.out.println("TV를 off~~~");
        }

    }
    public void volumeUp(){
        System.out.println("볼륨을 한 단계 올립니다.");
    }
    public void volumeDown(){
        System.out.println("볼륨을 한 단계 줄입니다.");
    }
    public void channelUp(){
        System.out.println("채널을 하나 증가시킵니다.");
    }
    public void channelDown(){
        System.out.println("채널을 하나 감소시킵니다.");
    }
    public void channelMove(int ch){
        System.out.println(ch + "번 채널로 이동합니다.");
    }
    // private 접근제한자가 붙은 변수에 접근하는 메소드(Getter, Setter)
    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

}
