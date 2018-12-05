package com.stepan.en;

public enum Status {
    STAYING{
        public String sayStatus(){
            return "стоит";
        }
        public String changeStatus(){
            return "сменил состояние. Теперь он стоит";
        }
    },
    SITTING{
        public String sayStatus(){
            return "сидит";
        }
        public String changeStatus(){
            return "сменил состояние. Теперь он сидит";
        }
    },
    BLOCKING{
        public String sayStatus(){
            return "облокочен";
        }
        public String changeStatus(){
            return "сменил состояние. Теперь он облокочен";
        }
    },
    FLYING{
        public String sayStatus(){
            return "летит";
        }
        public String changeStatus(){
            return "сменил состояние. Теперь он летит";
        }
    },
    LYING{
        public String sayStatus(){
            return "лежит";
        }
        public String changeStatus(){
            return "сменил сосотяние. Теперь он лежит";
        }
    }
    ;
    abstract public String sayStatus();
    abstract public String changeStatus();
}