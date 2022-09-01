class TapeDesk {
    boolean canRecord = false;

    void playTape() {
        System.out.println("Проигрывание");
    }

    void recordTape() {
        System.out.println("Запись");
    }
}

class TapeDeskTestDrive {
    public static void main(String[] args) {
        TapeDesk a = new TapeDesk();
        a.canRecord = true;
        if(a.canRecord == true) {
            a.playTape();
        }
    }
}
