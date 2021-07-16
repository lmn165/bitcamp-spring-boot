package com.example.demo.himart.domain;

import lombok.Data;

// DTO와 Service 묶음
public class PhoneApp {
    @Data class Phone{
        protected String kind, company, call;
        @Override public String toString() {
            return "집전화기{" +
                    "폰종류='" + kind + '\'' +
                    ", 제조사='" + company + '\'' +
                    ", 통화='" + call + '\'' +
                    '}';
        }
    }
    @Data class CellPhone extends Phone{
        protected boolean portable;
        protected String move;
        @Override public String toString() {
            return "휴대전화기{" +
                    "폰종류='" + kind + '\'' +
                    ", 제조사='" + company + '\'' +
                    ", 이동='" + move + '\'' +
                    ", 통화='" + call + '\'' +
                    '}';
        }
    }
    @Data class IPhone extends CellPhone{
        public final static String BRAND = "아이폰";
        protected String internet;
        @Override public String toString() {
            return "스마트폰{" +
                    "폰종류='" + BRAND + '\'' +
                    ", 이동='" + move + '\'' +
                    ", 통화='" + call + '\'' +
                    ", 검색='" + internet + '\'' +
                    '}';
        }
    }
    @Data class GalaxyNote extends IPhone{
        public final static String BRAND = "갤럭시폰";
        protected String pencil;
        @Override public String toString() {
            return "스마트폰{" +
                    "폰종류='" + BRAND + '\'' +
                    ", 이동='" + move + '\'' +
                    ", 통화='" + call + '\'' +
                    ", 검색='" + internet + '\'' +
                    ", 펜슬='" + pencil + '\'' +
                    '}';
        }
    }
}

