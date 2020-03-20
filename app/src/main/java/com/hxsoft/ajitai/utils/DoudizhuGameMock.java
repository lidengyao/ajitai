package com.hxsoft.ajitai.utils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class DoudizhuGameMock {
    private static String[] cards = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "W"};
    // 每个号码的牌剩余张数
    private static Map<String, Integer> pokerBalance = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception {
        DoudizhuGameMock.initGame();
        DoudizhuGameMock.handle(new File(""));
        System.out.println(DoudizhuGameMock.getPokerBalance());
        ;
    }

    /**
     * 启动记牌器
     */
    public static void initGame() {
        System.out.println("棋牌已经启动");
        // 初始化计数器
        pokerBalance.clear();
        for (String card : cards) {
            if (card.equals("W")) {
                pokerBalance.put(card, 2);
            } else {
                pokerBalance.put(card, 4);
            }
        }
    }

    public static void handle(File imageFile) throws Exception {
        System.out.println("处理截屏图片" + imageFile);
        for (int i = 0; i < 3; i++) {
            String poker = cards[(int) (Math.random() * 15)];
            Integer count = pokerBalance.get(poker);
            if (count != null) {
                pokerBalance.put(poker, count - 1);
            }
        }
    }

    /**
     * 获取剩余牌数
     *
     * @return
     */
    public static Map<String, Integer> getPokerBalance() {
        return pokerBalance;
    }
}
