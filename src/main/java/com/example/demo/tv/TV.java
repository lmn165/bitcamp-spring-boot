package com.example.demo.tv;

class TVControl{
    public static void main(String[] args) throws InterruptedException {
        TV lgTV = new TV("lgTV");
        TV sTV = new TV("samsungTV");
        TV hTV = new TV("HP", 2048);

        // 객체의 배열 출력
        /*int[] ch = hTV.getCh();
        for (int i=0; i<ch.length; i++) {
            System.out.println(ch[i]);
        }*/
        /*for(int ch : hTV.getCh()){
            System.out.println(ch);
//            Thread.sleep(500);
        }*/

        // 오버라이딩 결과 확인
/*        System.out.println(hTV.toString());
        System.out.println(hTV.sound());*/

//        각 객체에서 정적 메소드에 접근 가능한지 확인하는 실행문
/*        lgTV.testM();
        sTV.testM();*/

//      접근 제한자 private이 붙어있는 변수에 값을 변경하는 실행문
        System.out.println(hTV.getCurrent());
        hTV.setCurrent(7);
        System.out.println(hTV.getCurrent());
        System.out.println(hTV.resolution);
    }
}

public class TV extends Speaker{
    // 속성
    String modelName;
    int[] ch;
    int vol, resolution;
    private int current;
    Boolean power;
    static int testNum;

    
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
/*
    정적 메소드 선언
    static public void testM(){
        System.out.println("정적메소드 tM입니다.");
    }
*/

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
    public void channelMove(int ch){
        System.out.println(ch + "번 채널로 이동합니다.");
    }

    // private 접근제한자가 붙은 변수에 접근하는 메소드(Getter, Setter)
    public int getCurrent() {
        return current;
    }
    public void setCurrent(int current) {
        if(current > 100){
            System.out.println("입력 오류: 없는 채널 입니다.");
        } else {
            this.current = current;
        }
    }

    public int[] getCh() {
        return ch;
    }

    // 오버라이딩 연습
    @Override
    public String toString() {
        return "오버라이딩";
    }
    @Override
    public String sound(){
        return "TV dolby Sound";
    }
}
