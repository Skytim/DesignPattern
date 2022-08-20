package tim.tsai.structural.proxy.libary;

/** 視頻檔
 * @author timtsai
 * @date 2022/8/20
 */
public class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
