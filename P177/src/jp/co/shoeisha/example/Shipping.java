package jp.co.shoeisha.example;

/**
 * 送料計算用クラス。
 *
 * @author 翔泳社
 */
public class Shipping {

    /**
     * サイズSを表す定数。。。。
     */
    private static final int SIZE_S = 1;

    /**
     * サイズMを表す定数。
     */
    private static final int SIZE_M = 2;

    /**
     * サイズLを表す定数。
     */
    private static final int SIZE_L = 3;

    /**
     * 荷物の送料を計算する。
     *
     * @param weight
     *            重量
     * @param x
     *            荷物の縦幅
     * @param y
     *            荷物の横幅
     * @param z
     *            荷物の高さ
     * @return 荷物の送料
     */
    public int calculate(int weight, int x, int y, int z) {
        // 仕様1に対応。
        if (weight <= 0 || weight > 30) {
            throw new IllegalArgumentException();
        }
        // 仕様2に対応。
        int total = x + y + z;
        if (x <= 0 || y <= 0 || z <= 0 || total > 180) {
            throw new IllegalArgumentException();
        }

        // 仕様3に対応。
        // 重量だけから求めたサイズと
        // 3辺の合計だけから求めたサイズを比較して
        // 大きいサイズのものが
        // 荷物のサイズとなる。
        int weightSize = getWeightSize(weight);
        int totalSize = getTotalSize(total);
        int size = Math.max(weightSize, totalSize);

        int price;
        switch (size) {
        case SIZE_S:
            price = 600;
            break;
        case SIZE_M:
            price = 1200;
            break;
        default:
            price = 1800;
            break;
        }
        return price;
    }

    /**
     * 重量をベースとしたサイズを取得する。
     *
     * @param weight
     *            重量
     * @return 重量だけで求めたサイズ
     */
    private int getWeightSize(int weight) {
        if (weight <= 10) {
            return SIZE_S;
        } else if (weight <= 20) {
            return SIZE_M;
        } else {
            return SIZE_L;
        }
    }

    /**
     * 3辺の合計をベースとしたサイズを取得する。
     *
     * @param total
     *            3辺の合計
     * @return 3辺の合計だけで求めたサイズ
     */
    private int getTotalSize(int total) {
        if (total <= 60) {
            return SIZE_S;
        } else if (total < 120) {
            return SIZE_M;
        } else {
            return SIZE_L;
        }
    }

}
