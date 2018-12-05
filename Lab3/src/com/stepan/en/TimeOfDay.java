package com.stepan.en;

public enum TimeOfDay {
    MORNING{
        public String sayTimeOfDay(){
            return "утром";
        }
    },
    DAY{
        public String sayTimeOfDay(){
            return "днем";
        }
    },
    EVENING{
        public String sayTimeOfDay(){
            return "вечером";
        }
    },
    NIGHT{
        public String sayTimeOfDay(){
            return "ночью";
        }
    };
    public abstract String sayTimeOfDay();
}
