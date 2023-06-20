package day230619;

class MyTv2_1 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME || volume < MIN_VOLUME) return;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        if (channel > MAX_CHANNEL || channel < MIN_CHANNEL) return;
        prevChannel = this.channel;
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    // 현재 채널을 이전 채널로 변경 기능
    public void gotoPrevChannel() {
        setChannel(prevChannel);
    }
}

class Exercise7_11 {
    public static void main(String args[]) {
        MyTv2_1 t = new MyTv2_1();
        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setChannel(20);
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
    }
}